public class LearnMath {
public static void main(String[] args) {
   int a= 12;
   int b =13;
   System.out.println(Math.min(a, b)); 
   System.out.println(Math.sqrt(144));
   System.out.println(Math.max(a, b));
   System.out.println(Math.pow(12, 12));
   System.out.println(getRandom());
}
public static int getRandom() {
    return (int) (Math.random()*6);
}

}
