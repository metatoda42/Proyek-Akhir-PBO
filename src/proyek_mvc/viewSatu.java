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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("unused")
public class viewSatu extends JFrame {



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
    JLabel jlbanner2 = new JLabel();
    JLabel jlgambar = new JLabel();
    JLabel jlgambar2 = new JLabel();
    JLabel jlgambar3 = new JLabel();
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
    JButton details;
    
    
    //Panel Sidebar
    JTextPane jttitle = new JTextPane();
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

    
	public viewSatu(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		framelogin.setTitle("Login");
        framelogin.setVisible(true);
        framelogin.getContentPane().setLayout(null);
        framelogin.setSize(483, 297);
        
	    framekonten.setTitle("UAP");
	    framekonten.setVisible(false);
	    framekonten.getContentPane().setLayout(null);
	    framekonten.setSize(744, 639);
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
	    panelexplore.setBounds(210, 10, 520, 592);
	    panelsidebar.setBackground(new Color(0, 102, 153));
	    panelsidebar.setBounds(0, 0, 198, 602);
	    
	    //THE CONTENT FRAME
	    //ON OFF ON OFF ON OFF ON OFF ON OFF ON OFF
	    //framekonten.getContentPane().add(panelexplore);//Jadikan komen kalo mau edit yang satunya
	    //framekonten.getContentPane().add(panelsidebar);
	    panelprofil.setBackground(new Color(0, 102, 153));
	    panelprofil.setBounds(197, 0, 546, 592);
	    //framekonten.getContentPane().add(panelprofil);
	    framekonten.getContentPane().add(panelpayment);
	    panelhome.setBackground(new Color(0, 102, 153));
	    panelhome.setBounds(0, 0, 730, 602);
	    //framekonten.getContentPane().add(paneladdnew);
	    framekonten.getContentPane().add(panelhome);

	    panelexplore.setLayout(null);
	    panelsidebar.setLayout(null);
	    panelprofil.setLayout(null);
	    panelpayment.setLayout(null);
	    paneladdnew.setLayout(null);
	    panelhome.setLayout(null);
	    jlbanner.setFont(new Font("Lato Black", Font.PLAIN, 40));
	    jlbanner.setText("STEAM");
	    jlbanner.setBounds(29, 61, 142, 56);
	    
	    //Panel Home
		
	    panelhome.add(jlbanner);
	    jlbanner2.setText("your first-choice game store");
	    jlbanner2.setFont(new Font("Lato", Font.ITALIC, 12));
	    jlbanner2.setBounds(29, 112, 190, 19);
	    panelhome.add(jlbanner2);
	    aboutus.setBounds(29, 271, 680, 143);
	    jlgambar.setHorizontalAlignment(SwingConstants.CENTER);
	    jlgambar.setText("GAMBAR 1");
	    jlgambar.setBackground(new Color(102, 204, 102));
	    jlgambar.setBounds(29, 152, 202, 99);
	    panelhome.add(jlgambar);
	    jlgambar2.setText("GAMBAR 2");
	    jlgambar2.setHorizontalAlignment(SwingConstants.CENTER);
	    jlgambar2.setBounds(260, 152, 214, 99);
	    panelhome.add(jlgambar2);
	    jlgambar3.setText("GAMBAR 3");
	    jlgambar3.setHorizontalAlignment(SwingConstants.CENTER);
	    jlgambar3.setBounds(495, 152, 214, 99);
	    panelhome.add(jlgambar3);
	    panelhome.add(aboutus);
	    jbprofilhome.setText("Profile\r\n");
	    jbprofilhome.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    	}
	    });
	    jbprofilhome.setBounds(601, 10, 108, 34);
	    panelhome.add(jbprofilhome);
	    jbaddnewhome.setText("Add Game");
	    jbaddnewhome.setBounds(467, 10, 116, 34);
	    panelhome.add(jbaddnewhome);
	    jbexplorehome.setText("Explore");
	    jbexplorehome.setBounds(341, 10, 116, 34);
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
        scrollPane.setBounds(54,70,444,336);
        jlgreeting.setBounds(232, 22, 84, 18);
	    
        panelexplore.add(jlgreeting);
        jlhome.setBounds(75, 461, 403, 85);
        panelexplore.add(jlhome);
        panelexplore.add(details);
        jbhome.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbhome.setText("Home");
        jbhome.setBounds(10, 106, 170, 76);
        jttitle.setForeground(new Color(255, 255, 255));
        jttitle.setBackground(new Color(0, 102, 153));
        jttitle.setText("     STEAM\r\n");
        jttitle.setFont(new Font("Lato Black", Font.BOLD, 30));
        jttitle.setBounds(10, 24, 170, 43);
        
        //Panel Sidebar
        panelsidebar.add(jttitle);
        panelsidebar.add(jbhome);
        jbaddnew.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbaddnew.setText("Explore");
        jbaddnew.setBounds(10, 207, 170, 76);
        panelsidebar.add(jbaddnew);
        jbexplore.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbexplore.setText("Add Game");
        jbexplore.setBounds(10, 315, 170, 76);
        panelsidebar.add(jbexplore);
        jbprofil.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbprofil.setText("Profile");
        jbprofil.setBounds(10, 422, 170, 76);
        panelsidebar.add(jbprofil);
        jtabout.setForeground(new Color(255, 255, 255));
        jtabout.setText("Deskripsi\r\n\r\nDeskripsi");
        jtabout.setFont(new Font("Lato", Font.BOLD, 16));
        jtabout.setBackground(new Color(0, 51, 0));
        jtabout.setBounds(47, 103, 429, 180);
        
        //Panel Profil
        panelprofil.add(jtabout);
        jlemailprofil.setFont(new Font("Lato Thin", Font.PLAIN, 13));
        jlemailprofil.setText("email@gmail.com\r\n\r\n");
        jlemailprofil.setForeground(new Color(0, 0, 0));
        jlemailprofil.setBounds(47, 71, 192, 29);
        panelprofil.add(jlemailprofil);
        jlnamaprofil.setFont(new Font("Lato", Font.BOLD, 30));
        jlnamaprofil.setText("Hello, nama\r\n");
        jlnamaprofil.setBounds(47, 29, 283, 51);
        panelprofil.add(jlnamaprofil);
        jlgameprofil.setText("YOUR GAME LIBRARIES");
        jlgameprofil.setFont(new Font("Lato Black", Font.PLAIN, 17));
        jlgameprofil.setBounds(162, 293, 192, 35);
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
        paneladdnew.add(jlhargagamebaru);
        paneladdnew.add(jlgenregamebaru);
        paneladdnew.add(jlstudiogamebaru);
        paneladdnew.add(jldeskripsigamebaru);
        paneladdnew.add(jtjudulgamebaru);
        paneladdnew.add(jthargagamebaru);
        paneladdnew.add(jtgenregamebaru);
        paneladdnew.add(jtstudiogamebaru);
        paneladdnew.add(tadeskripsigamebaru);
        jljudulgamebaru.setBounds(134, 107, 127, 25);
        framekonten.getContentPane().add(jljudulgamebaru);
	    
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
