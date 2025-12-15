import java.util.Scanner;
public class L17{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int org = num;
        int sum = 0;
        while(num>0){
            int dig = num% 10;
            sum+=dig;
            num/=10;
        }
        int fin = org % sum;
        if(fin == 0){
            System.out.println("Harshad number");
        }
        else{
            System.out.println("Not harshad number");
        }
    }
}