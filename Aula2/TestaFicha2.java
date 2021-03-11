package Aula2;
import java.util.Scanner;


/**
 * Write a description of class TestaFicha2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestaFicha2{
   public static void main(String[] args) {
        Ficha2 f = new Ficha2();
        int n;
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Número de inteiros a ler?: ");
            n = sc.nextInt();
        }while (n<=0);
        
        int[] valores = new int[n];
            for(int i=0; i<n; i++){
            System.out.print("Valor da posição: "+i+": ");
            valores[i] = sc.nextInt();
        }
        
        System.out.print("O mínimo é: "+f.minimo(valores));
}
}
