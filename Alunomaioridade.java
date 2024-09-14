/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Alunomaioridade {

    public static void main(String[] args) {
        
        //ENTRADA
        Scanner scanner = new Scanner(System.in);
        int idade;
        
        System.out.println("------progama de comparação maoir idade------");
        System.out.println("digite a idade");
        idade=scanner.nextInt();
        
        //Processamento
        if(idade >= 18){
            System.out.println("aluno maior idade");
            
        }else{
            System.out.println("aluno menor idade");
            
        }
        
        //Saida
       
    }
}
