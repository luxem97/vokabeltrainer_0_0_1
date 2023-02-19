package com.vokabeltrainer.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SpringLayout;

public class MenuGui extends JFrame {
	private final int WIDTH = 430;
	private final int HEIGHT = 240;

	private JButton eingabe;
	private JButton lernen;

	public MenuGui() {
		super();

		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setTitle("Menü");
		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		this.setIconImage(icon);

		Container contentPane = this.getContentPane();

		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);

		eingabe = new JButton("Neue Vokabeln eingeben.");
		lernen = new JButton("Vokabeln lernen.");

		this.add(eingabe);
		this.add(lernen);

		eingabe.addActionListener(Event -> {
			new EingabeGui();
		});
		lernen.addActionListener(Event -> {
			new LernenGui();
		});
		layout.putConstraint(SpringLayout.WEST, eingabe, 50, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, eingabe, 50, SpringLayout.NORTH, contentPane);

		layout.putConstraint(SpringLayout.WEST, lernen, 50, SpringLayout.EAST, eingabe);
		layout.putConstraint(SpringLayout.NORTH, lernen, 50, SpringLayout.NORTH, contentPane);

		this.setVisible(true);
	}
}
