package be.odisee.gamenighthub.model;

public class User {
    private String gebruikersnaam;
    private String email;
    private String wachtwoord;

    public User(String gebruikersnaam, String email, String wachtwoord) {
        this.gebruikersnaam = gebruikersnaam;
        this.email = email;
        this.wachtwoord = wachtwoord;
    }

    public String getGebruikersnaam() {
        return gebruikersnaam;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return gebruikersnaam + "(" + email + ")";
    }
}

