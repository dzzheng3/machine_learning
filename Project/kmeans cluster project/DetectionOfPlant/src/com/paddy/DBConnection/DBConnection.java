/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.paddy.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con=null;
	static{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
		} catch (Exception e) {
			
			
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
	
	public static Connection getConnention(){
		
		try {
		//con=DriverManager.getConnection("jdbc:mysql://localhost/TaxiDispatcher","root","");Disease_name
			con=DriverManager.getConnection("jdbc:mysql://localhost/plantDiseasedetection","root","");
		} catch (Exception e) {
			e.printStackTrace();;
			// TODO: handle exception
		}
	return con;	
	}


}