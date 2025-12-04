package javacore.associacao.test;

import javacore.associacao.dominio.Escola;
import javacore.associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Marcelo");
        Professor professor2 = new Professor("Joao");
        Professor[] professores =  {professor1, professor2};
        Escola escola = new Escola("Campinas", professores);

        escola.imprime();
    }
}
