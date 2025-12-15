import java.util.Scanner;
public class L20{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num<=0){
            System.out.println("Not a power of 3");
            return;
        }
        while(num%3==0){
            num = num/3;
        }
        if(num == 1){
            System.out.println("Power of 3");
        }else{
            System.out.println("No power of 3");
        }
    }
}