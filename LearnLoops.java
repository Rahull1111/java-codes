
import java.util.Scanner;

public class LearnLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no.");
        int n = sc.nextInt();
        //for(int i = 0; i<=10; i++)

        //System.out.println(n+ " * " +i+ " = " +i*n);
    int sum = 0;
        for(int i=1; i<=n; i++) {

            sum = sum + 2*i ;
        } 
        
System.out.println("the sum"+sum);
    }
}
