import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner in = new Scanner(System.in);
				System.out.println("Enter (d)ecimal, (b)inary or (q)uit:");
				String input = in.nextLine();
				if (input.equals("d")) {
					System.out.println("Enter a decimal number: ");
					int temp = in.nextInt();
					System.out.println(temp + " in binary is " + Converter.convertToBinary(temp) + "\n");
				} else if (input.equals("b")) {
					System.out.println("Enter a binary number: ");
					String temp = in.nextLine();
					System.out.println(temp + " in decimal is " + Converter.convertToDecimal(temp) + "\n");
				} else if (input.equals("q")) {
					System.exit(0);
				}
			} catch (Exception e) {
				System.out.println("Invalid input. Read instructions carefully and try again :D\n");
			}
		}

	}

}
