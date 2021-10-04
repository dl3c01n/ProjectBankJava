package com.company.banque.fr.banque;

public class Compte {
    private Integer numero;
    private double solde;

    public Compte(){
        this.setNumero(0);
        this.setSolde(0);
    }

    public Integer getNumero() {
        return this.numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return this.solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void ajouter(Double unMontant){
        this.setSolde(this.getSolde()+unMontant);
    }

    public void retirer(Double unMontant){
        this.setSolde(this.getSolde()-unMontant);
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numero=" + numero +
                ", solde=" + solde +
                '}';
    }
}
