package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class popup implements ActionListener {
	public void actionPerformed(ActionEvent événement) {
		JOptionPane.showConfirmDialog(null,
		"je parie que tu veux dérouler autre chose qu'une liste...",
		"lecteur de pensée",
		JOptionPane.PLAIN_MESSAGE);
		}

}