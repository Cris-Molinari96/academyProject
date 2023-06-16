import javax.xml.transform.Result;
import java.sql.*;

public class Main {
    public static void main(String[] args) {

        JDBCConnector jdbcConnector = new JDBCConnector();

        // a differenza del secondo approccio qui richiamiamo il metodo ed è tutto scritto li
        // jdbcConnector.getConnectionGiuseppe();


        // Secondo modo per approcciare alla connessione di un db
        Connection connection;

        connection = JDBCConnector.getConnection();
        Statement statement = null;

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            System.out.println("Error statement");
            throw new RuntimeException(e);
        }

        try {
            ResultSet resultSet = statement.executeQuery("select * from actor");
            System.out.println("Istruzione riuscita con successo!!");
            while(resultSet.next()){
                String firstName = resultSet.getString("first_name");
                String last_name = resultSet.getString("last_name");
                System.out.println(firstName + " " + last_name);
            }
        } catch (SQLException e) {
            System.out.println("C'è qualche errore");
            throw new RuntimeException(e);
        }
    }
}