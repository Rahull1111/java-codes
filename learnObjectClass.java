class car{

  int year;
  String model;  
  public car(String model,int year){
this.model=model;
this.year=year;
  }
  public int hashCode(){

    int initialNumber = 31;
    initialNumber+=year;
    initialNumber+=model.hashCode();
    return initialNumber;

  }
 /*  public boolean equals(Object obj){

    car that = (car)obj;
    if (this.model.equals(that.model) && this.year == that.year){
        return true;
    }
    return false;*/
}
 // public String toString(){
   // return "car ka model " +model+ " and year is "+year;
  //}
//}
public class learnObjectClass {
    public static void main(String[] args) {
        car obj = new car("honda" ,2022);
        car obj2 = new car("honda" , 2022);
        System.out.println(obj.hashCode() );
        System.out.println(obj2.hashCode());
        System.out.println(obj.equals(obj2));
    }
}
