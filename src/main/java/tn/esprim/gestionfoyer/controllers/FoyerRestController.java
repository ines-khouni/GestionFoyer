package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.services.IEtudiantService;
import tn.esprim.gestionfoyer.services.IFoyerService;

@RestController
public class FoyerRestController {
    @Autowired
    private IFoyerService foyerService;
}
