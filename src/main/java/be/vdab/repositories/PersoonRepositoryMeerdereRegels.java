package be.vdab.repositories;

import be.vdab.entities.Persoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 */
public class PersoonRepositoryMeerdereRegels implements PersoonRepository{
    private final String bestand;

    public PersoonRepositoryMeerdereRegels(String bestand) {
        this.bestand = bestand;
    }

    @Override
    public List<Persoon> findAll() {
        List<Persoon> personen = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(bestand))) {
           int persoonNr = Integer.parseInt(reader.readLine());
           String voornaam = reader.readLine();
           String achternaam = reader.readLine();
            int aantalKinderen = Integer.parseInt(reader.readLine());
            Persoon p = new Persoon(persoonNr, voornaam, achternaam, aantalKinderen);
            personen.add(p);
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }
        return personen;
    }
}
