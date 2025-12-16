import java.util.Scanner;
public class Di2{
    public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int dig = n;
       while(dig>=10){
        dig = dig /10;
    }System.out.println(dig);
}
}
