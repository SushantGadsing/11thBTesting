package abstract_study;

public class concrete extends Abstract_demo
{


	public static void main(String[] args) {
		
		
		concrete c=new concrete();
		      c.test();
		      c.test1();
		      c.test3();
		
	}
	
	
	
	
	
	public void test3() {
		
		System.out.println("this incomplete method is called in concrete class");
	}

}
