package gendarmerie;

import javax.swing.*;

import com.sun.media.sound.Toolkit;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import java.awt.Image;


class BackgroundPanel extends JPanel
{
    Image img;
    public BackgroundPanel()
    {
        // Read the image and place it in the variable img so it can be used in paintComponent
        //img = Toolkit.getDefaultToolkit().createImage("D:/lenna_complete.jpg");
    }

    public void paintComponent(Graphics g)
    {
        g.drawImage(img, 0, 0, null); // draw the image
    }
}
