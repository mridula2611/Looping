import java.util.Scanner;
public class Di5{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int prev = n%10;
        n=n/10;
        boolean f = false;
        while(n>0){
            int cur = n%10;
            if(cur>prev){
            System.out.println("Not in ascending order");
            break;
            }
            else{
            prev = cur;
            n/=10;
            f = true;
            }
        }
        if(f){
            System.out.println("Ascending order");
        }
    }
}