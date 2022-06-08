package Service;

import Model.Shuiku;
import Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateService {
    public boolean updateService(Shuiku shuiku){
        boolean flag = false;
        //注册驱动，连接数据库
        Connection connection = DBUtil.getConnection();
        //执行sql语句
        try {
            PreparedStatement pstmt = connection.prepareStatement("update sk set name = ? where X = ? and Y = ?;");
            String name = shuiku.getName();
            float X = shuiku.getX();
            float Y = shuiku.getY();
            pstmt.setString(1,name);
            pstmt.setFloat(2,X);
            pstmt.setFloat(3,Y);
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
