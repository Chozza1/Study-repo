
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        WordIn();
    }

    static Scanner gues = new Scanner(System.in);

    public static void GuesNumber() {
        System.out.println("Угадайте число от 0 до 9");
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
        RePlay();
    }

    static Scanner choise = new Scanner(System.in);
    public static void RePlay() {
        System.out.println("Хотите сыграть еще раз? 1 - да ; 2 - нет");
        int a = choise.nextInt();
        if (a == 1) {
            GuesNumber();
        } else {
            System.out.println("Спасибо что играли");
        }
    }

    static Scanner gues1 = new Scanner(System.in);
    public static void GuesWord(String wordIn) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        char[] block = new char[15];
        for (int n = 0; n < block.length - 1; n++) {
            String block1 = "#";
            char b = block1.charAt(0);
            block[n] = b;
        }
        String word = words[(int) (Math.random() * words.length)];
        System.out.println(block);
            for (int j = 0; j < block.length-1; j++) {
               if (word.length() < wordIn.length()){
                   char a = word.charAt(j);
                   char c = wordIn.charAt(j);
                   if (a == c){
                       block[j] = c;
                       System.out.println(block);
                   }

                }
            }
        WordIn();
    }


    public static void WordIn() {
        System.out.println("Угадайте слово");
        String answer = gues1.nextLine();
        GuesWord(answer);
    }
}
