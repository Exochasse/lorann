package fr.célian.personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Lorann extends Personnage {

	// Variables
	public ImageIcon icoLorann;
	public Image imageLorann;

	// Constructor
	public Lorann(int x, int y) {
		
		super(x, y, 32, 32);
		this.icoLorann = new ImageIcon("gitProjetJava/src/main/java/Sprite/lorann_ur.png");
		this.imageLorann = this.icoLorann.getImage();
	}
	
	// Getters
	
	public Image getimageLorann() {return imageLorann;}
	
	
}
