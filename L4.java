import java.util.Scanner;
public class L4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pro = 1;
        if(n==0) 
        System.out.println(1);
        while(n>0){
            int dig = n%10;
            pro*=dig;
            n/=10;
        }
        System.out.println(pro);
    }
}