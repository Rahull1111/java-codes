
import javax.management.ObjectName;

public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();
       // obj.greeting();
       // obj.greeting("anuj");
        obj.greeting("rohit", count:5);
    }
    
}
class greet{

    void greeting(){

        System.out.println("hello,good morning");
    }
    void greeting(String name) {
for(int i=0 ; i<count; i++){
        System.out.println("HELLO,GOOD MORNING");
    }
}}