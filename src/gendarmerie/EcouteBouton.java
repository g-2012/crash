package gendarmerie;

import java.awt.event.*;

import javax.swing.*;

/**
 * Classe qui effectue les actions appropriées lorsque l'utilisateur intéragit avec les boutons ("charger" ou "valider") 
 * ou la JComboBox "choixVehicule" de la page d'accueil.
 * 
 * @author VCARON
 */
public class EcouteBouton implements ActionListener, ItemListener{

	/**
	 * Méthode effectuée lorsque le bouton "charger" ou le bouton "valider" est cliqué sur la page d'accueil
	 * @param e est l'action sur le bouton "charger" ou sur le bouton "valider" de la page d'accueil
	 */

	public void actionPerformed(ActionEvent e) {

		// boutonClique stocke sur quel bouton l'utilisateur a cliqué
		JButton boutonClique = (JButton) e.getSource();

		if (boutonClique == PageAccueil.charger) {// méthode lancée si le bouton "charger" est cliqué
			JFileChooser c = new JFileChooser();
			int rVal = c.showOpenDialog(null);
			if(rVal == JFileChooser.APPROVE_OPTION) {
				PageAccueil.filename.setText(c.getSelectedFile().getName());
			}
			if (rVal == JFileChooser.CANCEL_OPTION) {
				PageAccueil.filename.setText("You pressed cancel");
			}
		}else if(boutonClique == PageAccueil.valider) {// méthode lancée si le bouton "valider" est cliqué
			JOptionPane.showConfirmDialog(null,
					"Java n'est pas ma tasse de thé...Huhuhu!!!!Humour de MERDE!!!",
					"test",
					JOptionPane.PLAIN_MESSAGE);

		} 
	}

	/**
	 * Méthode effectuée lorsque la combobox "choixvehicule" est actionnée sur la page d'accueil
	 * @param e est le clic sur a combobox "choixvehicule" de la page d'accueil
	 */
	public void itemStateChanged(ItemEvent e) {
		// choix stocke le fait que l'utilisateur a actionnée la JComboBox sur la page d'accueil

		JComboBox choix = ((JComboBox)e.getSource());
		if(choix == PageAccueil.choixVehicule) {// méthode lancée si la JComboBox de la page d'accueil est actionnée
			JOptionPane.showMessageDialog(null,
					"Javabien? Javamine!! Hahahaha....C'est nul!!!",
					"générateur de blagues nulles",
					JOptionPane.PLAIN_MESSAGE);
		}

	}
}
