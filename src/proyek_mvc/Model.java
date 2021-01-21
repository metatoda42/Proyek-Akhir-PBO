package proyek_mvc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


/* 
 * 
 * 
 * */



public class Model {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";


    Connection koneksi;
    Statement statement;
    
    public Model(){
        try{
            Class.forName(JDBC_DRIVER);
            koneksi = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/pbo_uap?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "");
            System.out.println("Koneksi Berhasil");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            System.out.println(ex+"Koneksi Gagal");
        }
    }
    
    //CREATE CREATE CREATE CREATE CREATE CREATE CREATE CREATE
    public void signin(String username, String password, String name, String email){
    	int jmlData=0;
        try {
        	
           
           
           String query = "Select * from user WHERE username='" + username+"'"; 
           System.out.println(query);
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
           
            if (jmlData==0) {
                query = "INSERT INTO user(username, password, nama, email) VALUES ('"+username+"','"+password+"','"+name+"','"+email+"')";
           
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil ditambahkan");
                JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
                JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    	
    }
    
    public void addgame(String judul, int harga, String genre, String studio, String description){
    	int jmlData=0;
        try {
        	String query = "Select * from game WHERE judul='" + judul+"'"; 
            
            ResultSet resultSet = statement.executeQuery(query);
            
            while (resultSet.next()){ 
                 jmlData++;
             }
            if (jmlData==0) {
            query = "INSERT INTO game(judul, harga, genre, studio, description) VALUES ('"+judul+"',"+harga+",'"+genre+"','"+studio+"','"+description+"')";
            System.out.println(query);
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
            }
            else {
            	JOptionPane.showMessageDialog(null, "Data sudah ada");
            }
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    	
    }
    
    public void addwishlist(String user, String judul) {
    	try {
            String query = "INSERT INTO `wishlist` (`username`, `judul`) VALUES ('"+user+"','"+judul+"')";
       
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    	
    }
    
    public void addpayment(String user, String judul) {
    	try {
            String query = "INSERT INTO `payment` (`username`, `judul`) VALUES ('"+user+"','"+judul+"')";
       
            statement = (Statement) koneksi.createStatement();
            statement.executeUpdate(query); //execute querynya
            System.out.println("Berhasil ditambahkan");
            JOptionPane.showMessageDialog(null, "Data Berhasil ditambahkan");
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    	
    }
    
    
    
    //READ READ READ READ READ READ READ READ READ READ READ
    
    public String[][] readLogin(){
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakuser()][2];
            
            String query = "Select * from user"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("username"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("password");                
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    public String[][] readUser(){
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakuser()][5];
            
            String query = "Select * from user"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("username"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("password");             
                data[jmlData][2] = resultSet.getString("nama");
                data[jmlData][3] = resultSet.getString("email");
                data[jmlData][4] = resultSet.getString("about");
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    public String[][] readGame(){
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakgame()][5];
            
            String query = "Select * from game"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("judul"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("harga");             
                data[jmlData][2] = resultSet.getString("genre");
                data[jmlData][3] = resultSet.getString("studio");
                data[jmlData][4] = resultSet.getString("description");
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    public String[][] readGameList(String pilih){////DISINI BELUM SELESAI!!!
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakgame()][5];
            System.out.println(pilih);
            String query = "Select * from game, payment WHERE payment.username='"+pilih+"' and payment.judul = game.judul"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("judul"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("harga");             
                data[jmlData][2] = resultSet.getString("genre");
                data[jmlData][3] = resultSet.getString("studio");
                data[jmlData][4] = resultSet.getString("description");
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    
    public String[][] readGameDetail(String pilih){
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakgame()][5];
            System.out.println(pilih);
            String query = "Select * from game WHERE judul='"+pilih+"'"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("judul"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("harga");             
                data[jmlData][2] = resultSet.getString("genre");
                data[jmlData][3] = resultSet.getString("studio");
                data[jmlData][4] = resultSet.getString("description");
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    public String[][] readGameWish(String pilih){
    	try {
    		int jmlData = 0;
            
            String data[][] = new String[getBanyakgame()][5];
            System.out.println(pilih);
            String query = "Select * from game, wishlist WHERE wishlist.username='"+pilih+"' and wishlist.judul = game.judul"; 
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                data[jmlData][0] = resultSet.getString("judul"); //harus sesuai nama kolom di mysql
                data[jmlData][1] = resultSet.getString("harga");             
                data[jmlData][2] = resultSet.getString("genre");
                data[jmlData][3] = resultSet.getString("studio");
                data[jmlData][4] = resultSet.getString("description");
                jmlData++;
            }return data;
    	}
    	catch(SQLException e){
    		System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return null;
    	}
    }
    
    
    //UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE UPDATE
    
    public void updateUser(String username, String password, String nama, String email, String about){
        int jmlData=0;
         try {
           String query = "Select * from user WHERE username=" + username; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE user SET username='" + username + "', password='" + password +"', nama='" + nama + "', email='" + email + "', about='" + about + "' WHERE username=" + username;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateAbout(String about, String username){
        int jmlData=0;
         try {
           String query = "Select * from user WHERE username='" + username+"'"; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
           
             if (jmlData==1) {
                query = "UPDATE user SET about='" + about + "' WHERE username='" + username+"'";
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    public void updateGame(String judul, String harga, String genre, String studio, String description){
        int jmlData=0;
         try {
           String query = "Select * from game WHERE judul=" + judul; 
           ResultSet resultSet = statement.executeQuery(query);
           
           while (resultSet.next()){ 
                jmlData++;
            }
         
             if (jmlData==1) {
                query = "UPDATE game SET judul='" + judul + "', genre='" + genre +"', studio='" + studio + "', description='" + description + "' WHERE username=" + judul;
                statement = (Statement) koneksi.createStatement();
                statement.executeUpdate(query); //execute querynya
                System.out.println("Berhasil diupdate");
                JOptionPane.showMessageDialog(null, "Data Berhasil diupdate");
             }
             else {
                 JOptionPane.showMessageDialog(null, "Data Tidak Ada");
             }
           
        } catch (Exception sql) {
            System.out.println(sql.getMessage());   
            JOptionPane.showMessageDialog(null, sql.getMessage());
        }
    }
    
    
    //DELETE DELETE DELETE DELETE DELETE DELETE DELETE DELETE
    
    public void deleteUser (String username) {
        try{
            String query = "DELETE FROM user WHERE username = '"+username+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                       
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
    public void deleteGame (String judul) {
        try{
            String query = "DELETE FROM user WHERE username = '"+judul+"'";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                       
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
    
    public void deleteWishlist (String user, String judul) {
        try{
            String query = "DELETE FROM `wishlist` WHERE `wishlist`.`username` = "+user+" and `wishlist`.`judul`= "+judul+"";
            statement = koneksi.createStatement();
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
                       
            
        }catch(SQLException sql) {
            System.out.println(sql.getMessage());
        }
    }
      
    
    
    
    
    //MISC
    
    public int getBanyakuser(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from user";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    
    public int getBanyakgame(){
        int jmlData = 0;
        try{
            statement = koneksi.createStatement();
            String query = "Select * from game";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){ 
                jmlData++;
            }
            return jmlData;
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
            System.out.println("SQL Error");
            return 0;
        }
    }
    

    
    
}