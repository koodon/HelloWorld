package SessTwo;

/**
 * Created by opilane on 16.11.2016.
 */
public class Mass {
    public static void main(String[] args) {
        int size = 6;
        int[] massiiv1 = new int[size];
        massiiv1[0] = 10;
        massiiv1[1] = 100;
        massiiv1[2] = 1000;
        massiiv1[3] = 10000;
        massiiv1[4] = 100000;
        massiiv1[5] = 1000000;
        int ans = search(massiiv1, 10000);
        System.out.println(ans);

        for (int i = 0; i < massiiv1.length; i++) {
            System.out.println(massiiv1[i]);
        }
        int m = 0;
        for (int n : massiiv1) {                                        //array loop (for each type loop)
            m = n / 10;
            System.out.println(m);
        }
    }
        public static int search(int[] massiiv1, int target) {
            for (int i = 0; i < massiiv1.length; i++) {
                if(massiiv1[i] == target) {
                    return i;
                }
            }
            return -1;
        }
}