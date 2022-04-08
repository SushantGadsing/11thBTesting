package control_system;

public class ifelsestudy {

	public static void main(String[] args) {
		
      char grade='a';
      if (grade=='a')
      {
    	  System.out.println("your marks are>=75");
      }
      
      else if (grade=='b')
    {
    	  System.out.println("your marks are>=60 & =<75");
      }
      else if (grade=='c') 
      {System.out.println("your mark is>40 & <60");
    	  
      }
      else {
    	  System.out.println("you are fail");
      }
	}
	

}
