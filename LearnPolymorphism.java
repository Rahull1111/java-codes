class data{

    int data;
    public void printData(){
        System.out.println(data);

        
        }
        public void printData(int times){
            for(int i=0; i<times ; i++){

                System.out.println(data);
            }
        }
    
}
class childData extends data{
public void printData(){
    System.out.println("overriden" +data);
}

}



public class LearnPolymorphism {
    public static void main(String[] args) {
        data d;
        d= new childData();
        d.printData();
        data d2 = new data();
        d2.printData(5);
    }
}
