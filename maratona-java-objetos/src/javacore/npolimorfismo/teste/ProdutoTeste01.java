package javacore.npolimorfismo.teste;

import javacore.npolimorfismo.dominio.Computador;
import javacore.npolimorfismo.dominio.Televisao;
import javacore.npolimorfismo.dominio.Tomate;
import javacore.npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10 I7", 11000);
        Tomate tomate = new Tomate("Tomate vermelho", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 2500);
        CalculadoraImposto.calcularImposto(tv);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
    }
}
