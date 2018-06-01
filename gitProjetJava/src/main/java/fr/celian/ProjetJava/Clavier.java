package fr.celian.ProjetJava;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Clavier implements KeyListener{

	private final int PAUSE = 100;
	
	// Méthode pour les saisis clavier et le comportement adaptes
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			Main.scene.setDx(-32);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
			}
		}
		else if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			Main.scene.setDx(32);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_UP) {
			Main.scene.setDy(32);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
			}
		}
		
		else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
			Main.scene.setDy(-32);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e1) {
			}
		}
		
	}

	// Méthode pour le relachement des touches et les comportement adaptés
	public void keyReleased(KeyEvent e) {
		
		Main.scene.setDx(0);
		Main.scene.setDy(0);
	}

	public void keyTyped(KeyEvent e) {}

}
