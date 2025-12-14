package javacore.npolimorfismo.teste;

import javacore.npolimorfismo.repositorio.Repositorio;
import javacore.npolimorfismo.servico.RepositorioMemoria;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio respositorio = new RepositorioMemoria();
        respositorio.salvar();
        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
