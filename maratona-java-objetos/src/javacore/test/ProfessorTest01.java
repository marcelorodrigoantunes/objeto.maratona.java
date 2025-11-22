package javacore.test;

import javacore.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Marcelo";
        professor.idade = 37;
        professor.sexo = 'M';
        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
    }
}
