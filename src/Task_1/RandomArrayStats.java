package Task_1;

import java.util.Arrays;

public class RandomArrayStats {
    public static void main(String[] args) {
        int arraySize = 10; // Задаем размер массива
        double[] array = new double[arraySize];

        // Заполняем массив случайными числами
        for (int i = 0; i < arraySize; i++) {
            array[i] = Math.random();
        }

        // Находим минимальное, максимальное и среднее значение
        double min = array[0];
        double max = array[0];
        double sum = 0;

        for (double num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
            sum += num;
        }

        double average = sum / arraySize;

        // Выводим результаты
        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}

