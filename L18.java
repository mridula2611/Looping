import java.util.Scanner;
public class L18{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int end = num%10;
        int div = num % 7;
        if(end == 7 || div == 0){
            System.out.println("Buzz number");
        }
        else{
            System.out.println("Not Buzz number");
        }
    }
}