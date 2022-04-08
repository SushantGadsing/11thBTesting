package constructor;

public class test {

	
	int a;
	int b;
	int c;
	
	
	public test() {// this is zero parameter constructor
		
		a=100;
		b=200;
		c=300;
		
		System.out.println("this is zero parameter constructor");
		
	}
	
	public test(int num) {// this is one parameter constructor
		
		a=num;
		
		System.out.println("running one parametr constructor");
		
	}
	
	public test(int num1,int num2) {//this is two parameter constructor
		
		a=num1;
		b=num2;
		
		System.out.println("running two parameter constructor");
		
		
	}
	public test(int num1,int num2,int num3) {//this is three parametet constructor
		
		a=num1;
		b=num2;
		c=num3;
		
		System.out.println("running three parameter");
	}
	
	
	
	public static void main(String[] args) {
		
		
		test s1=new test();
		s1.addition();
		
		test s2=new test(100);
		s2.addition();
		
		test s3=new test(100,200);
		s3.addition();
		
		test s4=new test(100, 200, 300);
		s4.addition();
		
		

	}
       public void addition() {
    	   
    	   int sum=a+b+c;
    	   
    	   System.out.println("addition is "+sum);
    	   
    	   
    	   
    	   
       }
       
}
