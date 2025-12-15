import java.util.Scanner;
public class CA8{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int bin = 0;
        int place = 1;
        while(n>0){
            int rem = n%2;
            bin = bin + rem * place;
            place = place * 10;
            n = n/2;
        }
        System.out.println(bin);
    }
}