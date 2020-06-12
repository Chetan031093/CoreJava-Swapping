/*
 * java programme on swapping with 3rd variable using addition and substraction operator.
 * 
 * output
swapping with 3rd variable
Programme sttarted
value before swapping
value of i is: 10
value of j is: 30
values after swapping
value of i is: 30
value of j is: 10
programme ended
 */


public class Lp4 
{
	public static void main(String[] args) 
	{
		System.out.println("swapping with 3rd variable");
		System.out.println("Programme sttarted");
		int i = 10;
		int j = 30;
		int temp = 0;
		System.out.println("value before swapping");
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("values after swapping");
		temp = i;
		i = j;
		j = temp;
		System.out.println("value of i is: "+i);
		System.out.println("value of j is: "+j);
		System.out.println("programme ended");
		
	}
}
