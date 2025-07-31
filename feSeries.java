import java.util.Scanner;
public class feSeries {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

System.out.println("enter the no. of terms");
int n = sc.nextInt();
int first =0 , second =1;
System.out.println("fibonacci series up to" +n+ "terms") ;



for(int i=0; i<=n; i++){

System.out.println(first+ "");
int next = first+ second;
first = second;
second=next;
}
sc.close();
}
}