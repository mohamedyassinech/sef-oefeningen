package be.odisee.gamenighthub.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Session {
    private LocalDate datum;
    private String locatie;
    private Game spel;
    private List<Player> spelers;
    private  List<Score> scores;


    public Session(LocalDate datum, String locatie, Game spel) {
        this.datum = datum;
        this.locatie = locatie;
        this.spel = spel;
        this.spelers = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    public LocalDate getDatum() {
        return datum;
    }

    public String getLocatie() {
        return locatie;
    }

    public Game getSpel() {
        return spel;
    }


    public List<Player> getSpelers() {
        return spelers;
    }

    public void voegSpelerToe(Player player) {
        spelers.add(player);
    }

    public List<Score> getScores() {
        return scores;
    }

    public void voegScoreToe(Score score) {
        scores.add(score);
    }

    @Override
    public String toString() {
        return "Game-avond op " + datum + " in " + locatie + " - " + spel;
    }
}
