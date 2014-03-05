package gendarmerie;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class pageAccueil extends JFrame{


	// Le constructeur cr�e les composants en m�moire et les ajoute au cadre

	pageAccueil() {

		// cr�e une �tiquette permettant de mettre une image de fond � la page d'acccueil
		JLabel background=new JLabel(new ImageIcon("D:/gendarmes.jpg"));

		// Affecte un gestionnaire de pr�sentation GridBagLayout � cette �tiquette
		GridBagLayout disposition1 = new GridBagLayout();
		background.setLayout(disposition1);
		
		// Cr�e le message de bienvenue et le positionne dans la zone nord de la fen�tre
		
		// Cr�e une instance de GridBagConstraints
		GridBagConstraints contr1 = new GridBagConstraints();
		// Affecte les contraintes du champ Affichage
		// coordonn�e x dans le quadrillage
		contr1.gridx = 1;
		// coordonn�e y dans le quadrillage
		contr1.gridy = 0;
		// cette cellule a la m�me hauteur que les autres
		contr1.gridheight = 1;
		// cette cellule est 6 fois plus large que les autres
		contr1.gridwidth = 3;
		// remplit tout l'espace dans la cellule
		contr1.fill = GridBagConstraints.BOTH;
		// proportion d'espace horizontal occup�e par ce composant
		contr1.weightx = 1.0;
		// proportion d'espace vertical occup�e par ce composant
		contr1.weighty = 1.0;
		// position du composant dans la cellule
		contr1.anchor = GridBagConstraints.CENTER;
		JLabel messageBienvenue= new JLabel();
		messageBienvenue.setText("Bienvenue sur la page d'accueil du programme de dessin de v�hicule");
		// Affecte les contraintes � ce champ
		disposition1.setConstraints(messageBienvenue, contr1);
		// Ajoute le champ � la fen�tre
		background.add(messageBienvenue);

		//Cr�e un bouton popup proposant une liste de v�hicules
		
		// Cr�e une instance de GridBagConstraints
				GridBagConstraints contr2 = new GridBagConstraints();
				// Affecte les contraintes du champ Affichage
				// coordonn�e x dans le quadrillage
				contr2.gridx = 0;
				// coordonn�e y dans le quadrillage
				contr2.gridy = 1;
				// cette cellule a la m�me hauteur que les autres
				contr2.gridheight = 1;
				//largeur standard
				contr2.gridwidth = 1;
				//remplit l'espace dans la cellule
				contr2.fill = GridBagConstraints.VERTICAL;
				// proportion d'espace horizontal occup�e par ce composant
				contr2.weightx = 1;
				// proportion d'espace vertical occup�e par ce composant
				contr2.weighty = 1;
				// position du composant dans la cellule
				contr2.anchor = GridBagConstraints.WEST;	
		JComboBox choixVehicule= new JComboBox();
		// Affecte les contraintes � ce champ
				disposition1.setConstraints(choixVehicule, contr2);
				// Ajoute le champ � la fen�tre
				background.add(choixVehicule);

		//Cr�e un bouton "charger" permettant de charger un fichier existant
				
				// Cr�e une instance de GridBagConstraints
				GridBagConstraints contr3 = new GridBagConstraints();
				// Affecte les contraintes du champ Affichage
				// coordonn�e x dans le quadrillage
				contr3.gridx = 2;
				// coordonn�e y dans le quadrillage
				contr3.gridy = 1;
				// cette cellule a la m�me hauteur que les autres
				contr3.gridheight = 1;
				//largeur standard
				contr3.gridwidth = 1;
				// remplit tout l'espace dans la cellule
				contr3.fill = GridBagConstraints.VERTICAL;
				// proportion d'espace horizontal occup�e par ce composant
				contr3.weightx = 1;
				// proportion d'espace vertical occup�e par ce composant
				contr3.weighty = 1;
				// position du composant dans la cellule
				contr3.anchor = GridBagConstraints.EAST;
				
		JButton charger= new JButton("charger");
		// Affecte les contraintes � ce champ
		disposition1.setConstraints(charger, contr3);
		// Ajoute le champ � la fen�tre
		background.add(charger);

		// Cr�e un message et le positionne dans la zone sud de la fen�tre
		
		// Cr�e une instance de GridBagConstraints
		GridBagConstraints contr4 = new GridBagConstraints();
		// Affecte les contraintes du champ Affichage
		// coordonn�e x dans le quadrillage
		contr4.gridx = 1;
		// coordonn�e y dans le quadrillage
		contr4.gridy = 2;
		// cette cellule a la m�me hauteur que les autres
		contr4.gridheight = 1;
		// cette cellule est 6 fois plus large que les autres
		contr4.gridwidth = 3;
		// remplit tout l'espace dans la cellule
		contr4.fill = GridBagConstraints.BOTH;
		// proportion d'espace horizontal occup�e par ce composant
		contr4.weightx = 1.0;
		// proportion d'espace vertical occup�e par ce composant
		contr4.weighty = 1.0;
		// position du composant dans la cellule
		contr4.anchor = GridBagConstraints.CENTER;	
		
		JLabel messageSud= new JLabel();
		messageSud.setText("On a bien picol�");
		// Affecte les contraintes � ce champ
		disposition1.setConstraints(messageSud, contr4);
		// Ajoute le champ � la fen�tre
		background.add(messageSud);

		// Cr�e le cadre et lui affecte son contenu
		JFrame frame = new JFrame("page d'accueil");
		frame.add(background);





		// Affecte � la fen�tre des dimensions suffisantes pour prendre en compte tous les contr�les
		frame.pack();
		// Affiche la fen�tre
		frame.setVisible(true);
		// Ferme l'application lorsque la fen�tre est ferm�e
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}