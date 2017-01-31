package be.vdab.views;

import be.vdab.PersoonEigenschap;
import be.vdab.entities.Persoon;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public final class PersoonViewer {

    private final PersoonEigenschap[] eigenschappen;

    public PersoonViewer(PersoonEigenschap[] eigenschappen) {
       this.eigenschappen = eigenschappen;
    }

    public void afbeelden(List<Persoon> personen) {
        for (Persoon p : personen) {
            for (PersoonEigenschap e : eigenschappen) {
                System.out.printf(e.name() + ": ");
                toonEigenschap(p,e);
            }
        }
    }

    private void toonEigenschap(Persoon persoon, PersoonEigenschap eigenschap) {
        switch (eigenschap) {
            case PERSOON_NR:
                System.out.println(persoon.getPersoonNr());
                break;
            case VOORNAAM:
                System.out.println(persoon.getVoornaam());
                break;
            case AANTAL_KINDEREN:
                System.out.println(persoon.getAantalKinderen());
                break;
            case FAMILIENAAM:
                System.out.println(persoon.getFamilienaam());
                break;
        }
    }

}
