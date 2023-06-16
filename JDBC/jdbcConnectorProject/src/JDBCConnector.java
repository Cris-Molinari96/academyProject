import java.sql.*;
public class JDBCConnector {

    private static final String url = "jdbc:mysql://localhost:3306/sakila";
    private static final String user = "root";
    private static final String pass = "root";

    Connection connection = null;
    Statement statement = null;

    ResultSet resultSet = null;
    public void getConnectionGiuseppe(){
        try {

            // check Classe Driver vista nel prog.
            Class.forName("com.mysql.cj.jdbc.Driver"); // si può fare un check sulla cartella Driver per vedere se è implementata e vista
            System.out.println("Class founded");

            // Verifica connection
            try {
                connection = DriverManager.getConnection(url, user, pass); // --> restituisce un oggetto di tipo connection
                System.out.println("DriverManager riuscito");
            }catch (SQLException e) {
                System.out.println("Error connection");
                throw new RuntimeException(e);
            }

            // Statement check
            try {
                statement = connection.createStatement();
            } catch (SQLException s){
                System.out.println("Statement error");
            }

            // Result set check
            try{
                ResultSet resultSet = statement.executeQuery("select * from actor");
                while (resultSet.next()) { // questo resultSet ha un metodo il quale se trova un record da true andando avanti, mentre se false s'interrompe
                    String name = resultSet.getString("first_name");
                    String surname = resultSet.getString("last_name");
                    System.out.println(name + " " + surname);
                }
            }catch (SQLException e) {
                System.out.println("Errore di stampa");
                throw new RuntimeException(e);
            }

        }catch(ClassNotFoundException c){
            System.out.println("Class not found, error!!");
        }
    }

    public static Connection getConnection(){
        try {
            System.out.println("Connessione riuscita");
            return DriverManager.getConnection(url,user,pass);
        } catch (SQLException e) {
            System.out.println("Connessione non riuscita");
            throw new RuntimeException(e);
        }
    }


}
