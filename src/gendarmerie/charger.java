package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class charger implements ActionListener {
	public void actionPerformed(ActionEvent événement) {
		JOptionPane.showConfirmDialog(null,
		"faudrait que ça marche...",
		"test",
		JOptionPane.PLAIN_MESSAGE);
		}

}
