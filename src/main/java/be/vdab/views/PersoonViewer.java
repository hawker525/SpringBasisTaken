package be.vdab.views;

import be.vdab.entities.Persoon;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public final class PersoonViewer {

    private boolean aantalKinderenTonen;

    public void afbeelden(List<Persoon> personen) {
        for (Persoon p : personen) {
            if(aantalKinderenTonen){
                System.out.printf("persoonNr: %d, voornaam: %s, familienaam: %s, aantalKinderen: %d\n", p.getPersoonNr(), p.getVoornaam(), p.getFamilienaam(), p.getAantalKinderen());
            } else {
                System.out.printf("persoonNr: %d, voornaam: %s, familienaam: %s\n", p.getPersoonNr(), p.getVoornaam(), p.getFamilienaam());
            }
        }
    }

    public void setAantalKinderenTonen(boolean aantalKinderenTonen) {
        this.aantalKinderenTonen = aantalKinderenTonen;
    }
}
