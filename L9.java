import java.util.Scanner;
public class L9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int x = a;
        int y = b;
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        int lcm = x*y /a;
        System.out.println("Lcm: " + lcm);
    }
}