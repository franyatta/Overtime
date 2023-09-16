
//This program calculates the wages based on the number of hours
//Assuming you get paid 1.5x for overtime
import java.util.Scanner;

public class Overtime {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double hours, rate, wages;

		System.out.print("How much do you get paid per hour? $");
		rate = input.nextInt();

		System.out.print("How many hours did you work: ");
		hours = input.nextInt();
		input.close();

		if (hours <= 40) {
			// calculate wages normally
			wages = hours * rate;
		} else {
			// calculate the wages and the overtime payment
			wages = 40 * rate + ((hours - 40) * (rate * 1.5));

			System.out.print("Your wages will be $" + wages);
		}
	}

}
//franyatta