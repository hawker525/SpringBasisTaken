package be.vdab.repositories;

import be.vdab.entities.Persoon;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 */
public class PersoonRepositoryCSV implements PersoonRepository{

    private final String bestand;

    public PersoonRepositoryCSV(String bestand) {
        this.bestand = bestand;
    }

    @Override
    public List<Persoon> findAll() {
        List<Persoon> personen = new ArrayList<>();
        try (Stream<String> stream = Files.lines(Paths.get(bestand))) {
            stream.forEach((String l) -> {
                String[] data = l.split(",");
                Persoon p = new Persoon(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]));
                personen.add(p);
            });
        } catch (IOException | NumberFormatException ex) {
            ex.printStackTrace();
        }
        return personen;
    }
}
