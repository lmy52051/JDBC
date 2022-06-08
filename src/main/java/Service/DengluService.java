package Service;

import Model.Shuiku;
import Model.User;
import Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DengluService {
    public User denglu(String name, String password){
        String id = "1";
        User user = new User(id,name,password);
//        user.setName(name);
//        user.setId("-1");
//        user.setPassword(password);
        DBUtil dbUtil = new DBUtil();
        Connection con = null;
        try{
            con = dbUtil.getConnection();
            PreparedStatement statement = con.prepareStatement("select * from user where name=? and password=?");
            statement.setString(1,name);
            statement.setString(2,password);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet !=null) {
                while (resultSet.next()) {
                    id = resultSet.getString(1);
                }
                if (id != "1")
                    user.setId(id);
            }

        }catch (SQLException throwables){
            throwables.printStackTrace();
        }finally {
            dbUtil.closeConnection(con);
        }
        return user;
    }
}
