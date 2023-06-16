import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        JDBCConnector jdbcConnector = new JDBCConnector();

        jdbcConnector.getConnectionGiuseppe();

//        Connection connection;
//        try {
//            connection = JDBCConnector.getConnection();
//            System.out.println("Connessione riuscita");
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        Statement statement;
//        try {
//            statement = connection.createStatement();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            statement.executeQuery("select * from actor");
//            System.out.println("Istruzione riuscita con successo!!");
//        } catch (SQLException e) {
//            System.out.println("C'è qualche errore");
//            throw new RuntimeException(e);
//        }
    }
}