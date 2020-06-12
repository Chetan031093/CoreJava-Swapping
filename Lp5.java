
/*
 * java programme on swapping without 3rd variable using addition and substraction operator.
 * 
 * output
 * swapping without 3rd variable
programme started
values before swapping
value of i is: 10
value of j is: 40
values after swapping 
value of i is: 40
value of j is: 10
programme ended
 */
public class Lp5 
{
	public static void main(String[] args)
	{
		System.out.println("swapping without 3rd variable");
		System.out.println("programme started");
		int i = 10;
		int j = 40;
		System.out.println("values before swapping");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("values after swapping ");
		i = i+j;
		j = i-j;
		i = i-j;
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("programme ended");
	}
}
