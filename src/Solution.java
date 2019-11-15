 import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        Pattern p;
        Matcher m;
        boolean b = false;
        String html = "<(.+)>([^<]+)</\\1>";
    	while(testCases>0){
            b=false;
			String line = in.nextLine();
            try
            {
                 p = Pattern.compile(html);
                 m = p.matcher(line);
                 while(m.find())
                 {
                     System.out.println(m.group(2));
                     b= true;
                 }
                 if(!b)
                 {
                     System.out.println("None");
                 }
                 
            }
            catch(Exception e)
            {
                e.printStackTrace(); 
            }
           
            
			
			testCases--;
		}
	}
}


