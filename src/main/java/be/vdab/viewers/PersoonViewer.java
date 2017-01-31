package be.vdab.viewers;

import be.vdab.PersoonEigenschap;
import be.vdab.entities.Persoon;
import be.vdab.services.PersoonService;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public final class PersoonViewer {

    private final PersoonService persoonService;
    private final PersoonEigenschap[] eigenschappen;

    public PersoonViewer(PersoonEigenschap[] eigenschappen, PersoonService persoonService) {
       this.eigenschappen = eigenschappen;
       this.persoonService = persoonService;
    }

    public void afbeelden() {
        for (Persoon persoon : persoonService.findAll()) {
            for (PersoonEigenschap eigenschap : eigenschappen) {
                toonEigenschap(persoon, eigenschap);
                System.out.print(' ');
            }
            System.out.println();
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
