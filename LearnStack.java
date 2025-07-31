
import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("a");
         fruits.push("b");
          fruits.push("c");
           fruits.push("d");

           System.out.println(fruits.pop());
           System.out.println(fruits);
           System.out.println(fruits.peek());
           System.out.println(fruits.empty());
    }

}
