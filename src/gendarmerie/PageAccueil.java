package gendarmerie;

import javax.swing.*;

import java.awt.*;

/**
 * Classe créant la page d'accueil. L'image de fond est utilisée en faisant appel à 
 * la classe  panneauImage. Les boutons et leur dispostion sont gérés par la classe cadre
 * 
 * @author VCARON
 *
 */


public class PageAccueil{

	/**
	 *utilisée dans la classe charger pour stocker le nom du fichier que l'on veut charger
	 */
	static JTextField filename = new JTextField();
	/**
	 * déclaration du bouton "charger" qui sera crée dans le constructeur
	 */
	public static JButton charger;
	/**
	 * déclaration du bouton "valider" qui sera crée dans le constructeur
	 */
	public static JButton valider;

	/**
	 * déclaration des choix proposés par la combobox "choixVehicule"
	 */
	String[] choix = { "voiture", "camion", "motocyclette"};
	
	/**
	 * déclaration de la combobox "choixVehicule" qui sera créee dans le constructeur
	 */
	public static JComboBox<Object> choixVehicule;


	/**
	 * Constructeur de la page d'accueil. Il génère une image de fond sur laquelle
	 * se superposent un message d'accueil et les différents boutons permettant d'agir
	 */
	PageAccueil() {



		/**
		 * Instancie la classe panneauImage permettant de mettre une image de fond à la page d'acccueil
		 */
		PanneauImage panneau= new PanneauImage();

		/**
		 * Affecte un gestionnaire de présentation GridBagLayout à panneau qui va permettre de positionner correctement
		 * les boutons et les messages sur le panneau
		 */
		GridBagLayout disposition1 = new GridBagLayout();
		panneau.setLayout(disposition1);

		/**
		 * Crée le message de bienvenue et le positionne dans la zone nord centrée de la fenêtre. Pour centrer le message, on crée
		 * 2 Jlabels vides qui encadrent le label contenant le message de bienvenue 
		 */

		//Crée une instance de GridBagConstraints pour le positionnement du Jlabel vide1
		GridBagConstraints contr0 = new GridBagConstraints();

		//Crée les contraintes de positionnement du Jlabel vide1

		//coordonnée x dans le quadrillage
		contr0.gridx = 0;
		//coordonnée y dans le quadrillage
		contr0.gridy = 0;
		//hauteur standard
		contr0.gridheight = 1;
		//largeur standard
		contr0.gridwidth = 1;
		//remplit tout l'espace dans la cellule
		contr0.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occupée par ce composant
		contr0.weightx = 1;
		//proportion d'espace vertical occupée par ce composant
		contr0.weighty = 0.1;
		//position du composant dans la cellule
		contr0.anchor = GridBagConstraints.CENTER;

		/**
		 * Crée le Jlabel vide1
		 */
		JLabel vide1= new JLabel();


		//Affecte les contraintes au Jlabel vide1
		disposition1.setConstraints(vide1, contr0);

		//Ajoute le Jlabel vide1 au panneau
		panneau.add(vide1);

		//Crée une instance de GridBagConstraints pour le positionnement du Jlabel vide2
		GridBagConstraints contr1 = new GridBagConstraints();

		//Crée les contraintes de positionnement du Jlabel vide2

		//coordonnée x dans le quadrillage
		contr1.gridx = 2;
		//coordonnée y dans le quadrillage
		contr1.gridy = 0;
		//hauteur standard
		contr1.gridheight = 1;
		//largeur standard
		contr1.gridwidth = 1;
		//remplit tout l'espace dans la cellule
		contr1.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occupée par ce composant
		contr1.weightx = 1;
		//proportion d'espace vertical occupée par ce composant
		contr1.weighty = 0.1;
		//position du composant dans la cellule
		contr1.anchor = GridBagConstraints.CENTER;

		/**
		 * Crée le Jlabel contenant le label vide2
		 */
		JLabel vide2= new JLabel();

		//Affecte les contraintes au label vide2
		disposition1.setConstraints(vide2, contr1);

		//Ajoute le label vide2 au panneau
		panneau.add(vide2);


		// Crée une instance de GridBagConstraints pour le positionnement du message de bienvenue
		GridBagConstraints contr2 = new GridBagConstraints();

		// Crée les contraintes de positionnement du message de bienvenue

		// coordonnée x dans le quadrillage
		contr2.gridx = 1;
		// coordonnée y dans le quadrillage
		contr2.gridy = 0;
		// hauteur standard
		contr2.gridheight = 1;
		// largeur standard
		contr2.gridwidth = 1;
		// remplit tout l'espace dans la cellule
		contr2.fill = GridBagConstraints.BOTH;
		// proportion d'espace horizontal occupée par ce composant
		contr2.weightx = 1;
		// proportion d'espace vertical occupée par ce composant
		contr2.weighty = 0.1;
		// position du composant dans la cellule
		contr2.anchor = GridBagConstraints.CENTER;

		/**
		 * Crée le label contenant le message de bienvenue qui est centré sur le JLabel
		 */
		JLabel messageBienvenue= new JLabel("Bienvenue sur la page d'accueil du programme de dessin de véhicule",SwingConstants.CENTER);
		messageBienvenue.setOpaque(true);
		messageBienvenue.setBackground(Color.white);
		messageBienvenue.setForeground(Color.black);

		// Affecte les contraintes au message de bienvenue
		disposition1.setConstraints(messageBienvenue, contr2);

		// Ajoute le message de bienvenue au panneau
		panneau.add(messageBienvenue);

		/**
		 * Crée une JComBoBox proposant une liste de véhicules et le place
		 * sur la gauche de la page d'accueil
		 */

		// Crée une instance de GridBagConstraints pour le positionnement de la JComboBox
		GridBagConstraints contr3 = new GridBagConstraints();

		// Crée les contraintes de positionnement de la JComboBox

		// coordonnée x dans le quadrillage
		contr3.gridx = 0;
		// coordonnée y dans le quadrillage
		contr3.gridy = 1;
		// hauteur standard
		contr3.gridheight = 1;
		//cette cellule est 2 fois plus large que les autres
		contr3.gridwidth = 2;
		// proportion d'espace horizontal occupée par ce composant
		contr3.weightx = 1;
		// proportion d'espace vertical occupée par ce composant
		contr3.weighty = 1;
		// position du composant dans la cellule
		contr3.anchor = GridBagConstraints.WEST;

		/**
		 * JComboBox permettant de choisir le type de véhicule
		 */
		choixVehicule= new JComboBox<Object>(choix);

		// Affecte les contraintes de positionnement à la JComboBox
		disposition1.setConstraints(choixVehicule, contr3);
		// Ajoute la JComboBox au panneau
		panneau.add(choixVehicule);

		/**
		 * Crée un bouton "charger" permettant de charger un fichier existant et le place
		 * sur la partie droite de la page d'accueil
		 */

		// Crée une instance de GridBagConstraints pour le positionnement du bouton "charger"
		GridBagConstraints contr4 = new GridBagConstraints();

		// Crée les contraintes de positionnement du bouton "charger"

		// coordonnée x dans le quadrillage
		contr4.gridx = 2;
		// coordonnée y dans le quadrillage
		contr4.gridy = 1;
		// hauteur standard
		contr4.gridheight = 1;
		//largeur standard
		contr4.gridwidth = 1;
		// proportion d'espace horizontal occupée par ce composant
		contr4.weightx = 1;
		// proportion d'espace vertical occupée par ce composant
		contr4.weighty = 1;
		// position du composant dans la cellule
		contr4.anchor = GridBagConstraints.EAST;

		/**
		 * Bouton permettant de charger un fichier existant
		 */
		charger= new JButton("charger");
		// Affecte les contraintes à ce champ
		disposition1.setConstraints(charger, contr4);
		// Ajoute le bouton "charger" au panneau
		panneau.add(charger);



		/**
		 * Crée un bouton "valider" pour valider les choix faits
		 * et le positionne dans la zone sud de la fenêtre
		 */

		// Crée une instance de GridBagConstraints
		GridBagConstraints contr5 = new GridBagConstraints();

		// Crée les contraintes du butons "valider"
		// coordonnée x dans le quadrillage
		contr5.gridx = 0;
		// coordonnée y dans le quadrillage
		contr5.gridy = 2;
		// hauteur standard
		contr5.gridheight = 1;
		// cette cellule est 3 fois plus large que les autres
		contr5.gridwidth = 3;
		// proportion d'espace horizontal occupée par ce composant
		contr5.weightx = 1.0;
		// proportion d'espace vertical occupée par ce composant
		contr5.weighty = 1.0;
		// position du composant dans la cellule
		contr5.anchor = GridBagConstraints.CENTER;	

		/**
		 * création du bouton "valider"
		 */
		valider= new JButton("humour");

		// Affecte les contraintes au bouton "valider"
		disposition1.setConstraints(valider, contr5);
		// Ajoute le bouton "valider" au panneau
		panneau.add(valider);

		/**
		 * Crée une fenetre et lui affecte son contenu
		 */
		JFrame frame = new JFrame("Programme de dessin de véhicule");

		// disposition2 permet à l'image de se retailler dynamiquement lorsque la taille de la fenêtre est changée par l'utilisateur
		GridBagLayout disposition2 = new GridBagLayout();
		frame.setLayout(disposition2);
		//Crée une instance de GridBagConstraints pour que le panneau remplisse intégralement dans la fenêtre
		GridBagConstraints contr6 = new GridBagConstraints();

		//Crée les contraintes afin que le panneau remplisse intégralement dans la fenêtre

		//remplit tout l'espace dans la cellule
		contr6.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occupée par ce composant
		contr6.weightx = 1;
		//proportion d'espace vertical occupée par ce composant
		contr6.weighty = 1;

		//affecte les contraintes de remplissage au panneau
		disposition2.setConstraints(panneau,contr6);


		//panneau.setMinimumSize(new Dimension(panneauImage.image.getHeight(),panneauImage.image.getWidth()));

		// ajoute le panneau à la fenêtre
		frame.add(panneau);



		// donne une taille minimale à la fenêtre en fonction de l'image
		frame.setMinimumSize(new Dimension(PanneauImage.image.getHeight(),PanneauImage.image.getWidth()));

		// Affecte à la fenêtre des dimensions suffisantes pour prendre en compte tous les contrôles
		frame.pack();

		//empêche l'utilisateur d'editer le contenu de la variable filename
		filename.setEditable(false);

		//fait apparaître le nom du fichier séléctionné sur la fenêtre
		frame.add(filename);

		// Affiche la fenêtre
		frame.setVisible(true);


		// Ferme l'application lorsque la fenêtre est fermée
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* effectue les actions appropriées lorsque l'utilisateur intéragit avec les boutons (charger ou valider) 
		 * ou la JComboBox choixVehicule de la page d'accueil. Toutes ces actions sont gérées par la classe ecouteBouton*/
		EcouteBouton ecouteur = new EcouteBouton();
		valider.addActionListener(ecouteur);
		charger.addActionListener(ecouteur);
		choixVehicule.addItemListener(ecouteur);
	}
}


