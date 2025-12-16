import java.util.Scanner;
public class Di3{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int dig = n;
       while(dig>=10){
        dig = dig /10;
    }
    if(dig%2==0){
        System.out.println("Even");
    }
    else
    System.out.println("Odd");
}
}
