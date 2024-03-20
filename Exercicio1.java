/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1;

import java.util.Scanner;

/**
 *
 * @author 42415763
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Declaração de variaveis
        double num1, num2, resultado;
        char operação;
        //Solicita e lê o primeiro número informado pelo usuário
        System.out.println("Informe o primeiro numero:");
       num1 = input.nextDouble();
       //Solicita e lê o segundo número informado pelo usuário
        System.out.println("Informe o segundo numero:");
        num2 = input.nextDouble();
        
        //Declara a variável da divisão
        double div = num1 / num2;
        
        //Declaração da variável que impede o usuário de dividir o número por 0
        if (num2 ==0)
            System.out.println( " num236 nao pode ser zero. Tente novamente " );
        
        //Mostra ao usuário o resultado da divisão
        System.out.println( " A divisão entre " + num1 + " e " + num2 + " sera igual a " + div);
                 
                 
                
        
        
        
        
        
       
    }
}
