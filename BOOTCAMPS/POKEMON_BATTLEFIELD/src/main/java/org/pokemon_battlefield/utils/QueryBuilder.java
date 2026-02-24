package org.pokemon_battlefield.utils;

import java.awt.font.ShapeGraphicAttribute;
import java.util.List;

public final class QueryBuilder {

    private QueryBuilder (){}

    /***
     *
     *
     * @param columnName As colunas que a tabela no banco possui
     * @return Uma String com o comando de insert: INSERT INTO nomeTabela VALUES (?, ?, ?, ?);
     */
    public static String insert (String tableName, List<String> columnName){
        StringBuilder sb = new StringBuilder(String.format("INSERT INTO %s (", tableName));
        for (String s: columnName){
            sb.append(s).append(", ");
        }
        sb.deleteCharAt(sb.lastIndexOf(", "));
        sb.append(") VALUES (");
        for (String s : columnName){
            sb.append("?, ");
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(");");
        return sb.toString();
    }

    /***
     *
     * @return Retorna uma String com o comando de listagem: SELECT * FROM nomeTabela;
     */
    public static String listAll (String tableName){
        return String.format("SELECT * FROM %s;",tableName );
    }

    /***
     *
     * @return Retorna uma String com o comando de listagem por id: SELECT * FROM nomeTabela WHERE nome LIKE '?' COLLATE NOCASE;
     */
    public static String listByName (String tableName){
        return String.format("SELECT * FROM %s WHERE nome LIKE '?' COLLATE NOCASE;", tableName);
    }

    /***
     *
     * @param columnNames As colunas que a tabela no banco possui
     * @return Retorna uma String com o comando de update: UPDATE nomeTabela SET nomeColuna = ? WHERE id = ?;
     */
    public static String update (String tableName, List<String> columnNames){
        StringBuilder sb = new StringBuilder(String.format("UPDATE %s SET ", tableName));
        for (String s : columnNames){
            sb.append(String.format("%s = ?, ", s));
        }
        sb.deleteCharAt(sb.lastIndexOf(","));
        sb.append(" WHERE id = ?;");
        return sb.toString();
    }

    /***
     *
     * @return Retorna uma String com o comando para deletar: DELETE FROM nomeTabela WHERE id = ?;
     */
    public static String delete (String tableName){
        return String.format("DELETE FROM %s WHERE id = ?", tableName);
    }
}
