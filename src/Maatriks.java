import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * Prindi konsooli 27x27 maatriks, kus on täidetud eesti tähestiku sudoku.
 * https://et.wikipedia.org/wiki/Eesti_t%C3%A4hestik
 */
public class Maatriks {
    static String[] tahestik = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "r", "s", "S", "z", "Z", "t", "u", "v", "O", "A", "Y"};
    static String[] nihutatud = new String[27];
    static String[] uustahestik = new String[27];

    public static void main(String[] args) {
        Random rnd = new Random();
        int nr = rnd.nextInt(26 - 0) + 0;
        shuffleArray(nr, tahestik);
        //System.out.println(Arrays.toString(nihutatud));
        System.arraycopy(nihutatud, 0, uustahestik, 0, tahestik.length);
        Genereerisudoku();
    }

    static void shuffleArray(int nr, String[] mtrx) {
        int nrmiinus = nr;
        int count = 0;
        for (int i = 0; i < mtrx.length; i++) {
            if (count < mtrx.length - nr) {
                nihutatud[i] = mtrx[nr + count];
                count++;
            } else {
                nihutatud[i] = mtrx[nr - nrmiinus];
                nrmiinus--;
            }
        }
    }

    static void Genereerisudoku() {
        String[][] sudoku = new String[27][27];
        for (int i = 0; i < sudoku.length; i++) {
            shuffleArray(i, uustahestik);
            for (int j = 0; j < sudoku.length; j++) {
                sudoku[i][j] = nihutatud[j];
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();

        }
    }
}