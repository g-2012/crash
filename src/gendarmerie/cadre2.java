package gendarmerie;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;

public class cadre2 extends JFrame{
	  public cadre2(){
		
		 JFrame frame = new JFrame("page d'accueil");
		 panneauImage panneau= new panneauImage();
		    frame.add(panneau);



		    // Affecte � la fen�tre des dimensions suffisantes pour prendre en compte tous les contr�les
		    frame.pack();

		    

		    // Affiche la fen�tre
		    frame.setVisible(true);



		    // Ferme l'application lorsque la fen�tre est ferm�e
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}


	}