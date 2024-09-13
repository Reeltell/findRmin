import java.util.Random;

class Program {
    static final int SIZE = 1000; // Количество элементов
    static int MAX_VALUE = 10000; // Максимально возможное значение элемента

    public static void main(String[] args) {
        var array = new int[SIZE];

        // Заполнение массива случайными числами
        var random = new Random();
        for(int i = 0; i < SIZE; i++)
            array[i] = random.nextInt(0, MAX_VALUE
); // Числа в промежутке [0; MAX_VALUE]

        var minMultipleOf21 = MAX_VALUE
;
        var minMultipleOf7 = MAX_VALUE
;
        var minMultipleOf3 = MAX_VALUE
;
        var min = MAX_VALUE
;

        // Поиск минимально кратных чисел
        for (int num : array) {
            if (num % 21 == 0 && num < minMultipleOf21)
                minMultipleOf21 = num;
            if (num % 7 == 0 && num < minMultipleOf7)
                minMultipleOf7 = num;
            if (num % 3 == 0 && num < minMultipleOf3)
                minMultipleOf3 = num;
            if (num < min) min = num;
        }

        var firstPossibleR = 0;  // Случай 1: минимальное число массива, умноженное на минимальное кратное 21-му
        var secondPossibleR = 0; // Случай 2: минимальное кратное 3-м, умноженное на минимальное кратное 7-ми

        if (min != MAX_VALUE && minMultipleOf21 != MAX_VALUE)
            firstPossibleR = min * minMultipleOf21;
        if (minMultipleOf3 != MAX_VALUE && minMultipleOf7 != MAX_VALUE)
            secondPossibleR = minMultipleOf3 * minMultipleOf7;

        // нахождение минимального из двух возможных
        int result = Math.min(firstPossibleR, secondPossibleR);
        // вывод
        if (result != 0) System.out.println(result);
        else System.out.println(-1);
    }
}