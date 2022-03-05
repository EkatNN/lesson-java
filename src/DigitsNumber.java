import java.util.Scanner;

public class DigitsNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ваше число: ");
        int number = scanner.nextInt();
        System.out.println("Сумма всех цифр числа: " + getAllSum(number));
        System.out.println("Сумма нечетных цифр числа: " + getOddSum(number));
        System.out.println("Максимальная цифра числа: " + maxDigit(number));
    }

    public static int getAllSum(int number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }

    public static int getOddSum(int number) {
        int count = 0;
        while (number != 0) {
            int oddSum = number % 10;
            number /= 10;
            if (oddSum % 2 != 0) {
                count += oddSum;
            }
        }
        return count;
    }

    public static int maxDigit(int number) {
        int max = number % 10;
        number /= 10;
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit > max) {
                max = lastDigit;
            }
            number /= 10;
        }
        return max;
    }
}


