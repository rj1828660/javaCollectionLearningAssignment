import java.util.*;
import java.io.*;

class  LongestSubstring{
    public static int longestUnique(String str)
    {
        String temp= "";

       
        int maxLength = -1;

       
        if (str.isEmpty()) {
            return 0;
        }
       
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

          
            if (temp.contains(current)) {
                temp = temp.substring(temp.indexOf(current)
                        + 1);
            }
            temp = temp + String.valueOf(c);
            maxLength = Math.max(temp.length(), maxLength);
        }

        return maxLength;
    }

    
    public static void main(String[] args)
    {
        String str = "helloWorld2032";
        System.out.println("The input string is " + str);

        int len = longestUnique(str);
        System.out.println("The length of the longest "
                + "non-repeating character "
                + "substring is " + len);
    }
}

