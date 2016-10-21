package Convert;
import com.sun.org.apache.bcel.internal.classfile.ConstantInteger;

import java.util.Scanner;
/**
 * Created by opilane on 21.10.2016.
 */
public class NameAge {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        int age;
        //work's fine
        //System.out.print("What is your name? ");
        //name = in.nextLine();
        //System.out.print("What is your age? ");
        //age = in.nextInt();
        //System.out.printf("Hello %s, age %d\n", name, age);

        //error, because no new line
        //System.out.print("What is your age? ");
        //age = in.nextInt();
        //System.out.print("What is your name? ");
        //name = in.nextLine();
        //System.out.printf("Hello %s, age %d\n", name, age);

        //fix
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine();
        System.out.print("What is your name? ");
        name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}