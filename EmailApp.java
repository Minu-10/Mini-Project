package emailapplication.com;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myobj=new Scanner(System.in);   //create a scanner object.
		System.out.println("Enter last name: ");
		String lname=myobj.nextLine();          //Read user input
		
		System.out.println("\nEnter first name: ");
		String fname=myobj.nextLine();
		
		Email em1=new Email(lname,fname);
		System.out.println(em1.showInfo());
		
		
		
		

	}

}
