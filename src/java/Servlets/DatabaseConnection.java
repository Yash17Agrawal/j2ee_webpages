package Servlets;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DatabaseConnection {
    public Statement stmt;
    public ResultSet res;
    public Connection conn;
    
    public DatabaseConnection()
    {
        
    }
    
    
    public Connection setConnection()
    {
        try{
            Class.forName("com.mysql.jdbc.driver");
            conn=DriverManager.getConnection("jdbc:mysql://localhost/bank","root","");
//            DatabaseConnection db=new DatabaseConnection();
//            db.ta
        
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return conn;
    }
    
    public ResultSet getResult(String query,Connection conn)
    {
        this.conn=conn;
        try{
            stmt=conn.createStatement();
            res=stmt.executeQuery(query);
            
        }
        
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return res;
                
    }
    
}
