package be.odisee.gamenighthub.model;

import java.util.Objects;

public class Game {
    private String titel;
    private int minSpelers;
    private int maxSpelers;

    public Game(String titel, int minSpelers, int maxSpelers) {
        this.titel = titel;
        this.minSpelers = minSpelers;
        this.maxSpelers = maxSpelers;
    }

    public String getTitel() {
        return titel;
    }

    public int getMinSpelers() {
        return minSpelers;
    }

    public int getMaxSpelers() {
        return maxSpelers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Game)) return false;
        Game game = (Game) o;
        return titel.equalsIgnoreCase(game.titel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titel.toLowerCase());
    }

    @Override
    public String toString() {
        return titel + " (" + minSpelers + "-" + maxSpelers + " spelers)";
    }
}