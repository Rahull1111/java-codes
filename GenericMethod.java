public class GenericMethod {
   public static void main(String[] args) {
    printData("hello");
    printData(123);
   }
   static <E> void printData(E Data){
    System.out.println(Data);
   }
}
