package tn.esprim.gestionfoyer.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprim.gestionfoyer.entities.Universite;
import tn.esprim.gestionfoyer.services.IUniversiteService;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteRestController {

    @Autowired
    private IUniversiteService universiteService;

    // http://localhost:8082/foyer/universite/retrieve-all-universites
    @GetMapping("/retrieve-all-universites")
    public List<Universite> getUniversites() {
        return universiteService.retrieveAllUniversites();
    }

    // http://localhost:8082/foyer/universite/retrieve-universite/{universite-id}
    @GetMapping("/retrieve-universite/{universite-id}")
    public Universite retrieveUniversite(@PathVariable("universite-id") Long universiteId) {
        return universiteService.retrieveUniversite(universiteId);
    }

    // http://localhost:8082/foyer/universite/add-universite
    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        return universiteService.addUniversite(u);
    }

    // http://localhost:8082/foyer/universite/remove-universite/{universite-id}
    @DeleteMapping("/remove-universite/{universite-id}")
    public void removeUniversite(@PathVariable("universite-id") Long universiteId) {
        universiteService.removeUniversite(universiteId);
    }

    // http://localhost:8082/foyer/universite/modify-universite
    @PutMapping("/modify-universite")
    public Universite modifyUniversite(@RequestBody Universite u) {
        return universiteService.modifyUniversite(u);
    }
}
