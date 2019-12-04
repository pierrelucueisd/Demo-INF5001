package com.sirra.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Departement {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private int id;

    @JsonManagedReference(value = "departement")
    @OneToMany(
            mappedBy = "departement",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Employe> employes;


    private int heure_Ouverture;


    private int heure_Fermeture;

    @Length(min = 7, max = 7, message = "Binaire ne fait pas longueur 7")
    private String jrBinaire;

    public List<Employe> getEmployes() {
        return employes;
    }


    //1-7 = Dimanche a Samedi
    private boolean[] journesOuvert = new boolean[7];

    public boolean[] getJournesOuvert() {
        return journesOuvert;
    }

    public void setJournesOuvert(boolean[] journesOuvert) {
        this.journesOuvert = journesOuvert;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void initiliaserLesJr(String binaire7){
        if(binaire7.trim().length() == 7){
            for(int i = 0 ; i < binaire7.length()-1; i++){
                if(binaire7.charAt(i) == '0'){
                    journesOuvert[i] = false;
                } else if (binaire7.charAt(i) == '1') {
                    journesOuvert[i] = true;
                } else {
                    System.out.println("Votre binaire7 contient un charactere different de 0 ou 1");
                    System.exit(1);
                }
            }

        } else {
            System.out.println("Le binaire7 n'est pas de 7");
            System.exit(1);
        }

    }

    public void setEmployes(List<Employe> employes) {
        this.employes = employes;
    }

    public int getHeure_Ouverture() {
        return heure_Ouverture;
    }

    public void setHeure_Ouverture(int heure_Ouverture) {
        this.heure_Ouverture = heure_Ouverture;
    }

    public int getHeure_Fermeture() {
        return heure_Fermeture;
    }

    public void setHeure_Fermeture(int heure_Fermeture) {
        this.heure_Fermeture = heure_Fermeture;
    }

    public String getJrBinaire() {
        return jrBinaire;
    }

    public void setJrBinaire(String jrBinaire) {
        this.jrBinaire = jrBinaire;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", employes=" + employes +
                ", heure_Ouverture=" + heure_Ouverture +
                ", heure_Fermeture=" + heure_Fermeture +
                ", jrBinaire='" + jrBinaire + '\'' +
                ", journesOuvert=" + Arrays.toString(journesOuvert) +
                '}';
    }
}

