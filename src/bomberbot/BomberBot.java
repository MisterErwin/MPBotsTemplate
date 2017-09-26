package bomberbot;

import api.bomberbot.Bot;
import api.bomberbot.Entity;
import api.bomberbot.EntityBomb;
import api.bomberbot.EntityBot;

/**
 * Dies ist die Bot-Steuer-Klasse.
 * <p>
 * Einfach programmieren und dann auf Testen klicken.
 * Falls du mit dem Ergebnis zufrieden bist, kannst du unter
 * Kompetitv gegen andere Bots antreten.
 */
public class BomberBot extends Bot {

    /**
     * Diese Methode gibt die Richtung an,
     * in die sich der Bot bewegt.
     *
     * @return UP, RIGHT, LEFT, DOWN
     */
    public int turn() {
        //Der Bot befindet sich im Moment an dieser Stelle
        char cur = this.world[this.y][this.x];
        //Der Wert von cur ist entweder ' ' (leer), 'W' (Mauer) oder 'O' (Kiste)


        if (this.bombs > 0) { //Falls wir eine Bombe haben
            this.layBomb();     //Werfen wir die Bombe
        }

        //Für erweiterte Logik gibt es noch this.maxBombs - die Anzahl der maximal verfügbaren Bomben

        for (Entity entity : this.entities) {
            //Jedes Entity hat die Methoden #getX() und #getY()
            if (entity instanceof EntityBomb) {
                //Bomben haben außerdem #getTime() (5 bis 1) - die Zeit bis zur Explosion
                //Eventuell sollte man vor Bomben wegrennen
            } else if (entity instanceof EntityBot) {
                //Bots haben die Methode #getName() (char) - äquivalent zu this.own.
            }
        }

        return RIGHT;
    }

}