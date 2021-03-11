package Aula2;


/**
 * Ficha 2 Ex 2.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pauta{

    private int[][] notasTurma;
    
    /**
     * Construtor vazio
     */
    public Pauta() {
        this.notasTurma = new int[5][5];
    }
    
    /**
     * 
     */
    public void setNotasTurma (int[][] notas) {
        for (int i=0; i<notasTurma.length; i++)
            for(int j=0; j<notasTurma.length; j++)
                notasTurma[i][j] = notas [i][j];
        System.arraycopy(notas, 0, notasTurma, 0, notasTurma.length);
    }
    
    public int[][] getNotasTurma() {
        return this.notasTurma;
    }
}
