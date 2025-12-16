import java.util.Scanner;
public class Di7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int org = n;
        int last = n%10;
        n/=10;
        int middle = (n%10);
        while(org>10){
            org=org/10;
        }
        System.out.println(last + ""+ middle + ""+ org);
    }
}