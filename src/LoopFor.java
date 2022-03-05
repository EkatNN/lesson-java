public class LoopFor {
    public static void main(String[] args) {
        //Вывод числа
        for (int counter = 100; counter > 0; counter--) {
            if (divideBy4(counter) == true) {
                System.out.println(counter);
            }
        }
    }

    // Метод для сортировки чисел
    public static boolean divideBy4(int number) {
        boolean isDivideBy4;
        if (number % 4 == 0) {
            isDivideBy4 = true;
        } else {
            isDivideBy4 = false;
        }

        return isDivideBy4;
    }
}