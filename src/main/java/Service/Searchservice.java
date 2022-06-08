package Service;

import Model.Shuiku;
import Utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Searchservice {
    public ArrayList<Shuiku> searchService(String uname) {
        ArrayList<Shuiku> list = new ArrayList<>();
        Connection con = null;
        try {
            DBUtil dbUtil = new DBUtil();
            con = dbUtil.getConnection();
            System.out.println(con);
            PreparedStatement stat = con.prepareStatement("select * from sk where name=?");
            stat.setString(1,uname);
            ResultSet resultSet = stat.executeQuery();
            System.out.println(resultSet);
            while (resultSet.next()) {
                String name = resultSet.getString(1);
                float x = resultSet.getFloat(2);
                float y = resultSet.getFloat(3);
                String bz = resultSet.getString(4);
                Shuiku shuiku = new Shuiku(name, x, y, bz);
                list.add(shuiku);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.closeConnection(con);
            System.out.println(list);
        }
        return list;
    }
}
