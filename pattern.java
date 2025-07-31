public class pattern {
    public static void main(String[] args) {
        for (int i = 0; i < 18; i++) {
            for(int j=0 ; j<i; j++){
            System.out.print( " *");
        }
        System.out.println();
    }
outerloop:
for(int i=0; i<9; i++){
int j=0;

while(j<=5){
    if(j==3) break outerloop;
    System.out.print(j+"");
    j++;
}
System.out.println();
}
    }}