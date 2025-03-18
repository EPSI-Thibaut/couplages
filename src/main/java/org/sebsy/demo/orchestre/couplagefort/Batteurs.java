package org.sebsy.demo.orchestre.couplagefort;

public class Batteurs {

    private Batterie batterie;
    private String morceau;

    public Batteurs(String morceau) {
        this.batterie = new Batterie();
        this.morceau = morceau;
    }

    public void jouerMorceau() {
       batterie.afficher();
       System.out.println("et je joue le morceau " + morceau);
       batterie.jouer();
    }
}
