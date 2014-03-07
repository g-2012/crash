package gendarmerie;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

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