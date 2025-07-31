public class recursionExample {
   static int factorial(int n){

    if(n==0 || n==1){
        return 1;
    }
    else{

       int product = 1;
       for(int i=1;i<=n; i++){
        product *= 1;
       }
       return product;
    }
   } 
   public static void main(String[] args) {
    int n = 0;
    System.out.println("the value of factorial n is " +factorial(n));
    
   }
}
