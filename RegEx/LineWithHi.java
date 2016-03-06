/*



You are given N lines and your task is to find out which of the N lines starts with

hi<BLANK>
where hi is case-insensitive and is not immediately followed by a space and a letter d(or D). 
In the above representation, BLANK denotes a space character.

Input Format

First line contains an integer N. N lines follow each line with a sentence not more than 10 words W each, separated by a single space.

Constraints

1 <= N <= 10 
If C is the count of the number of words W in every sentence, then 
1 <= C <= 10 
Each non-empty character in W is either a lowercase or an uppercase letter only

Output Format

Print each line that satisfies the constraint as mentioned in the problem statement.

Sample Input

5
Hi Alex how are you doing
hI dave how are you doing
Good by Alex
hidden agenda
Alex greeted Martha by saying Hi Martha
Sample Output

Hi Alex how are you doing
First line satisfies the constraint mentioned in the problem statement. 
Second line fails as it contains a d next to

hi<blank>
Third line fails as it doesn't start with h 
Fourth line fails as the third character in the line is not empty ( BLANK ) 
Fifth line fails as Hi Martha doesn't appear at the beginning of the line.

*/

import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class LineWithHi
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str[] = new String[n];
		for(int i=0;i<str.length;i++)
		{
			str[i] = br.readLine();
		}
		
		
		for(int i=0;i<str.length;i++)
		{
		
			Pattern pat = Pattern.compile("^(h|H){1}(i|I){1} [^d]");
			Matcher m =pat.matcher(str[i]);
			if(m.find())
			{
				System.out.println(str[i]);
			}
		}
	}
}