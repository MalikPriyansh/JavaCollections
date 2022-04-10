
public class P3_Task01_VariablesAndDataTypesinJava {

	static int q = 11;
	int p = 10;
	public static void main(String[] args) 
	{
		// Valid Declarations
		int a,b;
		float pi;
		double d;
		char c;
		
		// Valid Initialization
		pi=3.14f;
		d=20.22d;
		c = 'v';
		
		a=10;
		b=20;
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(pi);
		System.out.println(d);
		System.out.println(c);
		
		int myNum = 5;
		float myFloatNum = 5.99f;
		char myletter = 'D';
		boolean myBool = true;
		String myText = "Hello";
		
		System.out.println(myNum);
		System.out.println(myFloatNum);
		System.out.println(myletter);
		System.out.println(myBool);
		System.out.println(myText);
		
		double f;
		int i = 10;
		f = i; // Type Conversion
		
		double g = 10;
		int j;
		j = (int) g; // Type Casting
		
		System.out.println(f);
		System.out.println(i);
		System.out.println(g);
		System.out.println(j);
		
		byte k = 10; // 1 byte
		boolean l = true; // 1 bit = true or false only
		long m = 10L;
		float n = 1.2f;
		double o = 1.2d;
		
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		System.out.println(m);
		System.out.println(o);
		
		System.out.println(ADb.j); // data+functions/methods
		// ADb.display();
		
		ADb obj1 = new ADb();
		System.out.println(obj1.i++);
		System.out.println(obj1.i);
		
		ADb obj2 = new ADb();
		System.out.println(obj2.i);
		
		System.out.println(ADb.j++);
		System.out.println(ADb.j);
		
		ADb.typeConversionAndTypeCasting();
		
	}
	
	int r = 10;
	void display()
	{
		int a = 5; // local Variable
		System.out.println("This is Display Method!");
		System.out.println(a);
		
	}
}

class ADb {
	static int j = 10; // class Variable or Static Variable
	int i = 10; // Instance Variable
	
	static void display() {
		int a = 5; // local Variable;
		System.out.println("This is Display Method!");
		System.out.println(a);
	}
	
	static void typeConversionAndTypeCasting()
	{
		double f; // 64 slots
		int i = 10; // 32 slots
		f = i; // Type Conversion
		System.out.println(f);
		
		double g = 10; //64
		int j; // 32
		j=(int)g; // Type Casting
		
		// 32 bits = 64 bits
		
		System.out.println(i);
		System.out.println(j);
		
	}
}
