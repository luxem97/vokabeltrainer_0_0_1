package com.vokabeltrainer.main;

import java.sql.SQLException;

import com.vokabeltrainer.data.SqlAbfrage;

import lombok.Getter;

@Getter
public class Vokabel {
	String first;
	String second;
	String table;
	public Vokabel(String first, String second, String table) {
		super();
		this.first = first;
		this.second = second;
		this.table = table;
		

		persistVoc("englischlernen");
	}

	private void persistVoc(String table){
		// abfrage fertig stellen first u second language id primary key
		SqlAbfrage abfrage1 = new SqlAbfrage("INSERT INTO "+table+" (firstVoc, secondVoc) VALUES('"+this.first+"', '"+this.second+"' )");
	}

}
