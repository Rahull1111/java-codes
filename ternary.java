public class ternary {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=4;
        int max = 0;
      max =  a > b ? a > c ? a : c : b > c ? b : c;
      System.out.println("value of max"+max);
    }
}
