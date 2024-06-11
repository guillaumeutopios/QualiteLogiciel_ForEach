package org.example.Demo02;

public class Jeu {

    public final IDe de;

    public Jeu(IDe de) {
        this.de = de;
    }

    public boolean jouer (){
        return de.lancer() == 20;
//        return true;
    }
}
