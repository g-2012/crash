package gendarmerie;

import javax.swing.*;

/**
 * Classe cr�ant un panneau et y mettant comme image de fond l'image contenue dans la 
 * classe panneauImage. Cette image se retaille automatiquement pour toujours remplir
 * la fen�tre lorsque la taille de celle-ci est modifi�e par l'utilisateur.
 * 
 * @author VCARON
 *
 */
public class cadre2 extends JFrame{
	
	  public cadre2(){
		
		 JFrame frame = new JFrame("page d'accueil");
		 panneauImage panneau= new panneauImage();
		    frame.add(panneau);

		    int height = frame.getSize().height;
		    int width = frame.getSize().width;

		    System.out.println(height+" "+width);

		    // Affecte � la fen�tre des dimensions suffisantes pour prendre en compte tous les contr�les
		    frame.pack();

		    

		    // Affiche la fen�tre
		    frame.setVisible(true);



		    // Ferme l'application lorsque la fen�tre est ferm�e
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}


	}