
public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) 
	{
		Statements obj = new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}

}

class Statements {
	void DecisionMakingStatements() {
		int x = 10;
		int y = 12;
		System.out.println("Using if-else...");
		if(x+y < 10) {
			System.out.println("x + y is less than 10");
		}
		else {
			System.out.println("x + y is greater than 10");
		}
		
		System.out.println();
		System.out.println("Using Switch Statements...");
		int num = 2;
		switch(num) {
		case 0:
			System.out.println("Number is 0");
			break;
		case 1:
			System.out.println("Number is 1 ");
			break;
		case 2 :
			System.out.println("Number is 2");
			break;
		default:
			System.out.println(num);	
		}
		
		System.out.println();
	}
	
	void LoopStatements() {
		System.out.println("Using Loop Statements..");
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum = sum+i;
		}
		System.out.println("The sum of first 10 natural numbers is " + sum);
		
		String[] names = {"Java", "C", "C++", "Python", "Javascript"};
		System.out.println("Printing the content of the array names.");
		
		System.out.println("Using For Loop...");
		for(String name : names) {
			System.out.println(name);
		}
		
		int i = 0;
		
		System.out.println("Using While Loop...");
		System.out.println("Printing the list of first 10 even numbers.");
		
		while(i <= 10) {
			System.out.println(i);
			i = i+2;
		}
		
		System.out.println("Using Do-While Loop...");
		i = 0;
		System.out.println("Printing the list of first 10 even numbers \n");
		do {
			System.out.println(i);
			i = i+2;
		} while(i<=10);
		System.out.println();
	}
	
	void JumpStatements() {
		System.out.println("Using Jump Statement...");
		
		System.out.println("Using Break Statements...");
		for(int i=0; i<=10; i++) {
			if(i==6) {
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("Using Continue Statements...");
		for(int i=0; i<=10; i++) {
			if(i==6) {
				continue;
			}
			System.out.println(i);
		}
	}
}