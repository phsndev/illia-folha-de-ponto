package br.com.ilia.digital.folhadeponto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DatabaseConnection {

	private static final String URL = "jdbc:mysql://localhost:3306/folha-de-ponto?useTimezone=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "root";
    
    public static Connection getConnection() throws ClassNotFoundException {
        try {
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    } 

    public static void closeConnection(Connection con) {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {

        closeConnection(con);

        try {

            if (stmt != null) {
                stmt.close();
            }

        } catch (SQLException DatabaseConnection) {
			Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, DatabaseConnection);
        }
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {

        closeConnection(con, stmt);

        try {

            if (rs != null) {
                rs.close();
            }

        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static PreparedStatement prepareStatement(String cadastro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}
