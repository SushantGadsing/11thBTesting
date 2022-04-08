
public class Nested_if_test1 {

	public static void main(String[] args)
	{
		String username= "Sushant";
		String password= "Sush%123";
		
		
		if (username=="Sushant") 
		{
			System.out.println("username is correct,please enter password");
		
			if(password=="Sush%123")
		{
			System.out.println("password is correct,login success");
		}
			else {
				System.out.println("correct the Password");
			}
		
		}
		else {
			System.out.println("please enter valid username");
		}
	}

}
