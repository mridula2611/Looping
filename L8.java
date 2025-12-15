import java.util.Scanner;
public class L8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("Gcd: " + a);
    }
}