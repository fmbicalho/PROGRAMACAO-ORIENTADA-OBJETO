package Aula1;
import java.util.Scanner;
/**
 * Escreva a descrição da classe TestaFicha aqui.
 * 
 * @author Fernando Bicalho 
 * @version 1.0
 */

public class TestePrograma
{
    public static void main(String[] args) {
         //Utilizamos sempre o mesmo scanner
         Scanner sc = new Scanner(System.in);    
         
         Ficha1 f = new Ficha1(); 
         
         //Exercicio 1
         System.out.println("Ex1: Insira um valor em graus para converter para farenheit."); 
         double graus = sc.nextDouble(); 
         double convertido = f.celsiusParaFarenheit(graus); 
         System.out.println("Esse valor em Farenheit e " + convertido); 
         
         //Exercicio 2
         System.out.println("Ex2: Insira dois numeros"); 
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         int numMax = f.maximoNumeros(num1, num2); 
         System.out.println("O maximo e " + numMax); 
         
         //Exercicio 3
         System.out.println("Ex3: Insira um nome"); 
         String nomeCliente = sc.nextLine(); 
         System.out.println("Insira um saldo"); 
         double saldoCliente = sc.nextDouble(); 
         System.out.println("O resultado e: \n" + f.criaDescricaoConta(nomeCliente, saldoCliente)); 
         
         
         //Exercicio 4
         System.out.println("Ex4: Insira um valor em euros"); 
         double euros = sc.nextDouble(); 
         System.out.println("Insira uma taxa de conversao"); 
         double taxa = sc.nextDouble(); 
         System.out.println("O valor em libras e: " + f.eurosParaLibras(euros, taxa)); 
         
         //Exercicio 5
         System.out.println("Ex5: Insira dois numeros"); 
         int a = sc.nextInt();
         int b = sc.nextInt();
         String ordmedia = f.ordMedia(a,b); 
         System.out.println("Resultado: " + ordmedia);
         
         //Exercicio 6
         int valor = Integer.parseInt(args[0]); 
         long fact = f.factorial(valor);
         System.out.println("O factorial de " + valor + " e " + fact); 
         
         //Exercicio 7
         long tempoFact = f.tempoGasto();
         System.out.println("O factorial de 5000 demorou " + tempoFact + " milissegundos"); 
         
         long tempoFactRec = f.tempoGastoRec();
         System.out.println("O factorial recursivo de 5000 demorou " + tempoFactRec + " milissegundos"); 
         
         sc.close();
         
         
    }
}
