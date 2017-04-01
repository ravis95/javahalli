/**LOGIC:If the difference between the two numbers divides both the numbers perfectly(i.e Remainder should be equal to 0) then the difference is the HCF
else if it doesn't divide then the find the factors of the difference and the highest factor of difference which divides the two numbers is the HCF.*/
import java.util.*;
public class HCF 
{
public static void main(String[] args)
{
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the First number");
	int num1=input.nextInt();
	System.out.println("Enter the Second number");
	int num2=input.nextInt();
	int diff=0;
	int hcf=1;
	if(num2>num1)
	{
		diff=num2-num1;
	}
	else if(num1>num2)
	{
		diff=num1-num2;
	}
	System.out.println("");
	if(num1%diff==0 && num2%diff==0)
	{
		System.out.println("HCF is "+diff);
	}
	else 
	{
		for(int i=diff;i>=1;i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				System.out.println("The HCF OF ENTERED NUMBERS IS "+i);
				break;
			}
			else if(i==1)
				System.out.println("HCF is 1");
					
		}
	}
	
	
  }

}
