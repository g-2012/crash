package gendarmerie;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Classe permettant de charger une photo dans un JPanel. Les objets de cette classe sont utilis�s par la classe PageAccueil
 *  pour g�n�rer une image de fond
 * 
 * @author VCARON
 */
public class PanneauImage extends JPanel{

	/**
	 *  Le champ serialVersionUID est utilis� lors de la d�s�rialization afin de s'assurer que les versions des classes Java 
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
	public PanneauImage() { // permet de g�rer les exceptions...
		try {
			// on instancie la variable image et on lui dit quelle image elle doit g�n�rer
			image = ImageIO.read(new File("Logo_Gendarmerie_Nationale_Francaise.jpg"));

		} catch (IOException ex) {
			//programme � executer si une IO exception est lev�e
			System.out.println("Je ne peux pas lire le fichier image");
		}
	}

	/**
	 * m�thode paintComponent dessinant l'image de fond
	 * @param g est le composant graphique qui va contenir l'image
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		if (image != null) { //S'il y a une image, il faut la dessiner

			//La hauteur de l'image dessin�e correspond � la hauteur de l'image contenue dans le fichier
			int height = this.getSize().height;

			//La largeur de l'image dessin�e correspond � la largeur de l'image contenue dans le fichier
			int width = this.getSize().width;

			/*dessine l'image avec les param�tres de hauteur et de largeur sp�cifi�e et place le coin sup�rieur gauche
			 * de l'image aux coordonn�es (0,0) de la fen�tre d'affichage
			 */
			g.drawImage(image,0,0, width, height, this);
		}
	}
}
