package fr.celian.ProjetJava;

import javax.swing.JFrame;

public class Main {

	public static Scene scene;
	
	public static void main(String[] args) {
		
		// Création de la fenetre
		JFrame fenetre = new JFrame("Lorann");
		// Possibilité de fermer la fenetre
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Taille de la fenetre
		fenetre.setSize(640, 384);
		// On place le perso au centre
		fenetre.setLocationRelativeTo(null);
		// One ne peux pas la redimensionner
		fenetre.setResizable(false);
		// On met la fenetre au premier plan
		fenetre.setAlwaysOnTop(true);
		
		
		scene = new Scene();
		// On associe notre scene a la fenetre
		fenetre.setContentPane(scene);
		// On rend la fenetre visible
		fenetre.setVisible(true);
		
		
		
	}

}
