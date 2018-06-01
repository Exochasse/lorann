package fr.celian.ProjetJava;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import fr.célian.personnage.Lorann;

public class Scene extends JPanel{
	
	
	// On crée l'image de fond
	private ImageIcon icoFond;
	private Image ImageFond;
	
	
	private int yPerso;
	private int xPerso;
	private int xFond;
	private int dx;
	private int dy;
	
	public Lorann lorann;
	
	// Méthode qui va Faire correspondre nos images dans notre fenetre
	public Scene() {
		
		super();
		
		this.xPerso = 48;
		this.yPerso = 48;
		this.xFond = -50;
		this.dx = 0;
		this.dy = 0;
		lorann = new Lorann(48, 48);
		
		icoFond = new ImageIcon(getClass().getResource("/Sprite/fond_noir.jpg"));
		this.ImageFond = this.icoFond.getImage();
		
		this.setFocusable(true);
		this.requestFocusInWindow();
		this.addKeyListener(new Clavier());
		
		
		// Programme indépendant qui tourne en fond de facon a repeindre l'écran
		Thread chronoEcran = new Thread(new Chrono());
		chronoEcran.start();
	}
	
	
		// Getters
		public int getDx() {
		return dx;
		}
		
		public int getDy() {
		return dy;
		}
		
		
		//Setters
		public void setDx(int dx) {
			this.dx = dx;
		}
		public void setDy(int dy) {
			this.dy = dy;
		}
			
			
	
		//Méthode déplacement personnage
		public void deplacementPerso() {
			
			this.xPerso = this.xPerso - this.dx;
			this.yPerso = this.yPerso - this.dy;
			
		}
		
	

	// Méthode qui permet de paindre dans notre fenetre en 2D
	public void paintComponent(Graphics g) {
		
	    // Appel de la méthode paintComponent de la classe mère
	    super.paintComponent(g);
	    
	    // On converti dans un contexte 2D
	    Graphics2D g2 = (Graphics2D) g;
	    
	    this.deplacementPerso();
	    
	    g2.drawImage(ImageFond, this.xFond, 0, null);
	    g2.drawImage(this.lorann.getimageLorann(), this.xPerso, this.yPerso, null);
	    
	}
	
}
