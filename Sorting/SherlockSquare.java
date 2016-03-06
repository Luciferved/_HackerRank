/*



Problem Statement

Watson gives a square of side length 1 to Sherlock. Now, after each second, each square of some arbitrary side L will break into four squares each of side L/2(as shown in the image below).

img

Now, Watson asks Sherlock: What will be the sum of length of solid lines after N seconds?

As the number can be large print result mod (109+7).

For example, after 0 seconds, the length is 4. 
After 1 second, the length is 6.

Input Format 
First line contains T, the number of testcases. Each testcase contains N in one line.

Output Format

For each testcase, print the required answer in a new line.

Constraints 
1≤T≤105 
0≤N≤109
Sample input

2
0
1
Sample output

4
6


*/


import java.util.*;
import java.math.*;
class SherlockSquare
{
	public static void main(String args[])
	{
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		while(n>0)
		{
			long no = src.nextLong();
			if(no == 0)
			{
				System.out.println(4);
			}
			else
			{
				System.out.println(((long)Math.pow(2,(int)no+1)+2)%1000000007L);
			}
			
			/*
			BigInteger no = src.nextBigInteger();
			if(no.intValue() == 0)
			{
				System.out.println("4");
			}
			else
			{
				int exp = no.intValue()+1;
				BigInteger Mod = new BigInteger("1000000007");
				BigInteger two = new BigInteger("2");
				BigInteger power = ((two.pow(exp)).add(two)).mod(Mod);
				System.out.println(power);
			}
			
			*/
		n--;
		}
	}
}

