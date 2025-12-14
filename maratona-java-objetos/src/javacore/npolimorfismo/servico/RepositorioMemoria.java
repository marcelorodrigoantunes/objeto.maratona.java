package javacore.npolimorfismo.servico;

import javacore.npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }

}
