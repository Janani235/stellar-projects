import java.util.Scanner;
public class Triangle {

 public static void main(String[]args) {
	       Scanner sc=new Scanner(System.in);
	        int n1=sc.nextInt();
	        int n2=sc.nextInt();
	        int n3=sc.nextInt();
	 if(n1+n2+n3==180) {
		 if(n1==90||n2==90||n3==90) {
		    System.out.println("prize 2,right angle triangle ");
		 }
		 else if(n1==n2&&n2==n3&&n2==n3) {
			 System.out.println("prize 3,equilateral triangle");
			 
			 
		 }
		 else {
			 System.out.println("prize 1,any triangle");
		 }
	 }
 }        
}

