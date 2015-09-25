/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.sql.*;
import com.parser.java.ParserHelper;
import com.parser.java.ParserModel;
import java.io.IOException;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.util.ArrayList;
/**
 *
 * @author anujdeshmukh
 */
public class DBManager {

    /**
     * Connection for DB
     */
    Connection c = null;
        Statement stmt = null;
        Statement selectStmt = null;
    public void dbConn() throws SQLException {
        //javaClassCount = count;
        //Connection c = null;
        
    try {
      Class.forName("org.sqlite.JDBC");
      c = DriverManager.getConnection("jdbc:sqlite:javaParser.sqlite");
    } catch ( ClassNotFoundException | SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
    }
            System.out.println("Opened database successfully");
    
    } 
    public ArrayList<ParserHelper> getPackageData (String str) throws IOException  {
        
    Statement stmt1 = null;
    ArrayList<ParserHelper> arrParser= new ArrayList(); 
    try {
       stmt1 = c.createStatement();
String sql1 = "Select * from package where PackageName = '"+str+"'";
System.out.println(sql1);
      
       
        try (ResultSet rs = stmt1.executeQuery( sql1 )) {
            while ( rs.next() ) {
                String  filePath = rs.getString("FilePath");
                ParserHelper helper = new ParserHelper();
                helper.initWithFileName(filePath);
                arrParser.add(helper);
                System.out.println("working well -------------------");
                
            } }
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + "what the fuck: " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("Operation done successfully");
       ////////////////// 
        
    return arrParser;
        
        
    }
    public ArrayList<String> getAllPackages () throws IOException  {
        
    Statement stmt1 = null;
    ArrayList<String> arrParser= new ArrayList(); 
    try {
       stmt1 = c.createStatement();
//String sql1 = "Select * from package where PackageName = '"+str+"'";
      
       
        try (ResultSet rs = stmt1.executeQuery( "Select * from package;" )) {
            while ( rs.next() ) {
                String  packagenmae = rs.getString("PackageName");
                ParserHelper helper = new ParserHelper();
                //helper.initWithFileName(file);
                arrParser.add(packagenmae);
                System.out.println("working well -------------------");
                
            } }
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + "what the fuck: " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("Operation done successfully");
       ////////////////// 
        
    return arrParser;
        
        
    }
    public ArrayList<String> getAllClassInfo (String strPackageName) throws IOException  {
        
    Statement stmt1 = null;
    ArrayList<String> arrParser= new ArrayList(); 
    
        try {
       stmt1 = c.createStatement();
String sql1 = "Select * from classInfo where PackageName = '"+strPackageName+"'";

System.out.println(sql1);
      
       
        try (ResultSet rs = stmt1.executeQuery( sql1 )) {
            
            while ( rs.next() ) {
                
                String  filePath = rs.getString("FilePath");
                
                ParserHelper helper = new ParserHelper();
                helper.initWithFileName(filePath);
                arrParser.add(helper.getClassName());
                
                
            } }
      stmt.close();
      c.close();
      return arrParser;
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + "what the fuck: " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("Operation done successfully");
       ////////////////// 
        
    return arrParser;
        
        
    }
    
     public ArrayList<ParserModel> getAllClassData (String strPackageName, String strClassName) throws IOException  {
        
    Statement stmt1 = null;
    ArrayList<ParserModel> arrParser= new ArrayList(); 
    
        try {
       stmt1 = c.createStatement();
String sql1 = "Select * from classInfo where PackageName = '"+strPackageName+"' and className = '"+strClassName+"'";
System.out.println(sql1);
      
       
        try (ResultSet rs = stmt1.executeQuery( sql1 )) {
            while ( rs.next() ) {
                String  filePath = rs.getString("FilePath");
                ParserHelper helper = new ParserHelper();
                helper.initWithFileName(filePath);
                //arrParser.add(helper.getClassName());
                return helper.getDataForPackage();
                //System.out.println("working well -------------------");
                
            } }
      stmt.close();
      c.close();
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + "what the fuck: " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("Operation done successfully");
       ////////////////// 
        
    return arrParser;
        
        
    }
    public boolean insertPackageName (ParserHelper helper) throws IOException  {
        if (this.getAllClassInfo(helper.getPackageName()).size() <= 0) {
            try {
      stmt = c.createStatement();
      //String sql = "INSERT INTO Package (Package,FilePath) VALUE ('"+helper.getPackageName()+"','"+helper.getFilePath()+"'")");"; 
      
      String sql1 = "INSERT INTO `Package`(PackageName) VALUES ('"+helper.getPackageName()+"')";
          System.out.println(sql1);
      stmt.executeUpdate(sql1);
      stmt.close();
    } 
    catch ( SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
      return true;
    }
    System.out.println("Inserted package properly");
    return true;
        }
        return true;
    }
     public boolean insertClassValues (ParserHelper helper)  {
        try {
        stmt = c.createStatement();
        String sql1 = "INSERT INTO `ClassInfo`(PackageName, ClassName ,FilePath) VALUES ('"+helper.getPackageName()+"','"+helper.getClassName()+"','"+helper.getFilePath()+"')";
        System.out.println(sql1);
        stmt.executeUpdate(sql1);
        stmt.close();
    } 
    catch ( SQLException e ) {
      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
      System.exit(0);
      return true;
    }
    System.out.println("Inserted class properly");
    return true;
    }
    //////////////////////////////////////////////////////////////
public ArrayList<String> getAllClassData (String strPackageName) throws IOException  {
        
    Statement stmt1 = null;
    ArrayList<String> arrParser= new ArrayList(); 
    
        try {
       stmt1 = c.createStatement();
String sql1 = "Select * from classInfo where PackageName = '"+strPackageName+"'";

System.out.println(sql1);
      
       
        try (ResultSet rs = stmt1.executeQuery( sql1 )) {
            
            while ( rs.next() ) {
                
                String  filePath = rs.getString("FilePath");
                String  classNamem = rs.getString("FilePath");
                String  packageName = rs.getString("FilePath");
                String  totalChar = rs.getString("FilePath");
                String  whiteSpace = rs.getString("FilePath");
                String  UIDCount = rs.getString("FilePath");
                String  KeywordCount = rs.getString("FilePath");
                String  ConstCount = rs.getString("FilePath");
                String  commentCount = rs.getString("FilePath");
                
                ParserHelper helper = new ParserHelper();
                helper.initWithFileName(filePath);
                arrParser.add(helper.getClassName());
                
                
            } }
      stmt.close();
      c.close();
      return arrParser;
    } catch ( Exception e ) {
      System.err.println( e.getClass().getName() + "what the fuck: " + e.getMessage() );
      //System.exit(0);
    }
    System.out.println("Operation done successfully");
       ////////////////// 
        
    return arrParser;
        
        
    }
  }
