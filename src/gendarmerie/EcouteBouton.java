package gendarmerie;

import java.awt.event.*;

import javax.swing.*;

/**
 * Classe qui effectue les actions appropri�es lorsque l'utilisateur int�ragit avec les boutons ("charger" ou "valider") 
 * ou la JComboBox "choixVehicule" de la page d'accueil.
 * 
 * @author VCARON
 */
public class EcouteBouton implements ActionListener, ItemListener{

	/**
	 * M�thode effectu�e lorsque le bouton "charger" ou le bouton "valider" est cliqu� sur la page d'accueil
	 * @param e est l'action sur le bouton "charger" ou sur le bouton "valider" de la page d'accueil
	 */

	public void actionPerformed(ActionEvent e) {

		// boutonClique stocke sur quel bouton l'utilisateur a cliqu�
		JButton boutonClique = (JButton) e.getSource();

		if (boutonClique == PageAccueil.charger) {// m�thode lanc�e si le bouton "charger" est cliqu�
			JFileChooser c = new JFileChooser();
			int rVal = c.showOpenDialog(null);
			if(rVal == JFileChooser.APPROVE_OPTION) {
				PageAccueil.filename.setText(c.getSelectedFile().getName());
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				PageAccueil.filename.setText("You pressed cancel");
			}
		}else if(boutonClique == PageAccueil.valider) {// m�thode lanc�e si le bouton "valider" est cliqu�
			JOptionPane.showConfirmDialog(null,
					"Java n'est pas ma tasse de th�...Huhuhu!!!!Humour de MERDE!!!",
					"test",
					JOptionPane.PLAIN_MESSAGE);

		} 
	}

	/**
	 * M�thode effectu�e lorsque la combobox "choixvehicule" est actionn�e sur la page d'accueil
	 * @param e est le clic sur a combobox "choixvehicule" de la page d'accueil
	 */
	public void itemStateChanged(ItemEvent e) {
		// choix stocke le fait que l'utilisateur a actionn�e la JComboBox sur la page d'accueil

		JComboBox choix = ((JComboBox)e.getSource());
		if(choix == PageAccueil.choixVehicule) {// m�thode lanc�e si la JComboBox de la page d'accueil est actionn�e
			JOptionPane.showMessageDialog(null,
					"Javabien? Javamine!! Hahahaha....C'est nul!!!",
					"g�n�rateur de blagues nulles",
					JOptionPane.PLAIN_MESSAGE);
		}

	}
}
