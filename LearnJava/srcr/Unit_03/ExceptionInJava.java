package Unit_03;

public class ExceptionInJava {

	public static void main(String[] args) {
		A obj = new A();
		obj.ArithmeticException();
		obj.stackoverflowerror(2);
		obj.manualExceptionthrow();
	}

}

class A{
	void ArithmeticException() {
		try{
			int b=0;
			int a = 100/b;
			System.out.println(a);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("done");
	}
	
	void stackoverflowerror(int a) {
		try {
			if(a>0) {
				a++;
				stackoverflowerror(a);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	void manualExceptionthrow() {
		try {
			calculateArea(0,0,0);
		}
		catch(ManualException e) {
			System.out.println(e.getMessage());
		}
	}
	
	void calculateArea(int l,int b,int h) throws ManualException{
		if(l<0 || b<0 || h<0) {
			throw new ManualException();
		}
		else {
			int area = l*b*h;
			System.out.println("The area is "+area);
		}
	}
	
	void useofthrow(int x) throws Exception{
		if(x<18)
		{
			throw new Exception();
		}
		else {
			System.out.println("You are allowed to vote");
		}
	}
	
	void checkedAndunchecked() {
		//here this is the unchecked exception which is not detected by the compiler 
		int x = 10;
		int y = 0;
		int z = x/y;
		System.out.println(z);
		// So here is an arithmetic exception which will be catched during runtime 
		
		try {
			useofthrow(19);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		// here this is the checked exception which will be detected during compile time
	}
}

class ManualException extends Exception{
	public String getMessage() {
		String detailMessage = "Exception Occured";
		return detailMessage;
	}
}