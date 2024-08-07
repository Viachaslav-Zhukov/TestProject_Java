package Task_3;

import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем у пользователя ввод температуры в градусах Цельсия
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();

        // Запрашиваем у пользователя выбор конвертации
        System.out.print("Введите единицу для конвертации (K для Кельвинов, F для Фаренгейтов): ");
        char unit = scanner.next().toUpperCase().charAt(0);

        BaseConverter converter = new BaseConverter();
        double result;

        // Выполняем конвертацию на основе выбора пользователя
        switch (unit) {
            case 'K':
                result = converter.convertToKelvin(celsius);
                System.out.printf("%.2f градусов Цельсия = %.2f Кельвинов\n", celsius, result);
                break;
            case 'F':
                result = converter.convertToFahrenheit(celsius);
                System.out.printf("%.2f градусов Цельсия = %.2f Фаренгейтов\n", celsius, result);
                break;
            default:
                System.out.println("Неверная единица конвертации. Пожалуйста, выберите K для Кельвинов или F для Фаренгейтов.");
        }
    }

    /**
     * Метод для конвертации градусов Цельсия в Кельвины
     * @param celsius температура в градусах Цельсия
     * @return температура в Кельвинах
     */
    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    /**
     * Метод для конвертации градусов Цельсия в Фаренгейты
     * @param celsius температура в градусах Цельсия
     * @return температура в Фаренгейтах
     */
    public double convertToFahrenheit(double celsius) {
        return celsius * 9/5 + 32;
    }
}

