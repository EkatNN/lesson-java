import java.util.Scanner;

public class Digits_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число: ");
        int number = scanner.nextInt();
        System.out.println(getAllSum(number));
        System.out.println(getOddSum(number));
    }
    public static int getAllSum(int number){
        int sum =0;
        while(number!= 0){
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }

    public static int getOddSum (int number){
        int oddSum =0;
        int count = 0;
        while(number!=0){
            oddSum = number%10;
            number/=10;
            if (oddSum%2!=0){
                count +=oddSum;
            }
        }
        return count;
    }
}


