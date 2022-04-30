package karium.dbtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Karium
 */
public class DBTest {

    static Statement st;
    
    public static void main(String[] args) throws SQLException{
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String dbURL = "jdbc:ucanaccess://C:\\Program_Files\\TestDB\\Paradox.accdb";
            String user = "";
            String pass = "";
            
            Connection con = DriverManager.getConnection(dbURL, user, pass);
            String query = "select * from Playlist";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = null;
            
            try{
                rs = pst.executeQuery();
                while(rs.next()){
                    System.out.println("\n" + rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
                }
            }catch(SQLException sql){}
            pst.close();
            con.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
       
    }
}
