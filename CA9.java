import java.util.Scanner;
public class CA9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int power = 0;
        int dec = 0;
        while(n>0){
            int rem = n%10;
            dec = dec + rem *(int)Math.pow(2,power);
            power++;
            n = n/10;
        }
        System.out.println(dec);
    }
}