package be.vdab.views;

import be.vdab.entities.Persoon;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public final class PersoonViewer {

    public void afbeelden(List<Persoon> personen) {
        for (Persoon p : personen) {
            System.out.printf("persoonNr: %d, voornaam: %s, familienaam: %s, aantalKinderen: %d\n", p.getPersoonNr(), p.getVoornaam(), p.getFamilienaam(), p.getAantalKinderen());
        }
    }

}
