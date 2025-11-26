package javacore.funcionario.test;

import javacore.funcionario.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "Marcelo";
        funcionario.idade = 23;
        funcionario.salarios = new double[]{120, 987.32, 2000};

        funcionario.imprime();
    }
}
