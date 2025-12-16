import java.util.Scanner;
public class Di3{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int target =scan.nextInt();
        int temp = num;
        boolean found = false;
        while(temp>=10){
           int dig = temp%10;
           if(dig == target){
           found = true;
           break;
        }temp = temp/10;
        }
        if(found)
        System.out.println("Found");
        else
        System.out.println("Not found");
    }
}