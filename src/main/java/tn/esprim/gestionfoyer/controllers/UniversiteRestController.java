package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.services.IUniversiteService;

@RestController
public class UniversiteRestController {
    @Autowired
    private IUniversiteService universiteService;
}
