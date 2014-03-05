package gendarmerie;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;

public class pageAccueil extends JFrame{


	// Le constructeur crée les composants en mémoire et les ajoute au cadre

	pageAccueil() {

		// crée une étiquette permettant de mettre une image de fond à la page d'acccueil
		JLabel background=new JLabel(new ImageIcon("lenna_complete.jpg"));

		// Affecte un gestionnaire de présentation GridBagLayout à cette étiquette
		GridBagLayout disposition1 = new GridBagLayout();
		background.setLayout(disposition1);
		
		// Crée le message de bienvenue et le positionne dans la zone nord de la fenêtre
		
		// Crée une instance de GridBagConstraints
		GridBagConstraints contr1 = new GridBagConstraints();
		// Affecte les contraintes du champ Affichage
		// coordonnée x dans le quadrillage
		contr1.gridx = 1;
		// coordonnée y dans le quadrillage
		contr1.gridy = 0;
		// cette cellule a la même hauteur que les autres
		contr1.gridheight = 1;
		// cette cellule est 6 fois plus large que les autres
		contr1.gridwidth = 3;
		// remplit tout l'espace dans la cellule
		contr1.fill = GridBagConstraints.BOTH;
		// proportion d'espace horizontal occupée par ce composant
		contr1.weightx = 1.0;
		// proportion d'espace vertical occupée par ce composant
		contr1.weighty = 1.0;
		// position du composant dans la cellule
		contr1.anchor = GridBagConstraints.CENTER;
		JLabel messageBienvenue= new JLabel();
		messageBienvenue.setText("Bienvenue sur la page d'accueil du programme de dessin de véhicule");
		// Affecte les contraintes à ce champ
		disposition1.setConstraints(messageBienvenue, contr1);
		// Ajoute le champ à la fenêtre
		background.add(messageBienvenue);

		//Crée un bouton popup proposant une liste de véhicules
		
		// Crée une instance de GridBagConstraints
				GridBagConstraints contr2 = new GridBagConstraints();
				// Affecte les contraintes du champ Affichage
				// coordonnée x dans le quadrillage
				contr2.gridx = 0;
				// coordonnée y dans le quadrillage
				contr2.gridy = 1;
				// cette cellule a la même hauteur que les autres
				contr2.gridheight = 1;
				//largeur standard
				contr2.gridwidth = 1;
				//remplit l'espace dans la cellule
				contr2.fill = GridBagConstraints.VERTICAL;
				// proportion d'espace horizontal occupée par ce composant
				contr2.weightx = 1;
				// proportion d'espace vertical occupée par ce composant
				contr2.weighty = 1;
				// position du composant dans la cellule
				contr2.anchor = GridBagConstraints.WEST;	
		JComboBox choixVehicule= new JComboBox();
		// Affecte les contraintes à ce champ
				disposition1.setConstraints(choixVehicule, contr2);
				// Ajoute le champ à la fenêtre
				background.add(choixVehicule);

		//Crée un bouton "charger" permettant de charger un fichier existant
				
				// Crée une instance de GridBagConstraints
				GridBagConstraints contr3 = new GridBagConstraints();
				// Affecte les contraintes du champ Affichage
				// coordonnée x dans le quadrillage
				contr3.gridx = 2;
				// coordonnée y dans le quadrillage
				contr3.gridy = 1;
				// cette cellule a la même hauteur que les autres
				contr3.gridheight = 1;
				//largeur standard
				contr3.gridwidth = 1;
				// proportion d'espace horizontal occupée par ce composant
				contr3.weightx = 1;
				// proportion d'espace vertical occupée par ce composant
				contr3.weighty = 1;
				// position du composant dans la cellule
				contr3.anchor = GridBagConstraints.EAST;
				
		JButton charger= new JButton("charger");
		// Affecte les contraintes à ce champ
		disposition1.setConstraints(charger, contr3);
		// Ajoute le champ à la fenêtre
		background.add(charger);

		// Crée un message et le positionne dans la zone sud de la fenêtre
		
		// Crée une instance de GridBagConstraints
		GridBagConstraints contr4 = new GridBagConstraints();
		// Affecte les contraintes du champ Affichage
		// coordonnée x dans le quadrillage
		contr4.gridx = 1;
		// coordonnée y dans le quadrillage
		contr4.gridy = 2;
		// cette cellule a la même hauteur que les autres
		contr4.gridheight = 1;
		// cette cellule est 6 fois plus large que les autres
		contr4.gridwidth = 3;
		// proportion d'espace horizontal occupée par ce composant
		contr4.weightx = 1.0;
		// proportion d'espace vertical occupée par ce composant
		contr4.weighty = 1.0;
		// position du composant dans la cellule
		contr4.anchor = GridBagConstraints.CENTER;	
		
		JButton valider= new JButton("Valider");
		// Affecte les contraintes à ce champ
		disposition1.setConstraints(valider, contr4);
		// Ajoute le champ à la fenêtre
		background.add(valider);

		// Crée le cadre et lui affecte son contenu
		JFrame frame = new JFrame("page d'accueil");
		frame.add(background);





		// Affecte à la fenêtre des dimensions suffisantes pour prendre en compte tous les contrôles
		frame.pack();
		// Affiche la fenêtre
		frame.setVisible(true);
		// Ferme l'application lorsque la fenêtre est fermée
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}