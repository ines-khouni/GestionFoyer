package tn.esprim.gestionfoyer.services;

import tn.esprim.gestionfoyer.entities.Chambre;

import java.util.List;

public interface IChambreService {
    List<Chambre> retrieveAllChambres();
    Chambre retrieveChambre(Long chambreId);
    Chambre addChambre(Chambre c);
    void removeChambre(Long chambreId);
    Chambre modifyChambre(Chambre chambre);
}
