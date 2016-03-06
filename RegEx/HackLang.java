/*


Every submission at hackerrank has a field called language which indicates the language in which a hacker has made his submission at hackerrank

C:CPP:JAVA:PYTHON:PERL:PHP:RUBY:CSHARP:HASKELL:CLOJURE:BASH:SCALA: ERLANG:CLISP:LUA:BRAINFUCK:JAVASCRIPT:GO:D:OCAML:R:PASCAL:SBCL:DART: GROOVY:OBJECTIVEC

Sometimes, error prone API requests has an invalid language field. Could you find out if a given submission has a valid language field or not.

Input Format

First line contains N. N API requests follow, each in a newline. Each request has an integer api_id and a string language which are the request parameters placed by the an API request.

Constraints

1 <= N <= 100  
10^4 <= api_id < 10^5  
a valid language is any of the languages listed above (case sensitive)

Output Format

For every api request given in input, print "VALID" if it has a valid language string in it or print "INVALID" otherwise.

Sample Input

3
11011 LUA
11022 BRAINFUCK
11044 X
Sample Output

VALID
VALID
INVALID
*/


import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class HackLang
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		
		while(no>0)
		{
			String str = br.readLine();
			String pat="\\b(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)\\b";
			Pattern p = Pattern.compile(pat);
			Matcher m = p.matcher(str);
			
			if(m.find())
			{
				System.out.println("VALID");
			}
			else
			{
				System.out.println("INVALID");
			}
			no--;
		}
	}
}