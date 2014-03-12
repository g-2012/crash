package gendarmerie;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Classe permettant de charger une photo dans un JPanel. Les objets de cette classe sont utilisés par la classe pageAccueil
 *  pour générer une image de fond
 * 
 * @author VCARON
 */
public class PanneauImage extends JPanel{

	/**
	 *  Le champ serialVersionUID est utilisé lors de la désérialization afin de s'assurer que les versions des classes Java 
	 *  soient concordantes. Si ce n'est pas le cas, une InvalidClassException sera levée
	 */
	private static final long serialVersionUID = 1L;


	protected static BufferedImage image;

	public PanneauImage() { // permet de gérer les exceptions...
		try {
			image = ImageIO.read(new File("Logo_Gendarmerie_Nationale_Francaise.jpg"));

		} catch (IOException ex) {
			System.out.println("Je ne peux pas lire le fichier image");
		}
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g); // méthode paint dessinant l'image de fond
		if (image != null) { //S'il y a une image, il faut la dessiner
			int height = this.getSize().height;
			int width = this.getSize().width;
			g.drawImage(image,0,0, width, height, this);
		}
	}
}
