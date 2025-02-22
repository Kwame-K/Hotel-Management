/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion_hoteldb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

/**
 *
 * @author Kristian Laban
 */
public class Gestion_hoteldb
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         try
    {
//création d’une instance de l’objet driver
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("DRIVER OK ! ");
        String url ="jdbc:mysql://localhost:3306/gestion_hoteldb";
        String user = "Kristian";
        String passwd = "";
			
        Connection conn = DriverManager.getConnection(url, user, passwd);
        System.out.println("Connection effective !");	
        
        
          Statement state = conn.createStatement();
          ResultSet result = state.executeQuery("SELECT NomCli FROM Client");
          ResultSetMetaData resultMeta = result.getMetaData();
          System.out.println("\n***************************************");
          for(int i = 1; i <= resultMeta.getColumnCount(); i++)
              System.out.print("\t" + resultMeta.getColumnName(i).toUpperCase() + "\t *");
              System.out.println("\n***************************************");
           while(result.next())
           {
             for(int i = 1; i <= resultMeta.getColumnCount(); i++)
             System.out.print("\t" + result.getObject(i).toString() + "\t |");
             System.out.println("\n----------------------------------------");
          }
             result.close();
             state.close();
          
			
    } 
    catch (Exception e)
    {
        e.printStackTrace();
    }
        // TODO code application logic here
    }
    
}
