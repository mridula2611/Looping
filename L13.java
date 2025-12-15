import java.util.Scanner;
public class L13{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int square =(int)Math.sqrt(num);
        if(square * square == num){
        System.out.println("is a perfect square");
        }
        else{
            System.out.println("Not a perfect square");
        }
    }
}