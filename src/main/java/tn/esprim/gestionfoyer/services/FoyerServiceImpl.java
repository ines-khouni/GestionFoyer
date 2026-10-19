package tn.esprim.gestionfoyer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprim.gestionfoyer.repositories.FoyerRepository;

@Service
public class FoyerServiceImpl implements IFoyerService{
    @Autowired
    private FoyerRepository foyerRepository;
}
