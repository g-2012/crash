package gendarmerie;

import javax.swing.*;

import java.awt.*;

/**
 * Classe cr�ant la page d'accueil. L'image de fond est utilis�e en faisant appel � 
 * la classe  panneauImage. Les boutons et leur dispostion sont g�r�s par la classe cadre
 * 
 * @author VCARON
 *
 */


public class pageAccueil extends JPanel{

/**
* utilis�e dans la classe charger pour stocker le nom du fichier que l'on veut charger
*/
static JTextField filename = new JTextField();


/**
* Constructeur de la page d'accueil. Il g�n�re une image de fond sur laquelle
* se superposent un message d'accueil et les diff�rents boutons permettant d'agir
*/
pageAccueil() {



/**
* Instancie la classe panneauImage permettant de mettre une image de fond � la page d'acccueil
*/
panneauImage panneau= new panneauImage();

/**
* Affecte un gestionnaire de pr�sentation GridBagLayout � panneau qui va permettre de positionner correctement
* les boutons et les messages sur le panneau
*/
GridBagLayout disposition1 = new GridBagLayout();
panneau.setLayout(disposition1);

/**
* Cr�e le message de bienvenue et le positionne dans la zone nord centr�e de la fen�tre. Pour centrer le message, on cr�e
* 2 labels vides qui encadrent le label contenant le message de bienvenue 
*/

//Cr�e une instance de GridBagConstraints pour le positionnement du label vide1
GridBagConstraints contr0 = new GridBagConstraints();

//Cr�e les contraintes de positionnement d'un champ

//coordonn�e x dans le quadrillage
contr0.gridx = 0;
//coordonn�e y dans le quadrillage
contr0.gridy = 0;
//hauteur standard
contr0.gridheight = 1;
//largeur standard
contr0.gridwidth = 1;
//remplit tout l'espace dans la cellule
contr0.fill = GridBagConstraints.BOTH;
//proportion d'espace horizontal occup�e par ce composant
contr0.weightx = 1;
//proportion d'espace vertical occup�e par ce composant
contr0.weighty = 0.1;
//position du composant dans la cellule
contr0.anchor = GridBagConstraints.CENTER;

/**
* Cr�e le label vide1
*/
JLabel vide1= new JLabel();


//Affecte les contraintes au label vide1
disposition1.setConstraints(vide1, contr0);

//Ajoute le label vide1 au panneau
panneau.add(vide1);

//Cr�e une instance de GridBagConstraints pour le positionnement du label vide2
GridBagConstraints contr1 = new GridBagConstraints();

//Cr�e les contraintes de positionnement du label vide2e

//coordonn�e x dans le quadrillage
contr1.gridx = 2;
//coordonn�e y dans le quadrillage
contr1.gridy = 0;
//hauteur standard
contr1.gridheight = 1;
//largeur standard
contr1.gridwidth = 1;
//remplit tout l'espace dans la cellule
contr1.fill = GridBagConstraints.BOTH;
//proportion d'espace horizontal occup�e par ce composant
contr1.weightx = 1;
//proportion d'espace vertical occup�e par ce composant
contr1.weighty = 0.1;
//position du composant dans la cellule
contr1.anchor = GridBagConstraints.CENTER;

/**
* Cr�e le label contenant le label vide2
*/
JLabel vide2= new JLabel();

//Affecte les contraintes au label vide2
disposition1.setConstraints(vide2, contr1);

//Ajoute le label vide2 au panneau
panneau.add(vide2);


// Cr�e une instance de GridBagConstraints pour le positionnement du message de bienvenue
GridBagConstraints contr2 = new GridBagConstraints();

// Cr�e les contraintes de positionnement du message de bienvenue

// coordonn�e x dans le quadrillage
contr2.gridx = 1;
// coordonn�e y dans le quadrillage
contr2.gridy = 0;
// hauteur standard
contr2.gridheight = 1;
// largeur standard
contr2.gridwidth = 1;
// remplit tout l'espace dans la cellule
contr2.fill = GridBagConstraints.BOTH;
// proportion d'espace horizontal occup�e par ce composant
contr2.weightx = 1;
// proportion d'espace vertical occup�e par ce composant
contr2.weighty = 0.1;
// position du composant dans la cellule
contr2.anchor = GridBagConstraints.CENTER;

/**
* Cr�e le label contenant le message de bienvenue qui est centr� sur la JLabel
*/
JLabel messageBienvenue= new JLabel("Bienvenue sur la page d'accueil du programme de dessin de v�hicule",SwingConstants.CENTER);
messageBienvenue.setOpaque(true);
messageBienvenue.setBackground(Color.white);
messageBienvenue.setForeground(Color.black);

// Affecte les contraintes au message de bienvenue
disposition1.setConstraints(messageBienvenue, contr2);

// Ajoute le message de bienvenue au panneau
panneau.add(messageBienvenue);

/**
* Cr�e une JComBoBox proposant une liste de v�hicules et le place
* sur la gauche de la page d'accueil
*/

// Cr�e une instance de GridBagConstraints pour le positionnement de la JComboBox
GridBagConstraints contr3 = new GridBagConstraints();

// Cr�e les contraintes de positionnement de la JComboBox

// coordonn�e x dans le quadrillage
contr3.gridx = 0;
// coordonn�e y dans le quadrillage
contr3.gridy = 1;
// hauteur standard
contr3.gridheight = 1;
//cette cellule est 2 fois plus large que les autres
contr3.gridwidth = 2;
// proportion d'espace horizontal occup�e par ce composant
contr3.weightx = 1;
// proportion d'espace vertical occup�e par ce composant
contr3.weighty = 1;
// position du composant dans la cellule
contr3.anchor = GridBagConstraints.WEST;

/**
* JComboBox permettant de choisir le type de v�hicule
*/
String[] choix = { "voiture", "camion", "motocyclette"};
JComboBox choixVehicule= new JComboBox(choix);

// Affecte les contraintes de positionnement � la JComboBox
disposition1.setConstraints(choixVehicule, contr3);
// Ajoute la JComboBox au panneau
panneau.add(choixVehicule);

/**
* Cr�e un bouton "charger" permettant de charger un fichier existant et le place
* sur la partie droite de la page d'accueil
*/

// Cr�e une instance de GridBagConstraints pour le positionnement du bouton "charger"
GridBagConstraints contr4 = new GridBagConstraints();

// Cr�e les contraintes de positionnement du bouton "charger"

// coordonn�e x dans le quadrillage
contr4.gridx = 2;
// coordonn�e y dans le quadrillage
contr4.gridy = 1;
// hauteur standard
contr4.gridheight = 1;
//largeur standard
contr4.gridwidth = 1;
// proportion d'espace horizontal occup�e par ce composant
contr4.weightx = 1;
// proportion d'espace vertical occup�e par ce composant
contr4.weighty = 1;
// position du composant dans la cellule
contr4.anchor = GridBagConstraints.EAST;

/**
* Bouton permettant de charger un fichier existant
*/
JButton charger= new JButton("charger");
// Affecte les contraintes � ce champ
disposition1.setConstraints(charger, contr4);
// Ajoute le bouton "charger" au panneau
panneau.add(charger);



/**
* Cr�e un bouton "valider" pour valider les choix faits
* et le positionne dans la zone sud de la fen�tre
*/

// Cr�e une instance de GridBagConstraints
GridBagConstraints contr5 = new GridBagConstraints();

// Cr�e les contraintes du butons "valider"
// coordonn�e x dans le quadrillage
contr5.gridx = 1;
// coordonn�e y dans le quadrillage
contr5.gridy = 2;
// hauteur standard
contr5.gridheight = 1;
// cette cellule est 3 fois plus large que les autres
contr5.gridwidth = 3;
// proportion d'espace horizontal occup�e par ce composant
contr5.weightx = 1.0;
// proportion d'espace vertical occup�e par ce composant
contr5.weighty = 1.0;
// position du composant dans la cellule
contr5.anchor = GridBagConstraints.CENTER;	

/**
* cr�ation du bouton "valider"
*/
JButton valider= new JButton("Valider");

// Affecte les contraintes au bouton "valider"
disposition1.setConstraints(valider, contr5);
// Ajoute le bouton "valider" au panneau
panneau.add(valider);

/**
* Cr�e le cadre et lui affecte son contenu
*/
JFrame frame = new JFrame("page d'accueil");

// disposition2 permet � l'image de se retailler dynamiquement lorsque la taille de la fen�tre est chang�e par l'utilisateur
GridBagLayout disposition2 = new GridBagLayout();
frame.setLayout(disposition2);
//Cr�e une instance de GridBagConstraints pour le positionnement du message de bienvenue
GridBagConstraints contr6 = new GridBagConstraints();

//Cr�e les contraintes de positionnement du panneau

//coordonn�e x dans le quadrillage
contr6.gridx = 1;
//coordonn�e y dans le quadrillage
contr6.gridy = 0;
//hauteur standard
contr6.gridheight = 1;
//largeur standard
contr6.gridwidth = 3;
//remplit tout l'espace dans la cellule
contr6.fill = GridBagConstraints.BOTH;
//proportion d'espace horizontal occup�e par ce composant
contr6.weightx = 1;
//proportion d'espace vertical occup�e par ce composant
contr6.weighty = 0.1;
//position du composant dans la cellule
contr6.anchor = GridBagConstraints.CENTER;

//affecte les contraintes de positionnement au panneau
disposition2.setConstraints(panneau,contr6);

// ajoute le panneau � la fen�tre
frame.add(panneau);

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

// effectue les actions appropri�es pour le bouton valider
valider validation = new valider();
valider.addActionListener(validation);

// effectue les actions appropri�es pour le bouton charger
charger chargement = new charger();
charger.addActionListener(chargement);
}
}

