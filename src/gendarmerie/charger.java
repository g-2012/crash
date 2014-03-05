package gendarmerie;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class charger implements ActionListener {
	
	 public void actionPerformed(ActionEvent e) {
		 JFileChooser c = new JFileChooser();
	    		  c.showOpenDialog(null);
	    }


}