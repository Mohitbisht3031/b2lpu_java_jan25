package Day39;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbc {
    public static void main(String[] args) {
        // class.forName("name of the driver") -> this we can use to load a driver that is required for the app to make connection

        // trying to make a connection
        try{Connection con = DriverManager.getConnection("URL of DB", "Username", "Password");
        
        // Prepare statement
        PreparedStatement ps = con.prepareStatement("select * from DB");

        // Execute and store the answer
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            System.out.println(rs.getInt("id")+","+rs.getString("Name"));
        }
        }catch(SQLException ex){
            System.err.println(ex);
        }finally{
            rs.close();
            ps.close();
            con.close();
        }

        // variation of prepare statement 
        try{
            PreparedStatement ps = con.prepareStatement("select * from DB where the id = ?");
            ps.setInt(1, 3);

        }

        // another variation where we can execute batch queries
        try{
            PreparedStatement ps = con.prepareStatement("select * from DB where id = ?");
            ps.setInt(1, 3);
            ps.addBatch();

            ps.setInt(1, 4);
            ps.addBatch();
            ps.executeBatch();
        }

    }
}
