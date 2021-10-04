package com.company.banque.fr.banque;

import java.util.Arrays;

public class Client {
    private String prenom;
    private String nom;
    private Integer age;
    private Integer numero;
    private Compte[] comptes;

    public void ajouterCompte(Compte c) {

    }

    public Compte getCompte(Integer numeroCompte){
        for(Compte compte : comptes) {
            if (compte.getNumero() == numeroCompte) {
                return compte;
            }else{
                System.out.println("nothing found");
            }
        }
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Compte[] getComptes() {
        return comptes;
    }

    public void setComptes(Compte[] comptes) {
        this.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Client{" +
                "prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", comptes=" + Arrays.toString(comptes) +
                '}';
    }
}
