package com.backend.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Relation_Types")
public class Relation_Type {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Relation_name" , nullable = false)
    private String name;

    @Column(name = "Cardinality" , nullable = false)
    private boolean cardinality;

    @OneToMany(mappedBy = "type")
    private List<Relation> relations;

    public Relation_Type(){
    }

    public Relation_Type(String name, boolean cardinality) {
        setName(name);
        setCardinality(cardinality);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean getCardinality() {
        return cardinality;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setCardinality(boolean cardinality) {
        this.cardinality = cardinality;
    }

}
