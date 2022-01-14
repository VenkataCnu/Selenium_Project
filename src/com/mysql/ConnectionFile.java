package com.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFile {

	public static void main(String[] args) throws SQLException {

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cricketers", "root", "Srinivas");
		Statement st = con.createStatement();

		ResultSet rs = st.executeQuery("select * from male;");
		ResultSetMetaData rsm = rs.getMetaData();

		int cc = rsm.getColumnCount();
		for (int col=1; col<=cc;col++)
		{
		 System.out.println(rsm.getColumnLabel(col));
		 while(rs.next()) 
		 {
			 System.out.println(rs.getString(col));
		 }
			rs.beforeFirst();
		}
	}

}
