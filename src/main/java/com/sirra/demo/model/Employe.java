package com.sirra.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;


@Entity
public class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employe_id")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int id;

    @OneToOne(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "employe")
    @JsonManagedReference
    @JsonIgnore
    @ApiModelProperty(notes = "Variable linking the user with his user profile")
    private Individu individu;

    @Length(min = 2, max = 30, message = "Nom de poste trop long ou trop court")
    private String titrePoste;

    private double tauxHoraire;

    @Length(min = 2, max = 40, message = "Nom de superieur est trop long ou trop court")
    private String superieurImediat;
    @Length(min = 5, max = 60, message = "Nom de programme trop long ou trop court")
    private String programme;
    private int jourSemaine;
    @Length(min = 1, max = 80, message = "Veuillez vérifier votre format d'horaire (1-80)")
    private String horaire;
    private double heureSemaine;
    @Temporal(TemporalType.DATE)
    private Date dateSalaire;
    @Temporal(TemporalType.DATE)
    private Date dateFinProbation;
    @Temporal(TemporalType.DATE)
    private Date dateFinPoste;
    @Temporal(TemporalType.DATE)
    private Date dateDebutPoste;
    @Length(min = 2, max = 30, message = "Veuillez verifier que le nom est entre 2 et 30 charactere")
    private String creationPar;
    @Temporal(TemporalType.DATE)
    private Date creerLe;
    @Length(min = 2, max = 30, message = "Veuillez verifier que le nom est entre 2 et 30 charactere")
    private String modificationPar;
    @Temporal(TemporalType.DATE)
    private Date modifierLe;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    private boolean actif;

    public Employe() {
    }

    public int getEmployeId() {
        return id;
    }

    public void setEmployeId(int employeId) {
        this.id = employeId;
    }

    public Individu getIndividu() {
        return individu;
    }

    public void setIndividu(Individu individu) {
        this.individu = individu;
    }

    public String getTitrePoste() {
        return titrePoste;
    }

    public void setTitrePoste(String titrePoste) {
        this.titrePoste = titrePoste;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public String getSuperieurImediat() {
        return superieurImediat;
    }

    public void setSuperieurImediat(String superieurImediat) {
        this.superieurImediat = superieurImediat;
    }

    public String getProgramme() {
        return programme;
    }

    public void setProgramme(String programme) {
        this.programme = programme;
    }

    public int getJourSemaine() {
        return jourSemaine;
    }

    public void setJourSemaine(int jourSemaine) {
        this.jourSemaine = jourSemaine;
    }

    public String getHoraire() {
        return horaire;
    }

    public void setHoraire(String horaire) {
        this.horaire = horaire;
    }

    public double getHeureSemaine() {
        return heureSemaine;
    }

    public void setHeureSemaine(double heureSemaine) {
        this.heureSemaine = heureSemaine;
    }

    public Date getDateSalaire() {
        return dateSalaire;
    }

    public void setDateSalaire(Date dateSalaire) {
        this.dateSalaire = dateSalaire;
    }

    public Date getDateFinProbation() {
        return dateFinProbation;
    }

    public void setDateFinProbation(Date dateFinProbation) {
        this.dateFinProbation = dateFinProbation;
    }

    public Date getDateFinPoste() {
        return dateFinPoste;
    }

    public void setDateFinPoste(Date dateFinPoste) {
        this.dateFinPoste = dateFinPoste;
    }

    public Date getDateDebutPoste() {
        return dateDebutPoste;
    }

    public void setDateDebutPoste(Date dateDebutPoste) {
        this.dateDebutPoste = dateDebutPoste;
    }

    public String getCreationPar() {
        return creationPar;
    }

    public void setCreationPar(String creationPar) {
        this.creationPar = creationPar;
    }

    public Date getCreerLe() {
        return creerLe;
    }

    public void setCreerLe(Date creerLe) {
        this.creerLe = creerLe;
    }

    public String getModificationPar() {
        return modificationPar;
    }

    public void setModificationPar(String modificationPar) {
        this.modificationPar = modificationPar;
    }

    public Date getModifierLe() {
        return modifierLe;
    }

    public void setModifierLe(Date modifierLe) {
        this.modifierLe = modifierLe;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", individu=" + individu +
                ", titrePoste='" + titrePoste + '\'' +
                ", tauxHoraire=" + tauxHoraire +
                ", superieurImediat='" + superieurImediat + '\'' +
                ", programme='" + programme + '\'' +
                ", jourSemaine=" + jourSemaine +
                ", horaire='" + horaire + '\'' +
                ", heureSemaine=" + heureSemaine +
                ", dateSalaire=" + dateSalaire +
                ", dateFinProbation=" + dateFinProbation +
                ", dateFinPoste=" + dateFinPoste +
                ", dateDebutPoste=" + dateDebutPoste +
                ", creationPar='" + creationPar + '\'' +
                ", creerLe=" + creerLe +
                ", modificationPar='" + modificationPar + '\'' +
                ", modifierLe=" + modifierLe +
                ", actif=" + actif +
                '}';
    }
}