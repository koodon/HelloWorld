package SessTwo;

/**
 * Created by opilane on 16.11.2016.
 */
public class Banana {
    public static void main(String[] args) {
        String fruit = "banana";
        char letter = fruit.charAt(0);
        System.out.println("Alphabet");
        for (char a = 'A'; a <= 'Z'; a++) {
            System.out.print(a);
        }
        System.out.println();
        String anotherLetter = fruit.replace("a", "i");
        System.out.println(anotherLetter);
        for (char c: fruit.toCharArray()) {
            System.out.println(c);
        }
    }
}
