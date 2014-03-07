package gendarmerie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;


public class charger implements ActionListener {
	
	 public void actionPerformed(ActionEvent e) {
		 JFileChooser c = new JFileChooser();
	    		  int rVal = c.showOpenDialog(null);
	    	      if(rVal == JFileChooser.APPROVE_OPTION) {
	    	    	  pageAccueil.filename.setText(c.getSelectedFile().getName());
	    	        pageAccueil.dir.setText(c.getCurrentDirectory().toString());
	    	      }
	    	      if (rVal == JFileChooser.CANCEL_OPTION) {
	    	    	  pageAccueil.filename.setText("You pressed cancel");
	    	    	  pageAccueil.dir.setText("");
	    	      }
	    	    }
	    	  }