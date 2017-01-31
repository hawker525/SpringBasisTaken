package be.vdab.entities;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public class Persoon {
    private final int persoonNr;
    private final String voornaam;
    private final String familienaam;
    private final int aantalKinderen;

    public Persoon(int persoonNr, String voornaam, String familienaam, int aantalKinderen) {
        this.persoonNr = persoonNr;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.aantalKinderen = aantalKinderen;
    }

    public int getPersoonNr() {
        return persoonNr;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public int getAantalKinderen() {
        return aantalKinderen;
    }
}

