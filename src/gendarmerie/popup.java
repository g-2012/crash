package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 * Classe g�rant les actions � faire lorsque l'utilisateur presse la JComboBox
 * de la page d'accueil
 * @author VCARON
 *
 */
public class popup implements ActionListener {
	public void actionPerformed(ActionEvent �v�nement) {
		JOptionPane.showConfirmDialog(null,
				"je parie que tu veux d�rouler autre chose qu'une liste...",
				"lecteur de pens�e",
				JOptionPane.PLAIN_MESSAGE);
	}

}