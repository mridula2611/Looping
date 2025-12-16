import java.util.Scanner;
public class Di9{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        int last = num % 10;
        num/=10;
        while(temp >0){
            int dig = temp % 10;
            if(dig<last){
               last = dig;
            }
               temp/=10;
        }
        System.out.println(last);
    }
}