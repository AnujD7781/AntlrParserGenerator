/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.io.IOException;
import java.sql.SQLException;
import my.FrameTrials.FrameTrial;
/**
 *
 * @author anujdeshmukh
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, IOException {
        // TODO code application logic here
        FrameTrial tt = new FrameTrial();
        tt.setVisible(true);
        DBManager dbManager = new DBManager();
       // dbManager.dbConn();
        
    }
    
}
