public class StringBasics {
    public static void main(String[] args) {
        String name = "anuj";
String newName = new String("anuj");
System.out.println(name);
System.out.println(newName);
if(name== newName){

System.out.println("both are same");
}
if(name==newName){

   System.out.println("both are same");

}else{
    System.out.println("both are not same");
}
if(name.equals(newName)){
    System.out.println("both are same ");
}else{
    System.out.println("both are not same");
}
    }
}
