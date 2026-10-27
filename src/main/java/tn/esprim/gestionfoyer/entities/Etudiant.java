package tn.esprim.gestionfoyer.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomE;
    private String prenomE;
    private Long cin;
    private String ecole;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date dataDeNaissance;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "etudiants")
    private List<Reservation> reservations;


}
