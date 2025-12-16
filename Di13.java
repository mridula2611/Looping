import java.util.Scanner;
public class Di13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int result = 0;
        int place = 1;
        while(a!=0){
            int dig = a%10;
            if(dig!=0){
                result = result + dig * place;
                place = place * 10;
            }
            a=a/10;
        }System.out.println(result);
    }
} 