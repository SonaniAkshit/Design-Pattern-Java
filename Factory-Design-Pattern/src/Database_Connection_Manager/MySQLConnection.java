package Database_Connection_Manager;

public class MySQLConnection implements DatabaseConnection {

    String DBconnection;
    String DBdisconnection;
    String DBquery;
    MySQLConnection() {
        DBconnection = "Connected to MySQL Database.";
        DBdisconnection = "Disconnected from MySQL Database.";
        DBquery = "Executing query: SELECT * FROM users;";
    }
    public String connect() {
        return DBconnection;
    }
    public String disconnect() {
        return DBdisconnection;
    }
    public String query() {
        return DBquery;
    }

}
