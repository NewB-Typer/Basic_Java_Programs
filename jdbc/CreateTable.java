package com.jdbc;
import java.sql.*;

public class CreateTable {
public static void main(String[] args) {
try {
	Class.forName("com.mariadb.Jdbc.Driver");
	String url = ("Jdbc:mariadb://localhost:3306/mydb");
	String username = "user";
	String password = "pass";

	Connection con = DriverManager.getConnection(url,username,password);

	String st = ("create table lol(lId int(8) primary key,lName varchar(30), lAge int(3))");


Statement stmt = con.createStatement();
stmt.executeUpdate(st);

System.out.println("Succesfully done");

con.close();

}
	catch(Exception e) {
		e.printStackTrace();
	}
	
	
}
}
