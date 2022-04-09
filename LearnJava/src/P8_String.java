

/* Problem Statement:

P8_String: 

(Create separate logic in separate function)

F1 - Check the entered string is palindrome or not? 
  		String s = "75457"
  		Output: Yes it is a palindrome or No it is not a palindrome.

F2 - Make a reverse of a string using?
F3 - String Compare: Check if the strings are equal or not?

 * */

public class P8_String {

	public static void main(String[] args) {

		QuestionsOnString obj = new QuestionsOnString();

		String s1 = new String("75467");
		String s2 = new String("7545a");

		obj.palindromeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1, s2);

	}

}

class QuestionsOnString {

	void palindromeOrNot(String s) 
	{
		int i=0;int j=s.length()-1;
		int flag=0;
		while(i<j)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				i++;
				j-- ;
			}
			else
			{
				System.out.println("No it is not a palindrome");
				flag=1;
				break;
			}
		}
		if(flag==0)
		{
			System.out.println("Yes it is a palindrome");
		}
	}

	void reverseOfAString(String s) {
		String ans="";
		for(int i=s.length()-1;i>=0;i--)
		{
			ans+=s.charAt(i);
		}
		System.out.println(ans);
	}
	
	void stringEqualOrNot(String s1,String s2) 
	{
		if(s1==s2)
		{
			System.out.println("Strings are equal");
		}
		else
		{
			System.out.println("Strings are not equal");
		}
	}
}