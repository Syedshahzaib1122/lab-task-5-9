import java.util.Scanner;

class Menu {

public static void main(String[] args) {

int choice;

Scanner scanner = new Scanner(System.in);

System.out.println("Please select an option from the menu below:");

System.out.println("1. Chicken");

System.out.println("2. Beef");

System.out.println("3. Vegetarian");

System.out.println("4. Exit");

choice = scanner.nextInt();

switch (choice) {

case 1:

System.out.println("The price of chicken is $10.");

break;

case 2:

System.out.println("The price of beef is $12.");

break;

case 3:

System.out.println("The price of the vegetarian option is $8.");

break;

case 4:

System.out.println("Thank you for visiting our restaurant!");

break;

default:

System.out.println("Please select a valid option from the menu.");

}

}

}