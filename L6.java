import java.util.Scanner;
public class L6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;
        int org = n;
        while(n>0){
            int dig = n%10;
            rev = rev * 10 + dig;
            n/=10;
        }
        if(org == rev )
        System.out.println("Palindrome");
        else 
        System.out.println("Not Palindrome");
    }
}