package org.pokemon_battlefield.DAO;

import org.pokemon_battlefield.utils.ORM;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;


public interface OperationsDAO<T> {

    //O CREATE E O UPDATE SERÃO ESPEFICIADOS EM CADA CLASSE, POIS NÃO PODEM SER GENERICOS

    void delete (int id);

    Optional<List<T>> listAll ();

    Optional<T> searchByName (String name);

    Optional<T> searchById(int id);

    default PreparedStatement getPreparedStatement(String sql){
        try {
            BDConnection bdConnection = new BDConnection();
            Connection connection = bdConnection.getConnection();
            return connection.prepareStatement(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    default T createInstance (ResultSet response, ORM<ResultSet, T> orm) throws SQLException {
        return orm.traduce(response);
    }

}

