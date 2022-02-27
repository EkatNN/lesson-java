public class Cycle_for {

    public static void main (String[] args){
        for(int i = 100; i >0; i--){
            AllNumbersDivideBy4(i);
        }
    }
    public static int AllNumbersDivideBy4(int number) {
        if (number%4==0){
            System.out.println(number);
        }
        return number;
    }
}
