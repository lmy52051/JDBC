package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBUtil {
    public static Connection getConnection(){
        ResourceBundle resourceBundle = ResourceBundle.getBundle("jdbc");
        String driver = resourceBundle.getString("driver");
        String url = resourceBundle.getString("url");
        String uname = resourceBundle.getString("username");

        String password = resourceBundle.getString("password");
        Connection connection = null;
        try{
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        try{
            connection = DriverManager.getConnection(url,uname,password);
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection conn){
        if(conn != null){
            try{
                conn.close();
            }catch (SQLException throwables){
                throwables.printStackTrace();
            }
        }
    }
}
