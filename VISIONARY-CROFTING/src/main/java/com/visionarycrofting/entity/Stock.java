package com.visionarycrofting.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Stock implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private String password;

    @OneToMany(mappedBy = "stock")
    private List<Produit> produits = new ArrayList<>();

    @OneToMany(mappedBy = "stock")
    private List<AppeleOffre> appeleOffres = new ArrayList<>();

    public Stock() {
    }

    public Stock(String nom, String adresse, String email, String telephone, String password, List<Produit> produits, List<AppeleOffre> appeleOffres) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.password = password;
        this.produits = produits;
        this.appeleOffres = appeleOffres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    public List<AppeleOffre> getAppeleOffres() {
        return appeleOffres;
    }

    public void setAppeleOffres(List<AppeleOffre> appeleOffres) {
        this.appeleOffres = appeleOffres;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", produits=" + produits +
                ", appeleOffres=" + appeleOffres +
                '}';
    }
}
