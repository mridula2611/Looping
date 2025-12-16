import java.util.Scanner;
public class Di15{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n==0){
            System.out.println("Zero");
            return;
        }
        if(n<0){
            System.out.println("Negative number");
            n=-n;
        }
        int rev = 0;
        int temp = n;
        while(temp!=0){
            int dig = temp %10;
            rev = rev * 10 + dig;
            temp/=10;
        }
        while(rev!=0){
            int dig = rev%10;
            switch(dig){
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("two "); break;
                case 3: System.out.print("three "); break;
                case 4: System.out.print("four "); break;
                case 5: System.out.print("five "); break;
                case 6: System.out.print("six "); break;
                case 7: System.out.print("seven "); break;
                case 8: System.out.print("eight "); break;
                case 9: System.out.print("nine "); break;
            }
            rev/=10;
        }
        scan.close();
    }
}