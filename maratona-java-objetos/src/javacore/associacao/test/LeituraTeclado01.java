package javacore.associacao.test;

import java.util.Scanner;

public class LeituraTeclado01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para o sexo: ");
        char sexo = entrada.next().charAt(0);
        System.out.println("-----------------------");
        System.out.println("Nome " + nome);
        System.out.println("Idade " + idade);
        System.out.println("Sexo " + sexo);
    }
}
