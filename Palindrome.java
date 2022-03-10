import java.lang.*;
import java.io.*;
import java.util.*;
public class Palindrome
{
    public static void main(String[] args)
    {
        String str="malayalam";
        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        if(str.compareTo(sbr) == 0)
            System.out.println("palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}