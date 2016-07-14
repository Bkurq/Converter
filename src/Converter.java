/**
 * Contains recursive methods for converting between decimal and binary numbers
 * @author bert2
 *
 */
public class Converter {
	
	/**
	 * A method that converts a number from decimal to binary
	 * @param number Number to be converted to binary
	 * @return string String containing binary number
	 */
	public static String convertToBinary(int number) {
		return convert(number, (int) Math.floor((Math.log(number) / Math.log(2)))); //computes the highest power of 2 in the number
	}
	
	/**
	 * Recursive method that converts from decimal to binary
	 * @param number Number to be converted
	 * @param power The highest power of 2 in the number
	 * @return String containing the binary number
	 */
	private static String convert(int number, int power) {
		if(power < 0) {
			return "";
		} else if(number - Math.pow(2, power) >= 0) {
			return "1" + convert((int) (number - Math.pow(2, power)), power - 1);
		} else {
			return "0" + convert(number, power - 1);
		}
	}
	
	/**
	 * A method that converts a number from binary to decimal
	 * @param number Number to be converted
	 * @return String containing converted number
	 */
	public static int convertToDecimal(String number) {
		return convertToDecimalRec(number);
	}
	
	private static int convertToDecimalRec(String number) {
		if(number.length() == 0) {
			return 0;
		} else {
			int temp = Integer.parseInt(number.substring(0, 1)); //first char in string to integer
			if(temp != 0 && temp != 1)
				throw new IllegalArgumentException("The number contains invalid characters");
			temp = (int) (temp * Math.pow(2, (number.length() -1)));
			return  temp + convertToDecimalRec(number.substring(1)) ;
		}
	}

}
