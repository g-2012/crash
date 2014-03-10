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
* utilis�e dans la classe charger pour stocker le nom du chemin dans lequel
* se trouve le nom du fichier que l'on veut charger
*/
static JTextField dir = new JTextField();

/**
* Constructeur de la page d'accueil. Il g�n�re une image de fond sur laquelle
* se superposent un message d'accueil et les diff�rents boutons permettant d'agir
*/
pageAccueil() {



/**
* cr�e une �tiquette permettant de mettre une image de fond � la page d'acccueil
*/
panneauImage panneau= new panneauImage();

/**
* Affecte un gestionnaire de pr�sentation GridBagLayout � cette �tiquette
*/
GridBagLayout disposition1 = new GridBagLayout();
//gridBagConstraints.gridwidth = java.awt.GridBagConstraints.RELATIVE;
panneau.setLayout(disposition1);

/**
* Cr�e le message de bienvenue et le positionne dans la zone nord de la fen�tre
*/

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
contr1.weighty = 0.1;
// position du composant dans la cellule
contr1.anchor = GridBagConstraints.NORTH;

/**
* Cr�e le message de bienvenue
*/
JLabel messageBienvenue= new JLabel();
messageBienvenue.setText("Bienvenue sur la page d'accueil du programme de dessin de v�hicule");
// Affecte les contraintes � ce champ
disposition1.setConstraints(messageBienvenue, contr1);
// Ajoute le champ � la fen�tre
panneau.add(messageBienvenue);

/**
* Cr�e un bouton popup proposant une liste de v�hicules et le place
* sur la gauche de la page d'accueil
*/

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
contr2.gridwidth = 2;
// proportion d'espace horizontal occup�e par ce composant
contr2.weightx = 1;
// proportion d'espace vertical occup�e par ce composant
contr2.weighty = 1;
// position du composant dans la cellule
contr2.anchor = GridBagConstraints.WEST;

/**
* ComboBox permettant de choisir le type de v�hicule
*/
String[] choix = { "voiture", "camion", "motocyclette"};
JComboBox choixVehicule= new JComboBox(choix);

// Affecte les contraintes � ce champ
disposition1.setConstraints(choixVehicule, contr2);
// Ajoute le champ � la fen�tre
panneau.add(choixVehicule);

/**
* Cr�e un bouton "charger" permettant de charger un fichier existant et le place
* sur la partie droite de la page d'accueil
*/

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
// proportion d'espace horizontal occup�e par ce composant
contr3.weightx = 1;
// proportion d'espace vertical occup�e par ce composant
contr3.weighty = 1;
// position du composant dans la cellule
contr3.anchor = GridBagConstraints.EAST;

/**
* Bouton permettant de charger un fichier existant
*/
JButton charger= new JButton("charger");
// Affecte les contraintes � ce champ
disposition1.setConstraints(charger, contr3);
// Ajoute le champ � la fen�tre
panneau.add(charger);



/**
* Cr�e un bouton "valider" pour valider les choix faits
* et le positionne dans la zone sud de la fen�tre
*/

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
// proportion d'espace horizontal occup�e par ce composant
contr4.weightx = 1.0;
// proportion d'espace vertical occup�e par ce composant
contr4.weighty = 1.0;
// position du composant dans la cellule
contr4.anchor = GridBagConstraints.CENTER;	

/**
* cr�ation du bouton "valider"
*/
JButton valider= new JButton("Valider");
// Affecte les contraintes � ce champ
disposition1.setConstraints(valider, contr4);
// Ajoute le champ � la fen�tre
panneau.add(valider);

/**
* Cr�e le cadre et lui affecte son contenu
*/
JFrame frame = new JFrame("page d'accueil");
GridBagLayout disposition2 = new GridBagLayout();
frame.setLayout(disposition2);
disposition2.setConstraints(panneau, contr1);


frame.add(panneau);



// Affecte � la fen�tre des dimensions suffisantes pour prendre en compte tous les contr�les
frame.pack();

// Cr�e une instance de GridBagConstraints
GridBagConstraints contr5 = new GridBagConstraints();
// Affecte les contraintes du champ Affichage
// coordonn�e x dans le quadrillage
contr5.gridx = 1;
// coordonn�e y dans le quadrillage
contr5.gridy = 3;
// cette cellule a la m�me hauteur que les autres
contr5.gridheight = 1;
// cette cellule est 6 fois plus large que les autres
contr5.gridwidth = 3;
// proportion d'espace horizontal occup�e par ce composant
contr5.weightx = 1.0;
// proportion d'espace vertical occup�e par ce composant
contr5.weighty = 1.0;
// position du composant dans la cellule
contr5.anchor = GridBagConstraints.CENTER;	


disposition1.setConstraints(filename, contr5);

filename.setEditable(false);
frame.add(filename);

System.out.println(filename.getText()+"bidibidi elephant dangereux");

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

