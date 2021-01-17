package proyek_mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;

@SuppressWarnings("unused")
public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	JFrame framelogin = new JFrame();
	JFrame framekonten = new JFrame();
	JPanel panellogin = new JPanel();
	JPanel panelhome = new JPanel();
    JPanel panelsidebar = new JPanel();
    JPanel panelexplore = new JPanel();
    JPanel panelprofil = new JPanel();
    JPanel panelpayment = new JPanel();
    JPanel paneladdnew = new JPanel();
    JPanel panelsignin = new JPanel();
    
    //Panel Sign In
    JLabel jlnama = new JLabel();
    JLabel jlemail = new JLabel();
    JLabel jlpasswordbaru = new JLabel();
    JLabel jlusernamebaru = new JLabel();
    JTextField jtnama = new JTextField();
    JTextField jtemail = new JTextField();
    JPasswordField jtpasswordbaru = new JPasswordField();
    JTextField jtusernamebaru = new JTextField();
    JButton jbsignnew = new JButton();
    JButton jbsignincancel = new JButton();
    
    
    //Panel Login
    JLabel jltitle = new JLabel();
    JLabel jlusername = new JLabel();
    JLabel jlpassword = new JLabel();
    JTextField jtusername = new JTextField();
    JPasswordField jtpassword = new JPasswordField();
    JButton jblogin = new JButton();
    JButton jbsignin = new JButton();
    
    //Panel Home
    JLabel jlbanner = new JLabel();
    JTextPane aboutus = new JTextPane();
    JButton jbprofilhome = new JButton();
    JButton jbaddnewhome = new JButton();
    JButton jbexplorehome = new JButton();
    
    //Panel Explore
    JLabel jlhome = new JLabel();
    JLabel jlgreeting = new JLabel();
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Judul", "Harga", "Studio", "Genre"};
    JButton details = new JButton();
    
    
    //Panel Sidebar
    JButton jbprofil = new JButton();
    JButton jbaddnew = new JButton();
    JButton jbhome = new JButton();
    JButton jbexplore = new JButton();
    
    //Panel Profil
    JTextPane jtabout = new JTextPane();
    JLabel jlnamaprofil = new JLabel();
    JLabel jlemailprofil = new JLabel();
    JLabel jlgameprofil = new JLabel();
    JTable tabelgame;
    DefaultTableModel dtm2;
    JScrollPane scrollPanegame;
    Object namaKolom2[] = {"Judul", "Harga", "Studio", "Genre"};
    
    //Panel Payment
    JTextPane jtgamedetails = new JTextPane();
    JLabel jlnamagame = new JLabel();
    JLabel jlhargagame = new JLabel();
    JLabel jlgenregame = new JLabel();
    JLabel jlstudiogame = new JLabel();
    JButton jbbuygame = new JButton();
    JButton jbaddwish = new JButton();
    
    //Panel Add New
    JLabel jljudulgamebaru = new JLabel();
    JLabel jlhargagamebaru = new JLabel();
    JLabel jlgenregamebaru = new JLabel();
    JLabel jlstudiogamebaru = new JLabel();
    JLabel jldeskripsigamebaru = new JLabel();
    
    JTextPane jtjudulgamebaru = new JTextPane();
    JTextPane jthargagamebaru = new JTextPane();
    JTextPane jtgenregamebaru = new JTextPane();
    JTextPane jtstudiogamebaru = new JTextPane();
    final TextArea tadeskripsigamebaru = new TextArea();

    
	public View(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		framelogin.setTitle("Login");
        framelogin.setVisible(true);
        framelogin.getContentPane().setLayout(null);
        framelogin.setSize(483, 297);
        
	    framekonten.setTitle("UAP");
	    framekonten.setVisible(false);
	    framekonten.getContentPane().setLayout(null);
	    framekonten.setSize(906, 788);
	    panellogin.setBounds(0, 0, 467, 258);
	  
	    
		
		

	    
	    //THE TITLE/LOGIN FRAME
	    
	    
	   // framelogin.getContentPane().add(panellogin); (Jadikan Komen untuk Edit yang Lain)
	   // framelogin.getContentPane().add(panelsignin);
	    
	    //Panel Login
	    panellogin.setLayout(null);
	    jltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
	    jltitle.setBounds(135, 29, 198, 42);
	    jltitle.setText("Welcome to Steam");
	    panellogin.add(jltitle);
	    jlusername.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    jlusername.setText("Username");
	    jlusername.setBounds(50, 82, 84, 29);
	    panellogin.add(jlusername);
	    jlpassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
	    jlpassword.setText("Password");
	    jlpassword.setBounds(50, 122, 84, 29);
	    panellogin.add(jlpassword);
	    jtusername.setBounds(145, 84, 180, 29);
	    panellogin.add(jtusername);
	    jtpassword.setBounds(145, 124, 180, 29);
	    panellogin.add(jtpassword);
	    jblogin.setBounds(902, 0, 180, 749);
	    panellogin.add(jblogin);
	    jbsignin.setBounds(1082, 0, 180, 749);
	    panellogin.add(jbsignin);
	    
	    //Panel Sign In
	    panelsignin.setLayout(null);
	    
	    panelsignin.add(jlnama);
	    panelsignin.add(jlemail);
	    panelsignin.add(jlpasswordbaru);
	    panelsignin.add(jlusernamebaru);
	    panelsignin.add(jbsignnew);
	    panelsignin.add(jbsignincancel);
	    
	    //THE CONTENT FRAME

	    framekonten.getContentPane().add(panelexplore);//Jadikan komen kalo mau edit yang satunya
	    panelsidebar.setBounds(0, 0, 178, 749);
	    framekonten.getContentPane().add(panelsidebar);
	    framekonten.getContentPane().add(panelprofil);
	    framekonten.getContentPane().add(panelpayment);
	    paneladdnew.setBounds(178, 0, 718, 749);
	    framekonten.getContentPane().add(paneladdnew);
	    panelhome.setBounds(0, 0, 1264, 749);
	    //framekonten.getContentPane().add(panelhome);//Selesai di setting, jadiin komen dulu biar gak overlap

	    panelexplore.setLayout(null);
	    panelsidebar.setLayout(null);
	    panelprofil.setLayout(null);
	    panelpayment.setLayout(null);
	    panelhome.setLayout(null);
	    jlbanner.setFont(new Font("Tahoma", Font.BOLD, 16));
	    jlbanner.setBounds(524, 8, 163, 20);
	    jlbanner.setText("WELCOME TO UAP");
	    
	    //Panel Home
		
	    panelhome.add(jlbanner);
	    aboutus.setText("Dan ini adalah alasan mengapa Pandu Dhaulagiri bukan merupakan\r\nseorang Front End Programmer");
	    aboutus.setBounds(352, 99, 561, 233);
	    panelhome.add(aboutus);
	    jbprofilhome.setText("PROFIL");
	    jbprofilhome.setBounds(400, 65, 90, 23);
	    panelhome.add(jbprofilhome);
	    jbaddnewhome.setText("UPLOAD GAME");
	    jbaddnewhome.setBounds(539, 65, 113, 23);
	    panelhome.add(jbaddnewhome);
	    jbexplorehome.setText("EXPLORE GAME");
	    jbexplorehome.setBounds(695, 65, 107, 23);
	    panelhome.add(jbexplorehome);
	    
	    /*BufferedImage myPicture;
	    
	     * TAMBAHIN GAMBAR DI PROGRAM WOYYYYY!!! BIAR TAMBAH KEREN!!!
	     * 
		try {
			myPicture = ImageIO.read(new File("D:\\The Foundation\\Site 03 - Secondary R&D Site\\OOP\\Proyek Akhir\\image\\220728.jpg"));
			JLabel picLabel = new JLabel(new ImageIcon(myPicture));
			panelhome.add(picLabel);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    */
	    
	    //Panel Explore
	    dtm = new DefaultTableModel(namaKolom, 0);
	    tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        panelexplore.add(scrollPane);
        scrollPane.setBounds(10,40,343,360);
	    
        panelexplore.add(jlgreeting);
        panelexplore.add(jlhome);
        panelexplore.add(details);
        
        //Panel Sidebar
        panelsidebar.add(jbhome);
        panelsidebar.add(jbaddnew);
        panelsidebar.add(jbexplore);
        panelsidebar.add(jbprofil);
        
        //Panel Profil
        panelprofil.add(jtabout);
        panelprofil.add(jlemailprofil);
        panelprofil.add(jlnamaprofil);
        panelprofil.add(jlgameprofil);
        dtm2 = new DefaultTableModel(namaKolom2, 0);
	    tabelgame = new JTable(dtm2);
        scrollPanegame = new JScrollPane(tabelgame);
        
        //Panel Payment
        
        panelpayment.add(jtgamedetails);
        panelpayment.add(jlnamagame);
        panelpayment.add(jlhargagame);
        panelpayment.add(jlgenregame);
        panelpayment.add(jbbuygame);
        panelpayment.add(jbaddwish);
        paneladdnew.setLayout(null);
        jljudulgamebaru.setText("Judul Game Baru");
        jljudulgamebaru.setBounds(67, 54, 87, 20);
        
        //Panel Add New
        
        paneladdnew.add(jljudulgamebaru);
        jlhargagamebaru.setText("Harga Game Baru");
        jlhargagamebaru.setBounds(67, 85, 87, 20);
        paneladdnew.add(jlhargagamebaru);
        jlgenregamebaru.setText("Genre Game Baru");
        jlgenregamebaru.setBounds(67, 116, 87, 20);
        paneladdnew.add(jlgenregamebaru);
        jlstudiogamebaru.setText("Studio Game Baru");
        jlstudiogamebaru.setBounds(67, 147, 87, 20);
        paneladdnew.add(jlstudiogamebaru);
        jldeskripsigamebaru.setText("Deskripsi Game Baru");
        jldeskripsigamebaru.setBounds(67, 178, 97, 20);
        paneladdnew.add(jldeskripsigamebaru);
        jtjudulgamebaru.setBounds(195, 54, 214, 20);
        paneladdnew.add(jtjudulgamebaru);
        jthargagamebaru.setBounds(195, 85, 214, 20);
        paneladdnew.add(jthargagamebaru);
        jtgenregamebaru.setBounds(195, 116, 214, 20);
        paneladdnew.add(jtgenregamebaru);
        jtstudiogamebaru.setBounds(195, 147, 214, 20);
        paneladdnew.add(jtstudiogamebaru);
        tadeskripsigamebaru.setBounds(195, 178, 214, 258);
        paneladdnew.add(tadeskripsigamebaru);
	    
	}
	
	//GETTERS
	public String getNama() {
        return jtnama.getText();
    }
        
        public String getEmail(){
        return jtemail.getText();
        }

        public String getUserbaru() {
        return jtusernamebaru.getText();
    }
	public String getUser(){
        return jtusername.getText();
    }
	@SuppressWarnings("deprecation")
	public String getPass() {
		return jtpassword.getText();
	}
	@SuppressWarnings("deprecation")
        public String getJtpasswordbaru() {
        return jtpasswordbaru.getText();
    }
	
}
