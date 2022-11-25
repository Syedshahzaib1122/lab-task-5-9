import java.util.Scanner;

class Login {

public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.print("Enter email: ");

String email = in.nextLine();

System.out.print("Enter password: ");

String password = in.nextLine();

String[][] userDetails = {

{"user1@gmail.com", "password1"},

{"user2@gmail.com", "password2"},

{"user3@gmail.com", "password3"},

{"user4@gmail.com", "password4"},

{"user5@gmail.com", "password5"}

};

boolean isValidUser = false;

for (int i = 0; i < userDetails.length; i++) {

if (userDetails[i][0].equals(email) && userDetails[i][1].equals(password)) {

isValidUser = true;

break;

}

}

if (isValidUser) {

System.out.println("Welcome!");

} else {

System.out.println("Invalid email or password.");

}

}

}