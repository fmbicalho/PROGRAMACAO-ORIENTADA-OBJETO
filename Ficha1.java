package Aula1;
import java.util.Scanner;
import java.time.LocalDateTime;
/**
 * Escreva a descrição da classe Ficha1 aqui.
 * 
 * @author Fernando bicalho 
 * @version 1.0
 */
public class Ficha1
{

    //Exercicio 1
    public double celsiusParaFarenheit(double graus){
        double r = ((graus * 9 / 5) + 32);
        return r; 
    }
    
    //Exercicio 2
    public int maximoNumeros( int a, int b) {
        return Math.max(a,b); 
    }
    
    //Exercicio 3
    public String criaDescricaoConta(String nome, double saldo){
        return ("Cliente: " + nome + "    Saldo: " + saldo); 
    }
    
    //Exercicio 4
    public double eurosParaLibras( double valor, double taxaConversao){
         return valor * taxaConversao;    
    }
    
    //Exercicio 5
    //Ler dois inteiros e escrevê-los por ordem decrescente, assim como a sua média.
    //Este exercicio e uma excepçao ao conceito de os metodos nao fazerem IO
    /*public void doisInteiros() {
        Scanner aux = new Scanner(System.in); 
        System.out.println("Insira dois numeros"); 
        int a = aux.nextInt(); 
        int b = aux.nextInt(); 
        System.out.println("O maior e :" + Math.max(a,b));
        System.out.println("O menor e :" + Math.min(a,b)); 
        System.out.println("A media e :" + (((double) a + (double )b) / 2.0) );         
    }*/
    
    public String ordMedia(int a,int b){
       if (a > b) return a + ","+ b + "; Media: " + ((a+b)/2.0);
       else return b + "," + a + "; Media: " + ((a+b)/2.0);
    }
    
    
    //Exercicio 6 
    public long factorial( int num){
        int r = 1; 
         while (num > 1) {
             r*= num; 
             num--;
            }
        return r;
    }
    
    public long factorialRec(int num){
        if(num <= 1){
            return 1;
        }
        else{
            return(num*(factorialRec(num-1)));
        }
    }
    
    //Exercicio 7
    public long tempoGasto(){
        //LocalDateTime before = LocalDateTime.now(); 
        long before = System.currentTimeMillis();
        long fact = factorial(5000); 
        //LocalDateTime after = LocalDateTime.now(); 
        long after = System.currentTimeMillis(); 
        return after-before; 
    }
    
    public long tempoGastoRec(){
        long before = System.currentTimeMillis();
        long fact = factorialRec(5000); 
        long after = System.currentTimeMillis(); 
        return after-before; 
    }
}
