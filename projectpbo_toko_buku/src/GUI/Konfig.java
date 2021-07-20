/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author W I N 10
 */
public class Konfig {
    private static Connection MySQLConfig;
    public static Connection getKonfig() {
        if (MySQLConfig == null) {
        try{
            String url = "jdbc:mysql://localhost:3306/projectpbo";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal" + e.getMessage());
        }
        }
        return MySQLConfig;
    }
}