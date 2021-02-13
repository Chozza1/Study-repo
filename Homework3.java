import java.util.Scanner;

public class Homework3 {
    static Scanner gues = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9");
        int a = (int) (Math.random() * 10);
        for (int i = 0; i < 3; i++) {
            System.out.println("Осталось попыток " + (3 - i));
            int answer = gues.nextInt();
            if (answer == a) {
                System.out.println("Вы угадали!");
                break;
            } else if (answer > a) {
                System.out.println("Загаданое число меньше");
            } else if (answer < a) {
                System.out.println("Загаданное число больше");
            }
        }
    }
}
//задать выбор после окончания игры 1 -играть еще раз, 2 - выйти ((switch, 2 метода, метка??)