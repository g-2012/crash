package gendarmerie;

import javax.swing.*;

import java.awt.*;

import java.awt.Graphics;
import java.awt.GridBagConstraints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * Classe permettant de charger une photo dans un JPanel. Les objets de cette classe 
 * sont utilisés par les classes cadre et cadre2 pour générer une image de fond
 * @author VCARON
 *
 */
public class panneauImage extends JPanel{

    private BufferedImage image;

    public panneauImage() { // permet de gérer les exceptions...
       try {                
          image = ImageIO.read(new File("lenaHequa.jpg"));
       } catch (IOException ex) {
       }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // méthode paint dessinant l'image de fond
        if (image != null) { //S'il y a une image, il faut la dessiner
            int height = this.getSize().height;
            int width = this.getSize().width;       
            g.drawImage(image,0,0, width, height, this);
        } 
}
}
    
    
   