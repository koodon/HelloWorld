package Methods;

/**
 * Created by opilane on 21.10.2016.
 */
public class NewLine {
    public static void newLine() {                  //NewLine and newLine
        System.out.println();
    }
    public static void threeLine() {                //ver.2
        newLine();
        newLine();
        newLine();
    }
      public static void main(String[] args) {
          System.out.println("First line.");
          threeLine();
          //newLine();
          //newLine();
          //newLine();                              //ver.1
        System.out.println("Second line.");
    }
}
