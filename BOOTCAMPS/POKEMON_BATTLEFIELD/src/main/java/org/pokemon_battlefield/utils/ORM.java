package org.pokemon_battlefield.utils;

import java.sql.SQLException;
import java.util.Map;

@FunctionalInterface
public interface ORM <T, R> {
    R traduce (T bdReponse) throws SQLException;
}
