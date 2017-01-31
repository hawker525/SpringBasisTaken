package be.vdab.services;

import be.vdab.entities.Persoon;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 */
public interface PersoonService {
    List<Persoon> findAll();
}
