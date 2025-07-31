
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class LearnMore {
   public static void main(String[] args) {
       ArrayList<String> fruits = new ArrayList<>();
      
       fruits.add("kiwi");
       fruits.add("mango");
       fruits.add("apple");
       fruits.add("banana");

       for (int i = 0; i <fruits.size(); i++) {
           System.out.println("Fruit is " +fruits.get(i));
       }
for(String fruit : fruits){

    System.out.println("for each fruits " + fruit);
}
    Iterator<String> fe = fruits.iterator();
     while(fe.hasNext()){
         System.out.println("iterator " + fe.next());
     }
     List<String> Smallest = fruits.subList(1, 6);{
        System.out.println(Smallest);
     }
   } 
}
