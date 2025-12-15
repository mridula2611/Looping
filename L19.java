import java.util.Scanner;
public class L19{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        while(num>9){
            int sum = 0;
        while(num>0){
            sum = sum + (num%10);
            num = num/10;
        }
        num = sum;
        }
        if(num==1){
            System.out.println("Magic number");
        }else{
            System.out.println("Not a magic number");
        }
    }
}