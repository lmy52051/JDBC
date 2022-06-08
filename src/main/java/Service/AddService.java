package Service;

import Model.Shuiku;
import Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddService {
    public Boolean addService(Shuiku shuiku){
        boolean flag = false;
        //注册驱动，连接数据库
        Connection connection = DBUtil.getConnection();
        try {
            //执行sql语句
            PreparedStatement pstmt = connection.prepareStatement("INSERT INTO `sk` (`name`, `X`, `Y`, `bz`) VALUES (?, ?, ?, ?) ;");
            String name = shuiku.getName();
            float X = shuiku.getX();
            float Y = shuiku.getY();
            String bz = shuiku.getBz();
            pstmt.setString(1,name);
            pstmt.setFloat(2,X);
            pstmt.setFloat(3,Y);
            pstmt.setString(4,bz);
            pstmt.execute();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.closeConnection(connection);
        }
        return flag;
    }
}
