package conditionals;
import java.util.Scanner;
public class switch1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();


        switch(num){
            case 1:
                System.out.println("hello");
                break;
            case 2 :
                System.out.println("bonjour");
                break;
            case 3:
                System.out.println("namaste");
                break;
            default:
                System.out.println("null");
        }
    }
}
