package control_system;

public class Irctc {

	public static void main(String[] args) {
		
		  		//user name
				//password
				//captcha
		
		
		String Username="Sushant";
		String Password= "Sush@123";
	    int captcha= 21217;
		
		if (Username=="Sushant")
		
			{
			 System.out.println("Enter password");
			
			   if (Password=="Sush@123")
			    {
				System.out.println("enter Captha");
				
				 if (captcha==21217)
				  {
					System.out.println("Login successfull");
				}
				 else {
					 System.out.println("incorrect captcha");
				 }
			}
			   else { System.out.println("Incorrect Password");
			   }  
		}
		else {
			System.out.println("incorrect Username");
		}
	}

}
