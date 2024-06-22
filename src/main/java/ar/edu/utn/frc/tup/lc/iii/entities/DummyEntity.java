package ar.edu.utn.frc.tup.lc.iii.entities;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class DummyEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String dummy;


}
