package fr.celian.ProjetJava;

public class Chrono implements Runnable{

	// On s'arrete 3 millisecondes entre chaque tour de boucle avant de repeindre l'écran
	private final int PAUSE = 10;
	
	
	public void run() {
		
		// Boucle infini pour repeindre tout le temps
		while(true) {
			
			// On appel notre fonction repaint qui premet de peindre notre image de fond et notre personnage
			Main.scene.repaint();
			try {
				Thread.sleep(PAUSE);
			} catch (InterruptedException e) {
			
			}
		}
	}
}
