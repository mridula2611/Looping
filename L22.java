import java.util.Scanner;
public class L22{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result = 0;
        for(int i =1;i<=b;i++){
            result = result+a;
        }
        System.out.println(result);
    }
}