package br.com.profdinho.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    /*
    Nas variáveis abaixo, coloque suas informações para acessar
    o Banco de Dados que você configurou
    */
    private static String USERNAME = "avnadmin";
    private static String PASSWORD = "xxxxxx";
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://"
            + "mysql-profdinho-profdinho.b.aivencloud.com:27300/"
            + "defaultdb?ssl-mode=REQUIRED";
    
    public Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager
                    .getConnection(URL,USERNAME,PASSWORD);
        }
        catch(SQLException e){
            throw new RuntimeException(e);
        }
        catch(ClassNotFoundException ex) {
            throw new RuntimeException(ex);
        }
    }
}
