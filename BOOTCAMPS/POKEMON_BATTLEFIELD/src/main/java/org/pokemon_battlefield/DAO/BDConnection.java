package org.pokemon_battlefield.DAO;
import java.io.Closeable;
import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDConnection implements Closeable {
    private final URL dbResource = BDConnection.class.getClassLoader().getResource("bd/BancoDeDados.db");
    private File dbFile;
    private Connection connection;

    public Connection getConnection() {
        try {
            if (dbResource != null){
                dbFile = new File(dbResource.toURI());
            } else {
                throw new RuntimeException("BD not found");
            }
        } catch (URISyntaxException | RuntimeException e) {
            throw new RuntimeException("Error in BD");
        }
        String url = "jdbc:sqlite:"+dbFile.getAbsolutePath();
        try{
            return connection = DriverManager.getConnection(url);
        } catch (SQLException e) {
            throw new RuntimeException("Error in BD");
        }
    }

    @Override
    public void close() {
        if (connection != null){
            try{
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
