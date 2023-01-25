package poo.semaine2.bibliotheque;

public class Oeuvre {
	
	private String titre;
	private Auteur auteur;
	private String langue;
	
	public Oeuvre() {
	}
	
	public Oeuvre(String titre, Auteur auteur) {
		this.titre = titre;
		this.auteur = auteur;
		this.langue = "français";
	}

	public Oeuvre(String titre, Auteur auteur, String langue) {
		this.titre = titre;
		this.auteur = auteur;
		this.langue = langue;
	}
	
	public String getTitre() {
		return titre;
	}
	
	public Auteur getAuteur() {
		return auteur;
	}
	
	public String getLangue() {
		return langue;
	}
	
	public void afficher() {
		System.out.println(titre +", "+auteur+", en "+langue);
	}
	
	

}
