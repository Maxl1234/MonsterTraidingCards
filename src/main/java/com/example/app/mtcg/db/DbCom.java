package com.example.app.mtcg.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbCom {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/mtcgdb";
        String user = "postgres";
        String password = "postgres";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Verbindung zur PostgreSQL-Datenbank hergestellt.");
        } catch (SQLException e) {
            System.err.println("Fehler beim Verbinden zur Datenbank: " + e.getMessage());
        }
    }
}
