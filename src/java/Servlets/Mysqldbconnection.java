/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author code_eagle
 */
public class Mysqldbconnection {
    static String dbname,tablename;
    public static Connection  con;
    public static void initialize() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");  
       
        String url="jdbc:mysql://localhost:3306/"+dbname;
        
        con=DriverManager.getConnection(url,"root","bmw"); 
        
    }
    public static void setdbname(String n)
    {
        dbname=n;
    }
    public static void settablename(String a)
    {
        tablename=a;
    }
    public static void showdata()
    {
        try{  
        //here sonoo is database name, root is username and password  
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from "+tablename);  
        while(rs.next())  
        System.out.println(rs.getString(1));//+"  "+rs.getString(2)+"  "+rs.getString(3));  
        con.close();  
        }catch(Exception e){ System.out.println(e);}  
    }
    
    public static void showdbdata() throws SQLException, ClassNotFoundException
    {
        initialize();
        DatabaseMetaData md = con.getMetaData();
        ResultSet rs = md.getTables(null, null, "%", null);
        while (rs.next()) {
        System.out.println(rs.getString(3));
                            }
    }

    public int insertdata(String username,String password)
    {
        try {
            
            setdbname("complete");
            settablename("userdata");
            try {
                initialize();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Mysqldbconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
            Statement stmt=con.createStatement();
            String query="insert into "+tablename+" values(\""+username+"\",\""+password+"\");";
            System.out.println(query);
            stmt.executeUpdate(query);
                 
            con.close();
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(Mysqldbconnection.class.getName()).log(Level.SEVERE, null, ex);
            
        }
        return 0;
    }
    public int checkdata(String username,String password)
    {
        try {
            setdbname("complete");
            settablename("userdata");
            try {
                initialize();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Mysqldbconnection.class.getName()).log(Level.SEVERE, null, ex);
            } 
            Statement stmt=con.createStatement();
            String query="Select * from "+tablename+" where(name=\""+username+"\" AND password=\""+password+"\");";
            System.out.println(query);
            ResultSet rs=stmt.executeQuery(query);
            rs.setFetchSize(1);
            if(rs.next())
            return 1;
            else
                return 0;
        } catch (SQLException ex) {
                Logger.getLogger(Mysqldbconnection.class.getName()).log(Level.SEVERE, null, ex);
            }
    return 0;
    }
    
}
