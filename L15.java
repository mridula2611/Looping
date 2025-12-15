import java.util.Scanner;
public class L15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int org = num;
        int a =num*num;
        int sum = 0;
        while(a>0){
            int dig = a %10;
            sum+=dig;
            a/=10;
        }
        if(org == sum)
        System.out.println("Neon number");
        else
        System.out.println("Not a neon number");
    }
}