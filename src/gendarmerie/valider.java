package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Classe g�rant les actions � faire lorsque l'utilisateur presse le bouton "valider"
 * de la page d'accueil
 * 
 * @author VCARON
 *
 */
public class valider implements ActionListener{

	/**
	 * M�thode effectu�e  lorsque le bouton "valider" est press�
	 * @param e est le clic sur le bouton "valider" de la page d'accueil
	 */
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showConfirmDialog(null,
				"faudrait que �a marche...",
				"test",
				JOptionPane.PLAIN_MESSAGE);
	}

}
