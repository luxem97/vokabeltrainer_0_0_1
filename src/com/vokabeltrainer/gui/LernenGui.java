package com.vokabeltrainer.gui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

public class LernenGui extends JFrame {
	private final int WIDTH = 430;
	private final int HEIGHT = 700;
	Dimension screenSize;

	public LernenGui() {
		super();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(true);
		this.setLocation((int) screenSize.getWidth() / 2 + 250, (int) screenSize.getHeight() / 2 - 300);
		this.setTitle("Lernmodus! :)");
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		this.setIconImage(icon);

		this.setVisible(true);
	}
	
}
