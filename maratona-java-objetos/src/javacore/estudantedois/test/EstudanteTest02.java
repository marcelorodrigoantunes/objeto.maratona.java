package javacore.estudantedois.test;

import javacore.estudantedois.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Marcelo";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        System.out.println("----------------------");

        estudante02.nome = "Rodrigo";
        estudante02.idade = 16;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
