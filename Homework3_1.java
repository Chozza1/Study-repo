import java.util.Scanner;

public class Homework3_1 {
    static Scanner gues = new Scanner(System.in);
    public static void main(String[] args) {
    GuesWord();
    }
    public static void GuesWord(){
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word = words[(int) (Math.random() * words.length)];
        for (int i = 0; i < Integer.MAX_VALUE; i++){
            String answer = gues.nextLine();
            for (int j = 0; j <= answer.length(); j++){
                String f = "###############";
                char a = word.charAt(j);
                char c = answer.charAt(j);
                char b = f.charAt(j);
                if (a == c) {
                    b = c;
                    char d =f.charAt(j);
                    d=b;
                    System.out.println(f);
                }
                else {
                    break;
                }
            }
            if (word.equals(answer));{
                System.out.println("Вы угадали " + word);
                break;
            }

        }

        //15 char-of gj arr?
        //for  while
        // String str = "apple";
        //char a = str.charAt(0)
    }
}

