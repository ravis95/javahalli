import java.util.*;
public class CountVaariousCharacters 
{
    
	public static void main(String[] args) 
	{
		int small=0;
	    int capital=0;
	    int symbol=0;
	    int number=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=input.next();
		int m=s1.length();
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
			{
				small++;
			}

			else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				capital++;
			}
			else if(s1.charAt(i)>='0' && s1.charAt(i)<='9')
			{
				number++;
			}
			else
				symbol++;
				
		}
		System.out.println("Number of lower case Alphabets is"+small);
		System.out.println("Number of upper case Alphabets is"+capital);
		System.out.println("Number of Numbers is"+number);
		System.out.println("Number of  Special symbols is"+symbol);
		}

}
