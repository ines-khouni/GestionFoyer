package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import tn.esprim.gestionfoyer.services.IChambreService;

@RestController
public class ChambreRestController {
    @Autowired
    private IChambreService chambreService;
}
