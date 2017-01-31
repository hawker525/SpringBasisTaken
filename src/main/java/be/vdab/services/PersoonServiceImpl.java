package be.vdab.services;

import be.vdab.entities.Persoon;
import be.vdab.repositories.PersoonRepository;

import java.util.List;

/**
 * Created by Maarten Westelinck on 31/01/2017 for SpringBasisTaken.
 */
public class PersoonServiceImpl implements PersoonService{

    private final PersoonRepository persoonRepository;

    public PersoonServiceImpl(PersoonRepository persoonRepository) {
        this.persoonRepository = persoonRepository;
    }

    @Override
    public List<Persoon> findAll() {
        return persoonRepository.findAll();
    }
}
