import java.sql.*;
public class JDBCConnector {

    private static final String url = "jdbc:mysql://localhost:3306/sakila";
    private static final String user = "root";
    private static final String pass = "root";

// 1) quindi possiamo verificare se la classe driver è nota al progetto
    Connection connection = null;
    Statement statement = null;
    public void getConnectionGiuseppe(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Class founded");

            connection = DriverManager.getConnection(url,user,pass); // --> restituisce un oggetto di tipo connection
            System.out.println("DriverManager riuscito");

            statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from actor");
            try {
                while (resultSet.next()) { // questo resultSet ha un metodo il quale se trova un record da true andando avanti, mentre se false s'interrompe
                    String name = resultSet.getString("first_name");
                    String surname = resultSet.getString("last_name");
                    System.out.println(name + " " + surname);
                }
                connection.close();
            }catch(SQLException s){
                System.out.println("Errore di stampa");
            }

        }catch(ClassNotFoundException c){
            System.out.println("Class not found, error!!");
        } catch (SQLException e) {
            System.out.println("Error connection");
            throw new RuntimeException(e);

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
