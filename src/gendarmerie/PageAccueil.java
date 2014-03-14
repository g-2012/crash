package gendarmerie;

import javax.swing.*;

import java.awt.*;

/**
 * Classe cr�ant la page d'accueil. L'image de fond est utilis�e en faisant appel � la classe PanneauImage. L'int�raction
 *  de l'utilisateur avec les boutons de la page est g�r�e par la classe EcouteBouton
 * 
 * @author VCARON
 *
 */


public class PageAccueil{

	/**
	 *utilis�e dans la classe EcouteBouton pour stocker le nom du fichier que l'on veut charger
	 */
	static JTextField filename = new JTextField();
	/**
	 * d�claration du bouton "charger" qui sera cr�e dans le constructeur
	 */
	public static JButton charger;
	/**
	 * d�claration du bouton "valider" qui sera cr�e dans le constructeur
	 */
	public static JButton valider;

	/**
	 * d�claration des choix qui seront propos�s par la combobox "choixVehicule"
	 */
	String[] choix = { "voiture", "camion", "motocyclette", "semi-remorque"};

	/**
	 * d�claration de la combobox "choixVehicule" qui sera cr�ee dans le constructeur
	 */
	public static JComboBox<Object> choixVehicule;


	/**
	 * Constructeur de la page d'accueil. Il g�n�re une image de fond sur laquelle se superposent un message d'accueil et 
	 * les diff�rents boutons permettant de lancer piloter l'application
	 */
	PageAccueil() {



		/**
		 * Instancie la classe panneauImage. La variable panneau charge une image qui sert d'image de fond 
		 * � la page d'accueil
		 */
		PanneauImage panneau= new PanneauImage();

		/**
		 * cr�e et affecte un gestionnaire de pr�sentation GridBagLayout � panneau qui va permettre de positionner 
		 * correctement les boutons et les messages sur le panneau
		 */
		GridBagLayout disposition1 = new GridBagLayout();
		panneau.setLayout(disposition1);

		/**
		 * Cr�e le message de bienvenue et le positionne dans la zone nord centr�e de la fen�tre. Pour centrer le message, 
		 * on cr�e 2 Jlabels vides qui encadrent le label contenant le message de bienvenue 
		 */

		//Cr�e une instance de GridBagConstraints pour le positionnement et la taille du Jlabel vide1
		GridBagConstraints contr0 = new GridBagConstraints();

		//Cr�e les contraintes de positionnement et de taille du Jlabel vide1

		//coordonn�e x dans le quadrillage
		contr0.gridx = 0;
		//coordonn�e y dans le quadrillage
		contr0.gridy = 0;
		//hauteur standard de la cellule
		contr0.gridheight = 1;
		//largeur standard de la cellule
		contr0.gridwidth = 1;
		//remplit tout l'espace dans la cellule
		contr0.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr0.weightx = 1;
		//proportion d'espace vertical occup�e par ce composant dans la cellule
		contr0.weighty = 0.1;
		//position du composant dans la cellule
		contr0.anchor = GridBagConstraints.CENTER;

		/**
		 * Cr�e le Jlabel vide1
		 */
		JLabel vide1= new JLabel();


		//Affecte les contraintes de positionnement et de taille au Jlabel vide1
		disposition1.setConstraints(vide1, contr0);

		//Ajoute le Jlabel vide1 au panneau
		panneau.add(vide1);

		//Cr�e une instance de GridBagConstraints pour le positionnement et la taille du Jlabel vide2
		GridBagConstraints contr1 = new GridBagConstraints();

		//Cr�e les contraintes de positionnement et de taille du Jlabel vide2

		//coordonn�e x dans le quadrillage
		contr1.gridx = 2;
		//coordonn�e y dans le quadrillage
		contr1.gridy = 0;
		//hauteur standard de la cellule
		contr1.gridheight = 1;
		//largeur standard de la cellule
		contr1.gridwidth = 1;
		//remplit tout l'espace dans la cellule
		contr1.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr1.weightx = 1;
		//proportion d'espace vertical occup�e par ce composant dans la cellule
		contr1.weighty = 0.1;
		//position du composant dans la cellule
		contr1.anchor = GridBagConstraints.CENTER;

		/**
		 * Cr�e le Jlabel contenant le label vide2
		 */
		JLabel vide2= new JLabel();

		//Affecte les contraintes de positionnement et de taille au Jlabel vide2
		disposition1.setConstraints(vide2, contr1);

		//Ajoute le Jlabel vide2 au panneau
		panneau.add(vide2);


		// Cr�e une instance de GridBagConstraints pour le positionnement et la taille du message de bienvenue
		GridBagConstraints contr2 = new GridBagConstraints();

		// Cr�e les contraintes de positionnement et de taille du message de bienvenue

		// coordonn�e x dans le quadrillage
		contr2.gridx = 1;
		// coordonn�e y dans le quadrillage
		contr2.gridy = 0;
		// hauteur standard de la cellule
		contr2.gridheight = 1;
		// largeur standard de la cellule
		contr2.gridwidth = 1;
		// remplit tout l'espace dans la cellule
		contr2.fill = GridBagConstraints.BOTH;
		// proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr2.weightx = 1;
		// proportion d'espace vertical occup�e par ce composant dans la cellule
		contr2.weighty = 0.1;
		// position du composant dans la cellule
		contr2.anchor = GridBagConstraints.CENTER;

		/**
		 * Cr�e le label contenant le message de bienvenue qui est centr� sur le JLabel. Le message est �crit en noir sur 
		 * fond blanc
		 */
		JLabel messageBienvenue= new JLabel("Bienvenue sur la page d'accueil du programme de dessin de v�hicule",SwingConstants.CENTER);
		messageBienvenue.setOpaque(true);
		messageBienvenue.setBackground(Color.white);
		messageBienvenue.setForeground(Color.black);

		// Affecte les contraintes de positionnement et de taille au message de bienvenue
		disposition1.setConstraints(messageBienvenue, contr2);

		// Ajoute le message de bienvenue au panneau
		panneau.add(messageBienvenue);

		/**
		 * Cr�e une JComBoBox proposant une liste de v�hicules et le place sur la gauche de la page d'accueil
		 */

		// Cr�e une instance de GridBagConstraints pour le positionnement et la taille de la JComboBox
		GridBagConstraints contr3 = new GridBagConstraints();

		// Cr�e les contraintes de positionnement et de taille de la JComboBox

		// coordonn�e x dans le quadrillage
		contr3.gridx = 0;
		// coordonn�e y dans le quadrillage
		contr3.gridy = 1;
		// hauteur standard de la cellule
		contr3.gridheight = 1;
		//cette cellule est 2 fois plus large que les autres
		contr3.gridwidth = 2;
		//ipadx et ipady indiquent le nombre de pixels dont on doit accro�tre le composant en plus de sa taille minimum 
		contr3.ipadx= 50;
		contr3.ipady= 50;
		// proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr3.weightx = 1;
		// proportion d'espace vertical occup�e par ce composant dans la cellule
		contr3.weighty = 1;
		// position du composant dans la cellule
		contr3.anchor = GridBagConstraints.WEST;

		/**
		 * JComboBox permettant de choisir le type de v�hicule
		 */
		choixVehicule= new JComboBox<Object>(choix);

		// Affecte les contraintes de positionnement et de taille � la JComboBox
		disposition1.setConstraints(choixVehicule, contr3);
		// Ajoute la JComboBox au panneau
		panneau.add(choixVehicule);

		/**
		 * Cr�e un bouton "charger" permettant de charger un fichier existant et le place sur la partie droite 
		 * de la page d'accueil
		 */

		// Cr�e une instance de GridBagConstraints pour le positionnement et la taille du bouton "charger"
		GridBagConstraints contr4 = new GridBagConstraints();

		// Cr�e les contraintes de positionnement et de taille du bouton "charger"

		// coordonn�e x dans le quadrillage
		contr4.gridx = 2;
		// coordonn�e y dans le quadrillage
		contr4.gridy = 1;
		// hauteur standard de la cellule
		contr4.gridheight = 1;
		//largeur standard de la cellule
		contr4.gridwidth = 1;
		//ipadx et ipady indiquent le nombre de pixels dont on doit accro�tre le composant en plus de sa taille minimum 
		contr4.ipadx= 50;
		contr4.ipady= 50;
		// proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr4.weightx = 1;
		// proportion d'espace vertical occup�e par ce composant dans la cellule
		contr4.weighty = 1;
		// position du composant dans la cellule
		contr4.anchor = GridBagConstraints.EAST;

		/**
		 * Instanciation du bouton "charger" permettant de charger un fichier existant
		 */
		charger= new JButton("charger");
		// Affecte les contraintes de positionnement et de taille au bouton "charger"
		disposition1.setConstraints(charger, contr4);
		// Ajoute le bouton "charger" au panneau
		panneau.add(charger);



		/**
		 * Cr�e un bouton "valider" pour valider les choix faits et le positionne dans la zone sud de la fen�tre
		 */

		// Cr�e une instance de GridBagConstraints pour le positionnement et la taille du bouton "valider"
		GridBagConstraints contr5 = new GridBagConstraints();

		// Cr�e les contraintes de positionnement et de taille du bouton "valider"
		// coordonn�e x dans le quadrillage
		contr5.gridx = 0;
		// coordonn�e y dans le quadrillage
		contr5.gridy = 2;
		// hauteur standard de la cellule
		contr5.gridheight = 1;
		// cette cellule est 3 fois plus large que les autres
		contr5.gridwidth = 3;
		//ipadx et ipady indiquent le nombre de pixels dont on doit accro�tre le composant en plus de sa taille minimum 
		contr5.ipadx= 50;
		contr5.ipady= 50;
		// proportion d'espace horizontal occup�e par ce composant dans la cellule
		contr5.weightx = 1;
		// proportion d'espace vertical occup�e par ce composant dans la cellule
		contr5.weighty = 1;
		// position du composant dans la cellule
		contr5.anchor = GridBagConstraints.CENTER;	

		/**
		 * cr�ation du bouton "valider"
		 */
		valider= new JButton("humour");

		// Affecte les contraintes de positionnement et de taille au bouton "valider"
		disposition1.setConstraints(valider, contr5);
		// Ajoute le bouton "valider" au panneau
		panneau.add(valider);

		/**
		 * Cr�e une fenetre et lui affecte son contenu
		 */
		JFrame frame = new JFrame("Programme de dessin de v�hicule");

		/* disposition2 permet � l'image de se retailler dynamiquement lorsque la taille de la fen�tre est chang�e par 
		l'utilisateur*/
		GridBagLayout disposition2 = new GridBagLayout();
		frame.setLayout(disposition2);
		//Cr�e une instance de GridBagConstraints pour que le panneau remplisse int�gralement dans la fen�tre
		GridBagConstraints contr6 = new GridBagConstraints();

		//Cr�e les contraintes afin que le panneau remplisse int�gralement dans la fen�tre

		//remplit tout l'espace dans la cellule
		contr6.fill = GridBagConstraints.BOTH;
		//proportion d'espace horizontal occup�e par ce composant
		contr6.weightx = 1;
		//proportion d'espace vertical occup�e par ce composant
		contr6.weighty = 1;

		//affecte les contraintes de remplissage au panneau
		disposition2.setConstraints(panneau,contr6);

		// ajoute le panneau � la fen�tre
		frame.add(panneau);

		// donne une taille minimale � la fen�tre en fonction de l'image
		frame.setMinimumSize(new Dimension(PanneauImage.image.getHeight(),PanneauImage.image.getWidth()));

		// Affecte � la fen�tre des dimensions suffisantes pour prendre en compte tous les contr�les
		frame.pack();

		//emp�che l'utilisateur d'editer le contenu de la variable filename
		filename.setEditable(false);

		//fait appara�tre le nom du fichier s�l�ctionn� sur la fen�tre
		frame.add(filename);

		// Affiche la fen�tre
		frame.setVisible(true);


		// Ferme l'application lorsque la fen�tre est ferm�e
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		/* effectue les actions appropri�es lorsque l'utilisateur int�ragit avec les boutons ("charger" ou "valider") 
		 * ou la JComboBox "choixVehicule" de la page d'accueil. Toutes ces actions sont g�r�es par la classe EcouteBouton*/
		EcouteBouton ecouteur = new EcouteBouton();
		valider.addActionListener(ecouteur);
		charger.addActionListener(ecouteur);
		choixVehicule.addItemListener(ecouteur);
	}
}


