package Aula1;
import java.util.Scanner;

/**
 * Escreva a descrição da classe OlaMundo aqui.
 * 
 * @author Fernando Bicalho 
 * @version 1.0
 */


public class OlaMundo {
    public static void main(String[] args) {
        Scanner is = new Scanner(System.in); //abre pra escrita
        System.out.print("Nome: "); //imprime
        String nome = is.nextLine(); //define que nome é o que foi escrito
        System.out.println("Olá Mundo!"); //imprime e pula de linha
    }
}

//Isso é um comment
/*
Isso também é um comment
 */
