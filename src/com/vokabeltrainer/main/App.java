package com.vokabeltrainer.main;

import java.sql.SQLException;

import com.vokabeltrainer.data.SqlHandlerVoc;
import com.vokabeltrainer.gui.MenuGui;

public class App {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		String first = "firstVoc";

		String second = "secondVoc";

		VokabelTrainer trainer1 = new VokabelTrainer();

		SqlHandlerVoc handler1 = new SqlHandlerVoc();
		
		MenuGui menu1 = new MenuGui();

	}

}
