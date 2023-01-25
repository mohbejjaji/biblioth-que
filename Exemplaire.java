package poo.semaine2.bibliotheque;

public class Exemplaire {
	
	private Oeuvre oeuvre;

	public Exemplaire(Oeuvre oeuvre) {
		super();
		this.oeuvre = oeuvre;
		System.out.println("Nouvel exemplaire : "+oeuvre.getTitre()+" "+oeuvre.getAuteur().getNom()+" en "+oeuvre.getLangue());
	}
	
	public Exemplaire(Exemplaire exp) {
		oeuvre = exp.oeuvre;
		System.out.print("Copie d'un exemplaire de : "+oeuvre.getTitre()+" "+oeuvre.getAuteur().getNom()+" en "+oeuvre.getLangue());
	}

	public void afficher() {
		System.out.println("Un exemplaire de : "+oeuvre.getTitre()+", "+oeuvre.getAuteur().getNom()+", en "+oeuvre.getLangue());
		
	}
	
    public Oeuvre getOeuvre() {
    	return oeuvre;
    }
}
