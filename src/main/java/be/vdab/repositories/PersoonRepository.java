package be.vdab.repositories;

import be.vdab.entities.Persoon;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 *
 */
public interface PersoonRepository {
    List<Persoon> findAll();
}
