package gendarmerie;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class valider implements ActionListener{
	public void actionPerformed(ActionEvent �v�nement) {
		JOptionPane.showConfirmDialog(null,
		"faudrait que �a marche...",
		"test",
		JOptionPane.PLAIN_MESSAGE);
		}

}
