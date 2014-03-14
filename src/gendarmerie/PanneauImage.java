package gendarmerie;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Classe permettant de charger une photo dans un JPanel. Les objets de cette classe sont utilisés par la classe PageAccueil
 *  pour générer une image de fond
 * 
 * @author VCARON
 */
public class PanneauImage extends JPanel{

	/**
	 *  Le champ serialVersionUID est utilisé lors de la désérialization afin de s'assurer que les versions des classes Java 
	 *  soient concordantes.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Variable qui va contenir l'image de fond
	 */
	protected static BufferedImage image;

	/**
	 * Constructeur de la classe PanneauImage
	 */
	public PanneauImage() { // permet de gérer les exceptions...
		try {
			// on instancie la variable image et on lui dit quelle image elle doit générer
			image = ImageIO.read(new File("Logo_Gendarmerie_Nationale_Francaise.jpg"));

		} catch (IOException ex) {
			//programme à executer si une IO exception est levée
			System.out.println("Je ne peux pas lire le fichier image");
		}
	}

	/**
	 * méthode paintComponent dessinant l'image de fond
	 * @param g est le composant graphique qui va contenir l'image
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) { //S'il y a une image, il faut la dessiner

			//La hauteur de l'image dessinée correspond à la hauteur de l'image contenue dans le fichier
			int height = this.getSize().height;

			//La largeur de l'image dessinée correspond à la largeur de l'image contenue dans le fichier
			int width = this.getSize().width;

			/*dessine l'image avec les paramètres de hauteur et de largeur spécifiée et place le coin supérieur gauche
			 * de l'image aux coordonnées (0,0) de la fenêtre d'affichage
			 */
			g.drawImage(image,0,0, width, height, this);
		}
	}
}
