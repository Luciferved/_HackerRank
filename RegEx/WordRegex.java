import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class WordRegex
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        while(n>0)
		{
			String str = br.readLine();
			int t=Integer.parseInt(br.readLine());
			while(t>0)
			{
				String sub = br.readLine();
				int count=0;
				if(!sub.equals(""))
				{
					String pat =("\\W"+sub+"\\W");
					Pattern p = Pattern.compile(pat);
					Matcher m = p.matcher(str);
					while(m.find())
					{
						count++;
					}
					System.out.println(count);
					
				}
				t--;
            }
			n--;
        }
	}
}
