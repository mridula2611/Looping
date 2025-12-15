import java.util.Scanner;
public class L14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int sum = 0;
        while(temp > 0){
            int dig = temp%10;
            int fact = 1;
            for(int i=1;i<=dig;i++){
                fact = fact * i;
            }
            sum+=fact;
            temp/=10;
        }
        if(num == sum){
            System.out.println("Strong number");
        }else{
            System.out.println("Not Strong number");
        }
    }
}