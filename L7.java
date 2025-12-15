import java.util.Scanner;
public class L7{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int org = n;
        int sum = 0;
        while(n>0){
            int dig = n%10;
            count++;
            n/=10;
        }
        int u = org;
        while(org>0){
        int div = org%10;
        sum+=Math.pow(div,count);
        org/=10;
    }
    if(sum == u){
        System.out.println("Armstrong number");
    }else{
        System.out.println("Not an Armstrong number");
    }
    }
}