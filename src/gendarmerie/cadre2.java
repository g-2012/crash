package gendarmerie;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

/**
 * Classe créant un panneau et y mettant comme image de fond l'image contenue dans la 
 * classe panneauImage. Cette image se retaille automatiquement pour toujours remplir
 * la fenêtre lorsque la taille de celle-ci est modifiée par l'utilisateur.
 * 
 * @author VCARON
 *
 */
public class cadre2 extends JFrame{
	
	  public cadre2(){
		
		 JFrame frame = new JFrame("page d'accueil");
		 panneauImage panneau= new panneauImage();
		    frame.add(panneau);



		    // Affecte à la fenêtre des dimensions suffisantes pour prendre en compte tous les contrôles
		    frame.pack();

		    

		    // Affiche la fenêtre
		    frame.setVisible(true);



		    // Ferme l'application lorsque la fenêtre est fermée
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}


	}