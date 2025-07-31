
import java.util.LinkedList;
import java.util.Queue;


public class LearnQueue {
    public static void main(String[] args) {
        Queue<Integer> math = new LinkedList<>(); 
            math.offer(12);
             math.offer(13);
             math.offer(14);
math.offer(15);
while(!math.isEmpty()){
    System.out.println(math.poll());
}
System.out.println(math);
System.out.println(math.poll());
System.out.println(math);
System.out.println(math.peek());
System.out.println(math);
        }
    }

