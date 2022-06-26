import java.util.InputMismatchException;
import java.util.Scanner;

class GuessYear {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
        int cycleСontrol = 1;
        int numberPoints = 1;
        for (int numberOfAttempts = 1; cycleСontrol == 1; numberOfAttempts++) {
            System.out.println("Введите год в формате: уууу и через пробел количество дней");

                int yearEnteredUser = scanner.nextInt();
                int daysInYear = defineYear(yearEnteredUser);
                int daysEnteredUser = scanner.nextInt();

                    if (daysEnteredUser == daysInYear) {
                        System.out.println("Набрано очков: " + numberPoints);
                        numberPoints++;
                    } else {
                        System.out.println("Неправильно! В этом году " + daysInYear + " дней"
                                + "! Набрано очков: " + (numberPoints - 1));
                        break;
                    }
            }
        }catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные. Допустимы только числовые значения.");

        }
    }

    public static int defineYear(int year) {
        int daysInYear;
        if (year % 400 == 0) {
            daysInYear = 366;
        } else if (year % 100 != 0 && year % 4 == 0) {
            daysInYear = 366;
        } else {
            daysInYear = 365;
        }
        return daysInYear;
    }
}