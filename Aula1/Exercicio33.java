package Aula1;
import java.util.Scanner;


/**
 * Escreva a descrição da classe Exercicio33 aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */

public class Exercicio33{
    public static void main(String[] args){
        Scanner is = new Scanner(System.in);
        int i1 ,i2 ,i3 ,i4 , valor;
        i1 = i2 = i3 = i4 = 0;
        
        System.out.print("valor do n: ");
        int n = is.nextInt();
        
        for(int i=0; i<n; i++){
            valor = is.nextInt();
            if (valor >=0 && valor <5) i1++;
            else if (valor >=5 && valor <10) i2++;
            else if (valor >=10 && valor <15) i3++;
            else if (valor >=15 && valor <20) i4++;
        }
            System.out.println("[0, 5[:"+i1+
                       "\n[5, 10[:"+12+
                       "\n[10, 15[:"+i3+
                       "\n[15, 20[:"+i4);
    }
}
