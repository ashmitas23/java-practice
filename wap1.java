package conditionals;
import java.util.Scanner;
public class wap1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number");
        int num= sc.nextInt();
        if (num==1)
            System.out.println("hello");
        else if (num==2)
            System.out.println("namaste");
        else if (num==3)
            System.out.println("bonjour");
        else
            System.out.println("invalid");
    }
}
