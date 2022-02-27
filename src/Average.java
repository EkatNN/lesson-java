import java.util.Scanner;

public class Average {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите начальную цифру диапозона: ");
        int begining = scanner.nextInt();
        System.out.print("Введите конечную цифру диапозона: ");
        int end = scanner.nextInt();
        int summ = 0;
        double result = 0;
        double diff = end - begining + 1;

        for (double counter = begining; counter <= end; counter++) {
            summ += counter;
            result = summ / diff;
        }
        System.out.println("Сумма всех значений = " + summ);
        System.out.println("Среднеарифметическое значение промежутка = " + result);

    }
}
