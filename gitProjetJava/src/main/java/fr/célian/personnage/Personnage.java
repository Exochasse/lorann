package fr.célian.personnage;

public class Personnage {

	// Varibales
	private int largeur; //Character dimension
	private int hauteur; //Character dimension
	private int x; //Character position
	private int y; //Character position
	private boolean marche; // True when the character walk
	private boolean versDroite; // True when the character is turn right
	public int compteur; // Step counter
	
	
	//Constructor
	public Personnage(int x, int y, int largeur, int hauteur){
	
		this.x = x;
		this.y = y;
		this.largeur = largeur;
		this.hauteur = hauteur;
		this.compteur = 0;
		this.marche = false;
		this.versDroite = true;
	}
	
	// Getters
	
	public int getLargeur() {return largeur;}

	public int getHauteur() {return hauteur;}

	public int getX() {return x;}

	public int getY() {return y;}

	public boolean isMarche() {return marche;}

	public boolean isVersDroite() {return versDroite;}

	public int getCompteur() {return compteur;}

	
	
	
	// Setters
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setMarche(boolean marche) {
		this.marche = marche;
	}

	public void setVersDroite(boolean versDroite) {
		this.versDroite = versDroite;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	// Méthode
	
	
	
	
	
		
}

