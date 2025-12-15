import java.util.Scanner;
public class CA4{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);
        for(int i=a+1;i<b;i++){
            System.out.print((char)i+ " ");
        }
    }
}