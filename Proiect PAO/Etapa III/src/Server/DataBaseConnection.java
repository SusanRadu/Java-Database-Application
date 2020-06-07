package Server;

import java.sql.*;

public class DataBaseConnection {//conectiunea catre baza de date mysql

    private static final String DB_URL = "jdbc:mysql://localhost:3306/mybd";//ma conectez local
    private static final String USERNAME = "Radu";
    private static final String PASSWORD = "root";
    private static volatile DataBaseConnection instance;
    private Connection connection;

    public static Connection getDataBaseConnection () {
        if (instance == null) {
            synchronized (DataBaseConnection .class) {
                if (instance == null) {
                    instance = new DataBaseConnection ();
                }
            }
        }
        return instance.connection;
    }

    private DataBaseConnection () {

        try {
            connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
        }
        catch (SQLException e) {
            System.err.println("Could not connect to database: " + e.getMessage());
        }
        System.out.println("MySql connection available");
    }

    public static ResultSet getData(String tabela) {//interogare generala care primeste numele unei tabele si intoarce toate randurile ei
        try {
            Statement statement = getDataBaseConnection().createStatement();//initializam interogarea
            String sql = "select * from " + tabela;
            return statement.executeQuery(sql);//returnam rezultatul interogarii
        } catch (SQLException e) {
            System.out.println("Failed to get data from " + tabela);
            return null;
        } catch (NullPointerException e) {
            System.out.println("No database connetion");
            return null;
        }
    }

    public static void insereazaData(String tabela, String[] numeColoane, String[] valori){
//interogare generala care primeste numele unei tabele, numele coloanei ei si un set de valori si insereaza un rand in tabela
        try {
            Statement statement = getDataBaseConnection().createStatement();
            String comanda = "insert into " + tabela;

            comanda += "(" + String.join(", ", numeColoane) + ")";

            comanda += " values (" + String.join(", ", valori) + ")";

            statement.executeUpdate(comanda);

        } catch (SQLException e) {
            System.out.println("Nu s-a putut insera randul in tabela " + tabela);
            e.printStackTrace();
        }

    }

    public static void stergeData(String tabela, String unde) {
//interogare generala care primeste numele unei tabele si o conditie care spune ce valoare sa stearga
        try {
            Statement statement = getDataBaseConnection().createStatement();
            String comanda = "delete from ";
            comanda += tabela;
            comanda += " where ";
            comanda += unde;

            statement.executeUpdate(comanda);
        } catch (SQLException e) {
            System.out.println("Nu s-a putut sterge randul din tabela " + tabela);
            e.printStackTrace();
        }
    }


        public static void modificaData(String tabela, String coloana, String valoare, String coloanaConditie, String conditie)  {
//interogare generica care modifica datele unui rand in tabela in functie de parametri dati
            try {
                Statement statement = getDataBaseConnection().createStatement();
                String comanda = "update ";
                comanda += tabela;
                comanda += " set " + coloana + "=" + valoare;
                comanda += " where " + coloanaConditie + '=' + conditie;

                statement.executeUpdate(comanda);

            } catch (SQLException e) {
                System.out.println("Nu s-a putut modifica randul in tabela " + tabela);
                e.printStackTrace();
            }



        }




}





