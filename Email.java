package emailapplication.com;
import java.util.Scanner;

public class Email {
	private String firstname,password,lastname,department,email,alternateEmail,companySuffix = "@gmail.com";
	private int mailboxCapacity = 500,defaultPasswordLength = 10;
	
	//constructor to receive the first and last name
	public Email (String firstname,String lastname)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		
		//call a method for asking for department ...return department
		this.department=setDepartment();
		
		//call a method that retuns a random password
		this.password=randomPassword(defaultPasswordLength);
		System.out.println("Your password is:"+ this.password);
		
		//combine element to generate email
		email=firstname+lastname.toLowerCase() + "@" + department + "." + companySuffix;
		
		
	}
       //ask for the department
	private String setDepartment() {
		// TODO Auto-generated method stub
		System.out.print("\nDEPARTMENT CODES:\n1 for sales\n2 for Development\n3 for accounting\n4 for Information Technology\nEnter department code:");
		Scanner in= new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2) {return "dev";}
		else if(depChoice==3) {return "acct";}
		else if(depChoice==4) {return "tech";}
		else {return "";}
		//return null;
	}
	
	//generate a random password
	private String randomPassword(int length)
	{
		String passwordSet = "MinalSubhashBorhade!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length;i++)
		{
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
		
	}
	
	//set the mailbox capcity
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity=capacity;
	}
	
	//set the alternate email
	public void setAternteEmail(String altEmail)
	{
		this.alternateEmail=altEmail;
	}
	
	//change the password
	public void changePassword(String password)
	{
		this.password=password;
	}
	

	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}
	
	public String showInfo()
	{
		return "\nNew Employee:" +firstname+""+lastname+
		"\nCOMPANYEMAIL:"+email+
		"\nMAILBOXCAPACITY:"+mailboxCapacity+"mb\n";
	}
		
}
