package Java8.lamda.LambdaNdFuctionalInter;

public class LambdaAndFunctionInterface {
    public static void main(String[] args) {
        jeeva j = (a, b) -> {
            if(a<b){
                throw new RuntimeException();

            }
            else {
                return a-b;
            }
        };
        System.out.println(j.kj(10,5));




    }
}
interface jeeva {
   int  kj(int a,int b);
    default void m(){
        System.out.println("welcome");

    }
    static void k(){
        System.out.println("static");
    }

}