package com.example.app.mtcg.db;

import com.example.app.mtcg.entity.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCom {

    private final String url = "jdbc:postgresql://localhost:5432/mtcgdb";
    private final String user = "postgres";
    private final String password = "postgres";
    private final String FIND_ALL_SQL = "SELECT * FROM task";
    private Connection connection = null;

    public void connectdb(){
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Verbindung zur DB hergestellt.");
        } catch (SQLException e) {
            System.err.println("Fehler beim Verbinden zur Datenbank: " + e.getMessage());
        }
    };
    public void disconectdb(){
        try {
            connection.close();
            System.out.println("Verbindung zu DB geschlossen ");
        }
        catch (SQLException e){
            System.err.println("Problem beim DB schließen");
        }
    }
}
