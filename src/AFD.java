/**
 * Created by Palaf on 03/10/2017.
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class AFD {
    int[][] d;
    ArrayList<String> abecedario;
    int inicial;
    int estados;
    int[] finales;

    public AFD(int[][] d, ArrayList<String> abecedario, int inicial, int estados, int[] finales) {
        this.d = d;
        this.abecedario = abecedario;
        this.inicial = inicial;
        this.estados = estados;
        this.finales = finales;
    }

    public boolean checkWord(String w) {
        //int x= this.inicial;
        int next = this.inicial;
        String letter = "";
        for (int i = 0; i < w.length(); i++) {//        i is to check letters
            letter = "" + w.charAt(i);
            next = this.d[next][this.abecedario.indexOf(letter)];
        }
        for (int i = 0; i < finales.length; i++) {
            if (next == finales[i]) {
                return true;
            }
        }
        return false;
    }
}