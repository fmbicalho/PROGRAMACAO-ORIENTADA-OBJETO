package Aula2;


/**
 * Write a description of class Ficha2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ficha2 {
    
    /**
     * Ficha 2 Ex1a
     */
    public int minimo(int[] a) {
        int min = a[0], elem; //Integer.MAX_VALUE;
        for(int i=1; i<a.length; i++) {
            elem = a[i];
            if (elem < min) {
                min=elem;
            }
        }
        return min;
    }

    /**
     * Ficha 2 Ex1b
     * Pré condição: i < f || f>a.length || i<0 || f<0
     */
    public int[] subArray(int[] a, int i, int f){
        if(i > f || f>a.length || i<0 || f<0)
            return null;
            
        int tam = f-i+1;
        int[] res = new int[tam];
        
        System.arraycopy(a, 0, res, 0, tam);
        return res;
    }

    /**
     * 
     */
    private boolean existe(int[] r, int tam, int i) {
        boolean enc = false;
        for(int j=0; j<tam && !enc; j++){
            enc = r[j]==i;
        }
        return enc;
    }
    
    /**
     * Ficha 2 Ex1c
     */
    public int[] comuns(int[] a1,int[] a2){
        int[] res = new int[a1.length];
        int cont = 0;
        
        for(int elem: a1) {
            boolean enc = this.existe(res, cont, elem);
            for(int j=0; j<a2.length && !enc; j++){
                if(elem==a2[j]){
                    res[cont++] = elem;
                    enc = true;
                }
            }
        }
        int[] resultado = new int[cont];
        System.arraycopy(res, 0, resultado, 0, cont);
        return resultado;
    }
}
