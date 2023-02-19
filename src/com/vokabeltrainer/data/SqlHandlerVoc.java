package com.vokabeltrainer.data;

import java.sql.SQLException;

public class SqlHandlerVoc {

	public SqlHandlerVoc() {
		super();
	}

	public void createNewTable(String statement){
		new SqlAbfrage("CREATE TABLE "+statement+" (firstVoc varchar(255) NOT NULL, secondVoc varchar(255) NOT NULL, VocID int NOT NULL AUTO_INCREMENT, PRIMARY KEY (VocID))");
	}
}
