package Task_4;

public class ClockAngleCalculator {
    public static void main(String[] args) {
        // Пример использования метода
        int hours = 3;
        int minutes = 15;
        double angle = calculateAngle(hours, minutes);
        System.out.printf("Угол между часовой и минутной стрелками для %02d:%02d составляет %.2f градусов\n", hours, minutes, angle);
    }

    /**
     * Метод для вычисления угла между часовой и минутной стрелками часов
     * @param hours часы
     * @param minutes минуты
     * @return угол между стрелками в градусах
     */
    public static double calculateAngle(int hours, int minutes) {
        // Нормализуем часы в диапазоне от 0 до 11
        hours = hours % 12;

        // Вычисляем угол для часовой стрелки (каждый час - 30 градусов плюс часть от минут)
        double hourAngle = (hours * 30) + (minutes * 0.5);

        // Вычисляем угол для минутной стрелки (каждая минута - 6 градусов)
        double minuteAngle = minutes * 6;

        // Вычисляем разницу между углами
        double angle = Math.abs(hourAngle - minuteAngle);

        // Угол не должен превышать 180 градусов
        if (angle > 180) {
            angle = 360 - angle;
        }

        return angle;
    }
}

