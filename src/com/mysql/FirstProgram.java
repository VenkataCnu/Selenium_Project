package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstProgram {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketers", "root", "Srinivas");
		Statement st = con.createStatement();
		System.out.println(st.execute("insert into male values (8, 'J.Srinath', 'Bowler');"));

		st.close();
		con.close();

	}

}
