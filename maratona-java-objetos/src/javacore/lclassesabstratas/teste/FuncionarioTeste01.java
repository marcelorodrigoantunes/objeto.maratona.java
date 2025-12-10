package javacore.lclassesabstratas.teste;

import javacore.lclassesabstratas.Desenvolvedor;
import javacore.lclassesabstratas.Funcionario;
import javacore.lclassesabstratas.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Joao", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Tom", 12000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
