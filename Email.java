package day1;
import java.util.Scanner;
public class Email {
		public static void main(String[]args) {
			Scanner s=new Scanner(System.in);
			String email =s.nextLine();
			System.out.println(email);
			if(email.contains("com") || email.contains("in") || email.contains("net") || email.contains("org")){
				System.out.println("Valid email address");
			}
			else {
				System.out.println("Invalid email addres");
				}
	}
	}

