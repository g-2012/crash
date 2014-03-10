package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Classe gérant les actions à faire lorsque l'utilisateur presse le bouton "valider"
 * de la page d'accueil
 * 
 * @author VCARON
 *
 */
public class valider implements ActionListener{

	/**
	 * Méthode effectuée  lorsque le bouton "valider" est pressé
	 * @param e est le clic sur le bouton "valider" de la page d'accueil
	 */
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(null,
				"Java n'est pas ma tasse de thé...Hahaha!!!!",
				"test",
				JOptionPane.PLAIN_MESSAGE);
	}

}
