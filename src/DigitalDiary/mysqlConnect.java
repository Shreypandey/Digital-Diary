/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DigitalDiary;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author shrey
 */
public class mysqlConnect {
    
public static Connection connection(String username, String password){
Connection con=null;
    try{
     Class.forName("com.mysql.jdbc.Driver");
     con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Digital_Diary", username, password);
     System.out.println("Connected to database");
     return con;
}
catch(Exception e){
    System.out.println("Connection to database failed");
}
return con;
}
}
