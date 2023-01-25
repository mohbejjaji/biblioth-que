package poo.semaine2.bibliotheque;

import java.util.ArrayList;

public class Bibliotheque {
	
	private String nom;
	ArrayList<Exemplaire> exemplaires = new ArrayList<>();
	
	public Bibliotheque() {
	}

	public Bibliotheque(String nom) {
		super();
		this.nom = nom;
		System.out.println("La bibliothèque "+nom+" est ouverte !");
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getNbExemplaire() {
		return exemplaires.size();
	}

	public ArrayList<Exemplaire> listerExemplaires() {
		return exemplaires;
	}

	public ArrayList<Exemplaire> listerExemplaires(String langue) {
		ArrayList<Exemplaire> listExemplaire = new ArrayList<>();
		for (int i = 0; i < exemplaires.size(); i++) {
			if(langue.equals(exemplaires.get(i).getOeuvre().getLangue())) listExemplaire.add(exemplaires.get(i));		
		}
		return listExemplaire;
	}

	public void afficherAuteur() {
		boolean prix = false;
		for (int i = 0; i < exemplaires.size(); i++) {
			if(prix == exemplaires.get(i).getOeuvre().getAuteur().getPrix())
				System.out.println(exemplaires.get(i).getOeuvre().getAuteur().getNom()); 
		}
	}

	public int compterExemplaires(Oeuvre o3) {
		ArrayList<Exemplaire> listExemplaire = new ArrayList<>();
		for (int i = 0; i < exemplaires.size(); i++) {
			if(o3.equals(exemplaires.get(i).getOeuvre())) listExemplaire.add(exemplaires.get(i));
		}
		return listExemplaire.size();
	}

	public void stocker(Oeuvre o1, int nombreExemplaire) {
		for (int i = 0; i < nombreExemplaire; i++) {
			exemplaires.add(new Exemplaire(o1));
		}
		
	}

	public void stocker(Oeuvre o2) {
		exemplaires.add(new Exemplaire(o2));
		
	}
	
}
