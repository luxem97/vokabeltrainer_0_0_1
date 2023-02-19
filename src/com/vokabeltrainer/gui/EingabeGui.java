package com.vokabeltrainer.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import com.vokabeltrainer.main.Vokabel;

public class EingabeGui extends JFrame {
	private final int WIDTH = 430;
	private final int HEIGHT = 240;

	private JButton submit;
	//private JButton menu;
	private JTextField textField1;
	private JTextField textField2;
	private Dimension screenSize;

	public EingabeGui() {
		super();
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setSize(new Dimension(WIDTH, HEIGHT));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setLocation((int) screenSize.getWidth() / 2 - 690, (int) screenSize.getHeight() / 2 - 200);
		this.setTitle("Gebe deine Vokabeln ein!");

		Image icon = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB_PRE);
		this.setIconImage(icon);
		Container contentPane = this.getContentPane();

		SpringLayout layout = new SpringLayout();
		contentPane.setLayout(layout);

		textField1 = new JTextField(10);
		textField2 = new JTextField(10);
		textField1.setEditable(true);
		textField2.setEditable(true);

		submit = new JButton("submit");
		submit.addActionListener(Event -> {
			new Vokabel(textField1.getText(), textField2.getText(), "test");
		});
//		menu = new JButton("zurück zum Menü");
//		menu.addActionListener(Event -> {
//			new MenuGui();
//		});

//		contentPane.add(menu);
		contentPane.add(submit);
		contentPane.add(textField1);
		contentPane.add(textField2);

		layout.putConstraint(SpringLayout.WEST, textField1, 50, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, textField1, 50, SpringLayout.NORTH, contentPane);

		layout.putConstraint(SpringLayout.WEST, textField2, 50, SpringLayout.EAST, textField1);
		layout.putConstraint(SpringLayout.NORTH, textField2, 50, SpringLayout.NORTH, contentPane);

		layout.putConstraint(SpringLayout.WEST, submit, 50, SpringLayout.WEST, contentPane);
		layout.putConstraint(SpringLayout.NORTH, submit, 50, SpringLayout.NORTH, textField1);

//		layout.putConstraint(SpringLayout.EAST, menu, -16, SpringLayout.EAST, contentPane);
//		layout.putConstraint(SpringLayout.SOUTH, menu, -20, SpringLayout.SOUTH, contentPane);

		this.setVisible(true);
	}

}
