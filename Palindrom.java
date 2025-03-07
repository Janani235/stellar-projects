package day1;
import java.util.*;
public class Palindrom {
		public static void main(String[]args) {
			Scanner s=new Scanner(System.in);
			String str=s.nextLine();
			StringBuffer str1=new StringBuffer(str).reverse();
			if(str.equals(str1.toString())) {
				System.out.println("palindrom");
			}
			else {
		        System.out.println("not a palindrom");
		}

	  }
}


