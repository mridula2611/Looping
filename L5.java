import java.util.Scanner;
public class L5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int rev = 0;
        while(n>0){
            int dig = n%10;
            rev = rev * 10 + dig;
            n/=10;
        }
        System.out.println(rev);
    }
}