import javax.sound.midi.Soundbank;
import java.util.*;
public class stringmethods {
    public static void main(String[] args) {
        String name="Adithya";
        String name4=" hello ";
        int len=name.length();
        System.out.println("The length of String is "+len);
        String name2=" is a good boy";
        String name3=name.concat(name2);
        System.out.println("New string after concatenation is "+name3);
        String name5=name+name2;
        System.out.println("New string after concatenation is "+name5);
        char a=name.charAt(5);
        System.out.println("Character @ specified index is "+a);
        System.out.println("Substring "+name.substring(1,5));
        int b=name3.indexOf("is");
        System.out.println("First occurrence of 'is' "+b);
        System.out.println(name4.equals(name));
        int out=name.compareTo(name4);
        System.out.println(name4.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.replace('A','g'));
    }
}
