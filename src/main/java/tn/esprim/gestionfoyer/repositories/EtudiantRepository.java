package tn.esprim.gestionfoyer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprim.gestionfoyer.entities.Bloc;
import tn.esprim.gestionfoyer.entities.Etudiant;

import java.util.Date;
import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Bloc,Long> {



}
