/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import winecatalog.frames.HomeFrame;
import winecatalog.object.FilterItemObject;
import winecatalog.object.FilterObject;
import winecatalog.object.WineObject;

/**
 *
 * @author wans8
 */
public class DatabaseConnect {
    public Connection c = null;
    public List<WineObject> wineList = new ArrayList<>();
    
    public boolean dbConnect() {
        try {
         Class.forName("org.postgresql.Driver");
         c = DriverManager
            .getConnection("jdbc:postgresql://localhost:5432/postgres",
            "postgres", "admin");
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e.getClass().getName()+": "+e.getMessage());
         System.exit(0);
      }
      System.out.println("Opened database successfully");
      return true;
    }
    
    public List<WineObject> dbSelect(String pole) throws SQLException {
        List<WineObject> resultList = new ArrayList<>();
        Statement stmt = null;
        stmt = c.createStatement();
        ResultSet rs;
        try {
            if (!pole.equals("Все")) {
                rs = stmt.executeQuery( "SELECT * FROM basic " + "WHERE color = " + "'" + pole + "'" + ";" );
            } else {
                rs = stmt.executeQuery( "SELECT * FROM basic;");
            }
         while (rs.next()) {
            WineObject obj = new WineObject(); 
            obj.setId(rs.getInt("id"));
            obj.setName(rs.getString("name"));
            obj.setCompany(rs.getString("company"));
            obj.setCountry(rs.getString("country"));
            obj.setColor(rs.getString("color"));
            obj.setGrape(rs.getString("grape"));
            obj.setSugar(rs.getString("sugar"));
            obj.setDescription(rs.getString("description"));
            obj.setPic(rs.getString("picture"));
            obj.setYear(rs.getInt("year"));
            obj.setAlcohol(rs.getDouble("alcohol"));
            obj.setPrice(rs.getDouble("price"));
            resultList.add(obj);
          }
         rs.close();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
        return resultList;
    }
    
    public List<String> getFilterItem(String pole) throws SQLException {
        List<String> resultList = new ArrayList<>();
        resultList.add("Все");
        if (dbConnect()) {
            Statement stmt = null;
            stmt = c.createStatement();
            ResultSet rs;
            try {
                rs = stmt.executeQuery( "SELECT * FROM " + pole + ";" );
             while (rs.next()) {
                resultList.add(rs.getString(pole));
              }
             rs.close();
             stmt.close();
             c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
            }
        }
        return resultList;
    }
    
    
    public FilterObject getFilter() throws SQLException {
        FilterObject object = new FilterObject();
        List<String> sugarFilter = getFilterItem("sugar");
        List<String> typeList = getFilterItem("color");
        List<String> grapeList = getFilterItem("grape");
        List<String> countryList = getFilterItem("country");
        
        object.setCountryList(countryList);
        object.setTypeList(typeList);
        object.setSugarFilter(sugarFilter);
        object.setGrapeList(grapeList);
        return object;
    }
    

    public List<WineObject> getFilterResult(String color, String sugar, String grape, String country) throws SQLException {
        List<WineObject> res = new ArrayList<>();
        
        boolean flagHave = false;
  
        String requestString = "";
        
        if (!color.isEmpty() && !color.equals("Все")) {
           flagHave = true;
           requestString = requestString + "color = '" + color + "'"; 
        }
        
        if (!sugar.isEmpty() && !sugar.equals("Все")) {
            if (flagHave) {
                requestString = requestString + " AND ";
            }
           requestString = requestString + "sugar = '" + sugar + "'"; 
           flagHave = true;
        }
        
        if (!grape.isEmpty() && !grape.equals("Все")) {
            if (flagHave) {
                requestString = requestString + " AND ";
            }
            requestString = requestString + "grape = '" + grape + "'"; 
            flagHave = true;
        }
        
        if (!country.isEmpty() && !country.equals("Все")) {
            if (flagHave) {
                requestString = requestString + " AND ";
            }
            requestString = requestString + "country = '" + country + "'";
            flagHave = true;
        }
        
        
        Statement stmt = null;
        stmt = c.createStatement();
        ResultSet rs;
        try {
            if (flagHave) {
                rs = stmt.executeQuery( "SELECT * FROM basic " + "WHERE " + requestString + ";" );
            } else {
                rs = stmt.executeQuery( "SELECT * FROM basic;");
            }
         while (rs.next()) {
            WineObject obj = new WineObject(); 
            obj.setId(rs.getInt("id"));
            obj.setName(rs.getString("name"));
            obj.setCompany(rs.getString("company"));
            obj.setCountry(rs.getString("country"));
            obj.setColor(rs.getString("color"));
            obj.setGrape(rs.getString("grape"));
            obj.setSugar(rs.getString("sugar"));
            obj.setDescription(rs.getString("description"));
            obj.setPic(rs.getString("picture"));
            obj.setYear(rs.getInt("year"));
            obj.setAlcohol(rs.getDouble("alcohol"));
            obj.setPrice(rs.getDouble("price"));
            res.add(obj);
          }
         rs.close();
         stmt.close();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
         System.exit(0);
      }
        
        return res;
    } 
    
    public void insertElem(double alco, String color, String company, String country, String desc, 
            int id, String name, String pic, String grape, double count, String sugar, double year, double price) throws SQLException{
        
        Statement stmt = null;
        stmt = c.createStatement();
        stmt.executeUpdate("INSERT INTO basic VALUES " + "(" + alco + ", " + color + ", " + company + ", " + country + ", " + desc + ", " + id + ", " +
                name + ", " + pic  + ", " + grape + ", " + count + ", " + price + ", " + sugar + ", " + year + ");");
      
        
        
        
    }
}
