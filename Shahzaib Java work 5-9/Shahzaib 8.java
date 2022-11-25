import java.util.Scanner;

class Values {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter x value: ");

int x = input.nextInt();

System.out.print("Enter y value: ");

int y = input.nextInt();

System.out.println("x + y = " + (x + y));

System.out.println("x - y = " + (x - y));

System.out.println("x * y = " + (x * y));

System.out.println("x / y = " + (x / y));

}

}