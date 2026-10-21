package be.odisee.gamenighthub.model;

public class Score {
    private Player player;
    private int punten;


    public Score(Player player, int punten) {
        this.player = player;
        this.punten = punten;
    }

    public Player getPlayer() {
        return player;
    }

    public int getPunten() {
        return punten;
    }

    @Override
    public String toString() {
        return "Score: " + player.getGebruikersnaam() + ", " + punten + " punten";
    }
}
