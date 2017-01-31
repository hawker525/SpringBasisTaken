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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persoon persoon = (Persoon) o;

        if (getPersoonNr() != persoon.getPersoonNr()) return false;
        if (getAantalKinderen() != persoon.getAantalKinderen()) return false;
        if (!getVoornaam().equals(persoon.getVoornaam())) return false;
        return getFamilienaam().equals(persoon.getFamilienaam());
    }

    @Override
    public String toString() {
        return "Persoon{" +
                "persoonNr=" + persoonNr +
                ", voornaam='" + voornaam + '\'' +
                ", familienaam='" + familienaam + '\'' +
                ", aantalKinderen=" + aantalKinderen +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getPersoonNr();
        result = 31 * result + getVoornaam().hashCode();
        result = 31 * result + getFamilienaam().hashCode();
        result = 31 * result + getAantalKinderen();
        return result;
    }
}

