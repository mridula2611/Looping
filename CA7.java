import java.util.Scanner;
public class CA7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int cou=0;
        int df =0;
        while(x!=0){
            int dig = x%10;
            if(dig==0)
            cou++;
            else
            df++;
            x/=10;
        }
        System.out.println("Number of ones: " + df);
        System.out.println("Number of zeros: " + cou);
    }
}