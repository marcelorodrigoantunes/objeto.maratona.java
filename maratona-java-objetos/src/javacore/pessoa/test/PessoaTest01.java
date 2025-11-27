package javacore.pessoa.test;

import javacore.pessoa.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcelo");
        pessoa.setIdade(70);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
     //   pessoa.imprime();
    }
}
