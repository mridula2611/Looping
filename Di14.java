import java.util.Scanner;
public class Di14{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = n;
        int square = 0;
        int cube = 0;
        while(temp!=0){
            int dig = temp%10;
            square += dig* dig;
            cube += dig*dig*dig;
            temp = temp/10;
        }
        System.out.println("Squareroot: " + square);
        System.out.println("Cuberoot: " + cube);
        scan.close();
    }
}