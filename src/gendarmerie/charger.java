package gendarmerie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;

/**
 * Classe gérant les actions à faire lorsque l'utilisateur presse le bouton "charger"
 * de la page d'accueil
 * 
 * @author VCARON
 */
public class charger implements ActionListener {

	/**
	 * Méthode effectuée  lorsque le bouton "charger" est pressé
	 * @param e est le clic sur le bouton "charger" de la page d'accueil
	 */
	public void actionPerformed(ActionEvent e) {
		JFileChooser c = new JFileChooser();
		int rVal = c.showOpenDialog(null);
		if(rVal == JFileChooser.APPROVE_OPTION) {
			pageAccueil.filename.setText(c.getSelectedFile().getName());
		}
		if (rVal == JFileChooser.CANCEL_OPTION) {
			pageAccueil.filename.setText("You pressed cancel");
		}
	}
}