package be.odisee.gamenighthub.model;

public class Player {
    private User user;

    public Player(User user) {
        this.user = user;
    }

    public String getGebruikersnaam() {
        return user.getGebruikersnaam();
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Speler:" + user.getGebruikersnaam();
    }
}
