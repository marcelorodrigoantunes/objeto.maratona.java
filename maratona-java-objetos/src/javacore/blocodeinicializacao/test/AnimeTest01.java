package javacore.blocodeinicializacao.test;

import javacore.blocodeinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        System.out.println(anime.getEpisodios());
    }
}
