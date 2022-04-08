package constructor;

public class cs1 {
	
	int a;
	int b;
	int c;
	
	public cs1() {// zero parameter constructor
		
		a=100;
		b=200;
		c=300;
		
		System.out.println("running zero parameter constructor");
		
	}

   public cs1(int num) //constructor with one parameter
   {
	   
	   a=num;
	   
	   System.out.println("running one parameter constructor");
	   
   }
   public cs1(int num1, int num2) //constructor with two parameter
   
   { a=num1;
     b=num2;
	   
	   System.out.println("running two parameter contructor");
   }
   
   public cs1(int num1,int num2,int num3) //constructor with three parameter
   
   {  a=num1;
      b=num2;
      c=num3;
      
      System.out.println("running three parameter constructor");
	     }
   
   public static void main(String[] args) {
		
		
	cs1 s1= new cs1();
	s1.addition();
		
	cs1 s2=new cs1(500);
		s2.addition();
		
	cs1 s3=new cs1(200, 200);
	    s3.addition();
	
	cs1 s4=new cs1(100, 100, 100);
	    s4.addition();
	
	}

	public void addition() {
		
		int sum=a+b+c;
		
		
		System.out.println("Addition is "+sum);
		
	}
	
	
}
