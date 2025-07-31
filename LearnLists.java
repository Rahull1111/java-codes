
import java.util.ArrayList;
import java.util.List;

public class LearnLists {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1);

        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1,200);
        System.out.println(list);
        list.add(1, 2000);
        System.out.println(list);
//System.out.println(list.size());
//System.out.println(list.contains(20));

    
   // list.remove(Integer.valueOf(1));
   // System.out.println(list);
}
}