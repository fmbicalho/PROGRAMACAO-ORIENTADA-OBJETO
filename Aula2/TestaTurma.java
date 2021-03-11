package Aula2;
import java.util.Scanner;
import java.util.Arrays;


/**
 * Write a description of class TestaTurma here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestaTurma {
    
    public static void main(String[] args) {
        Pauta t = new Pauta();
        int[][] paux = new int[5][5];
        Scanner is = new Scanner(System.in);
        System.out.println("Pauta: ");
        for(int i=0; i<paux.length; i++){
            for(int j=0; j<paux[i].length; j++) {
                System.out.print("Aluno "+i+", UC: "+j+": ");
                paux[i][j] = is.nextInt();
            }
        }
        t.setNotasTurma(paux);
        
        System.out.println(Arrays.deepToString(paux));
        
        System.out.println(Arrays.deepToString(t.getNotasTurma()));
    }
}
