package com.vokabeltrainer.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lombok.Getter;
@Getter
public class SqlAbfrage {
	private String username = "mark";
	private String password = "mark";
	private String url = "jdbc:mariadb://217.160.50.160:3306/vokabeltrainer";
	private String abfrage;
	private ResultSet resultSet = null;

	public SqlAbfrage(String abfrage) {
		this.abfrage = abfrage;

		try {

			Class.forName("org.mariadb.jdbc.Driver");

			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt = conn.createStatement();

			resultSet = stmt.executeQuery(abfrage);
			
			conn.close();
			System.out.println("Die SQL hat geklappt!");

		} catch (SQLException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

	}
}
