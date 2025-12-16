import java.util.Scanner;
public class Di4{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        int num = scan.nextInt();
        int target =scan.nextInt();
        int temp = num;
        int found = 0;
        while(temp>=10){
           int dig = temp%10;
           if(dig == target){
           found++;
        }temp = temp/10;
        }
        System.out.println(found);
    }
}