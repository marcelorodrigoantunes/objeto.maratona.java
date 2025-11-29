package javacore.construtor.dominio.test;

import javacore.construtor.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Marcelo","TV",12,"Ação");
        Anime anime2 = new Anime();
        anime.imprime();
        System.out.println("\nDentro do construtor 2");
        anime2.imprime();
    }
}
