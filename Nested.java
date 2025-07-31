public class Nested {
    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=5;

        if (a>b){
            System.out.println("a is greater than b");
            if(a>c){
System.out.println("a is greater than c");
System.out.println("a is greatest"+ a);

            }else{
            System.out.println("c is greater than a");
            System.out.println("c is greatest"+ c);
              }else
                {System.out.println("b is greater than a");

            if (b>c){
System.out.println("b is greater than c");
System.out.println("b is greatest"+ b);

            }else{

                System.out.println("c is greater than b");
                System.out.println("c is greatest"+ c);
            }
            }
    }
}
}