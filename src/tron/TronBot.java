package tron;

import api.tron.Bot;

/**
 * Dies ist die Bot-Steuer-Klasse.
 * <p>
 * Einfach programmieren und dann auf Testen klicken.
 * Falls du mit dem Ergebnis zufrieden bist, kannst du unter
 * Kompetitv gegen andere Bots antreten.
 */
public class TronBot extends Bot {

    /**
     * Diese Methode gibt die Richtung an,
     * in die sich der Bot bewegt.
     *
     * @return UP, RIGHT, LEFT, DOWN
     */
    public int turn() {
        //Der Bot befindet sich im Moment an dieser Stelle
        int cur = this.world[this.y][this.x];
        //Der Wert von cur ist ausserdem this.own
        if (cur == this.own) {
            System.out.println("Diese Ausgabe ist zu sehen");
        } else {
            System.out.println("Dies wird nie geschehen");
        }

        //Ein Feld (x,y) ist unbesucht, wenn this.world[y][x] == 0 ist.
        return UP;
    }
}
