import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 0 до 9");
        GuesNumber();
    }
    static Scanner gues = new Scanner(System.in);
    public static void GuesNumber() {
        int a = (int) (Math.random() * 10);
        for (int i = 0; i < 3; i++) {
            System.out.println("Осталось попыток: " + (3 - i));
            int answer = gues.nextInt();
            if (answer == a) {
                System.out.println("Вы угадали!");
                break;
            } else if (answer > a) {
                System.out.println("Загаданое число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
        }
        GuesInt();
    }
    static Scanner choise = new Scanner(System.in);
    public static void GuesInt(){
        System.out.println("Хотите сыграть еще раз? 1 - да ; 2 - нет");
            int a = choise.nextInt();
            if (a == 1) {
                GuesNumber();
            }
            else {
                System.out.println("Спасибо что играли");
            }
        }

    }
