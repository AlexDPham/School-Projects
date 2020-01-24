// 11/3/2019 Done only by Alex Pham

import java.util.Scanner;
import java.util.Random;
public class BobcatHotel {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);

		Random rand = new Random();

		int num1 = 0;
		double preliminary, clubprice = 0, discount = 0, roomprice = 0 ;

		System.out.println("Welcome to Bobcat Hotel");
		System.out.println("Here are our prices");
		System.out.println("1) Single : $50.50 per night");
		System.out.println("2) Double : $75.00 per night");
		System.out.println("3) Queen : $100.75 per night");
		System.out.println("4) King : $150.25 per night");
		System.out.println("5) Masters Suite : $225.50 per night");

		System.out.println("");

		System.out.print("\nHow many guests will you have?");
		int guests = kbd.nextInt();
		System.out.print("Select the room you would like by typing the number next to the room plan.");
		double room = kbd.nextInt();
		System.out.print("How many nights do you plan on staying?");
		double nights = kbd.nextInt();
		System.out.print("Are you a AAA Member? Press 1 if yes or Press 0 if not.");
		int AAA = kbd.nextInt();
		System.out.print("Are you a club member? Press 1 if yes or Press 0 if not.");
		double club = kbd.nextInt();


		// random number

		if (club == 1)  
		{ num1 = rand.nextInt(10);
		num1 = num1 + 1;
		if (nights/4 >= 1 && num1 > 4)
			System.out.println("Congradulations you qualify for our stay 4 nights get 1 free discount");
		} else {
			System.out.println("Sorry you do not qualify for our stay 4 nights get 1 free discount");

		}



		System.out.println("");

		System.out.println("\nMeal plans");
		System.out.println("0) Complementary: Free");
		System.out.println("1) Standard: $30"); 
		System.out.println("2) Deluxe: $50");
		if (room == 5) {
			System.out.println("3) Indulgence: $85");
		}

		System.out.println("Select your desired meal plan");
		int meal = kbd.nextInt();

		// rooms boolean examples here
		// ------------------------------------------------------------------------------------------------------

		if (room == 1) {
			roomprice = 50.5;

		} else if (room == 2) {
			roomprice = 75;

		} else if (room == 3) {
			roomprice = 100.75;

		} else if (room == 4) {
			roomprice = 150.25;

		} else if (room == 5) {
			roomprice = 225.50;

		}



		// MEALS (Uses Switch)
		// --------------------------------------------------------------------------------------------------------


		switch (meal) {
		case 0:
			meal = 0; 
			break;
		case 1: 
			meal = 30;
			break;
		case 2: 
			meal = 50;
			break;
		case 3:
			meal = 85;
			break;
		default:
			meal = 0;
		}








		// Club Member Discount



		if (club == 0 && nights/4 >= 1) {
			clubprice = 0;
		} else if (nights/4 >= 6  && num1 > 4) {
			clubprice = (roomprice*6);
		} else if (nights/4 >= 5  && num1 > 4) {
			clubprice = (roomprice*5);
		} else if (nights/4 >= 4  && num1 > 4) {
			clubprice = (roomprice*4);
		} else if (nights/4 >= 3  && num1 > 4) {
			clubprice = (roomprice*3);
		} else if (nights/4 >= 2  && num1 > 4) {
			clubprice = (roomprice*2);
		} else if (nights/4 >= 1  && num1 > 4) {
			clubprice = (roomprice*1);
		} else if (club == 1 && nights/4 >= 1  && num1 > 4){
			clubprice = roomprice;
		}






		// AAA DISCOUNT

		preliminary = (roomprice*nights)+meal*guests*nights;




		if (AAA == 1) {
			discount = (.10*(preliminary));
		} else if (AAA!= 1) {
			discount = (0);
		}

		// FINAL PRODUCT



		System.out.println("\nCheckout");
		System.out.println("Room cost:		$" + roomprice*nights);
		System.out.println("Meal cost:		+$" + meal*guests*nights);
		System.out.println("Preliminary Total Cost:	$" + preliminary);
		System.out.println("AAA Discount:		-$" + discount);
		System.out.println("Club Member Discount:	-$" + clubprice);


		System.out.print("Grand Total:		$");
		System.out.print(preliminary - discount - clubprice);



	}

}






