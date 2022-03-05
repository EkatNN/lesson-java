import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную цифру диапозона: ");
        int begining = scanner.nextInt();
        System.out.print("Введите конечную цифру диапозона: ");
        int end = scanner.nextInt();
        int sum = 0;
        double result = 0;
        double count = end - begining + 1;

        for (double counter = begining; counter <= end; counter++) {
            sum += counter;
        }
        result = sum / count;
        System.out.println("Среднеарифметическое значение промежутка = " + result);

    }
}
