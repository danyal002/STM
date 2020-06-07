
package Main;

import java.sql.*;


public class DatabaseConnection {
    
    
    static private Connection c;
  public static Connection getCon() throws SQLException {
        
        if (c == null){
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/std_registry", "root", "i4xJNmuaQYCEvPD8");
        }
    return c;
    }

   public static int setData(String s) throws Exception{
       int r = DatabaseConnection.getCon().createStatement().executeUpdate(s);
         return r;
       
   }

   public static ResultSet getData(String sq) throws Exception{
        return DatabaseConnection.getCon().createStatement().executeQuery(sq);

    
    }
    public static void main(String args[]) {
        try {
            ResultSet rs = DatabaseConnection.getData("SELECT * FROM reg");
            while (rs.next()) 
                
                System.out.println(rs.getInt("id")+" "+rs.getString("name")+" "+rs.getString("education")+" "+rs.getInt("age"));
        } catch (Exception ex) {
            DialogBox db = new DialogBox();
            db.jTextField1.setText("Cannot connect to local server!");
            db.setVisible(true);
            db.setAlwaysOnTop(true);
        }
    }
    
}

      

    

