public class Palindrome2 {
    public static void main(String[] args) {
        String str="malayalam";
        int n=str.length();
        int i=0, j=n-1, flag=0;
        while(i < j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                flag = 1;
                break;
            }
            i++;j--;
        }
        if(flag == 0) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}
