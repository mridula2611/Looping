import java.util.Scanner;
public class Di11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        boolean eve = false;
        boolean odd = false;
        if(num == 0){
           eve = true;
        }
        int temp=num;
        while(temp > 0){
            int dig = temp %10;
            if(dig %2==0){
            eve = true;
        }
            else{
            odd = true;
        }
        temp/=10;
        }
        if(eve && odd)
        System.out.println("Mixed numbers");
        else if(eve)
        System.out.println("Even numbers");
        else
        System.out.println("Odd number");
    }
}