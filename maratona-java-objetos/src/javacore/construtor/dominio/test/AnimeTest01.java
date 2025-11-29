package javacore.construtor.dominio.test;

import javacore.construtor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Marcelo","TV",12,"Ação","Produção IG");
        anime.imprime();
    }
}
