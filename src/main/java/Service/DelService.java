package Service;

import Model.Shuiku;
import Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DelService {
    public boolean delService(Shuiku shuiku){
        boolean flag = false;
        //注册驱动，连接数据库
        Connection connection = DBUtil.getConnection();
        //执行sql语句，处理结果集
        try {
            PreparedStatement pstmt = connection.prepareStatement("DELETE FROM sk WHERE name = ?;");
            String name = shuiku.getName();
            pstmt.setString(1,name);
            pstmt.execute();
            flag = true;
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.getConnection();
        }
        return flag;
    }
}
