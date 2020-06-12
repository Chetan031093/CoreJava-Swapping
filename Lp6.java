
/*
 * java programme on swapping without 3red variable using multiplication and division operator.
 * 
 * output
 programme started
values before swapping
value of i is: 10
value of j is: 20
values after swapping
value of i is: 20
value of j is: 10
programme ended
 */


public class Lp6
{
	public static void main(String[] args) 
	{
		System.out.println("programme started");
		int i = 10;
		int j = 20;
		System.out.println("values before swapping");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		i = i*j;
		j = i/j;
		i = i/j;
		System.out.println("values after swapping");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("programme ended");
		
	}
}
