/*
Increasing popularity of hackerrank can be seen in tweets like

I love #hackerrank
I just scored 27 points in the Picking Cards challenge on #HackerRank
I just signed up for summer cup @hackerrank
Given a set of most popular tweets, your task is to find out how many of those tweets has the string hackerrank in it.

*/


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class HackerRegEx
{
	public static void main(String args[])
	{
		Scanner src  = new Scanner(System.in);
		int n = src.nextInt();
		int count = 0;
		while(n>=0)
		{
			String s = src.nextLine();
			s = s.toLowerCase();
			if(s.matches(".*hackerrank.*"))		//returns true if the string contains exactly "word"
				count++;
			n--;
		}
		System.out.println(count);
	}
}