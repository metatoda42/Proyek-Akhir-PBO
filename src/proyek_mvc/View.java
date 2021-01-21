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
public class View extends JFrame {



	private static final long serialVersionUID = 1L;
	
	
	
	JFrame framelogin = new JFrame();
	JFrame framekonten = new JFrame();
	JPanel panellogin = new JPanel();
	JPanel panelhome = new JPanel();
    JPanel panelsidebar = new JPanel();
    JPanel panelexplore = new JPanel();
    JPanel panelprofil = new JPanel();
    JPanel panelpayment =  new JPanel();
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
    JButton jbdetails = new JButton();
    
    
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
    JButton jbeditabout = new JButton();
    DefaultTableModel dtm2;
    JScrollPane scrollPanegame;
    Object namaKolom2[] = {"Judul", "Harga", "Studio", "Genre"};
    JButton jbsaveabout = new JButton();
    
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
    JButton jbnewgame = new JButton();

    
	public View(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		framelogin.setTitle("Login");
        framelogin.setVisible(true);
        framelogin.getContentPane().setLayout(null);
        framelogin.setSize(483, 297);
        panellogin.setBounds(0, 0, 467, 258);
	    panelsignin.setBounds(0, 0, 467, 258);
        
	    framekonten.setTitle("UAP");
	    framekonten.setVisible(false);
	    framekonten.getContentPane().setLayout(null);
	    framekonten.setSize(744, 639);
	    
	  
	    
		
		

	    
	    //THE TITLE/LOGIN FRAME
	    
	    
	    //framelogin.getContentPane().add(panellogin);// (Jadikan Komen untuk Edit yang Lain)
	    //framelogin.getContentPane().add(panelsignin);
	    
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
	    jblogin.setText("LOGIN\r\n");
	    jblogin.setBounds(145, 176, 84, 29);
	    panellogin.add(jblogin);
	    jbsignin.setText("REGISTER");
	    jbsignin.setBounds(232, 176, 93, 29);
	    panellogin.add(jbsignin);
	    
	    //Panel Sign In
	    panelsignin.setLayout(null);
	    jlnama.setText("Nama: ");
	    jlnama.setBounds(105, 48, 49, 15);
	    
	    panelsignin.add(jlnama);
	    jlemail.setBounds(105, 82, 49, 15);
	    jlemail.setText("Email: ");
	    panelsignin.add(jlemail);
	    jlpasswordbaru.setText("Password");
	    jlpasswordbaru.setBounds(79, 156, 75, 15);
	    panelsignin.add(jlpasswordbaru);
	    jlusernamebaru.setBounds(79, 119, 75, 15);
	    jlusernamebaru.setText("Username");
	    panelsignin.add(jlusernamebaru);
	    jbsignnew.setText("Sign In");
	    jbsignnew.setBounds(162, 192, 75, 26);
	    panelsignin.add(jbsignnew);
	    jbsignincancel.setText("Login");
	    jbsignincancel.setBounds(236, 192, 67, 26);
	    panelsignin.add(jbsignincancel);
	    panelsignin.add(jtnama);
	    panelsignin.add(jtemail);
	    panelsignin.add(jtpasswordbaru);
	    panelsignin.add(jtusernamebaru);
	    jtnama.setBounds(163, 42, 140, 26);
	    
	    jtemail.setBounds(164, 76, 140, 26);
	    
	    jtpasswordbaru.setBounds(163, 150, 140, 26);
	    
	    jtusernamebaru.setBounds(163, 113, 140, 26);
	    panelexplore.setBackground(new Color(0, 102, 153));
	    
	    panelexplore.setBounds(197, 0, 533, 602);
	    panelsidebar.setBackground(new Color(0, 102, 153));
	    panelsidebar.setBounds(0, 0, 198, 602);
	    
	    
	    //THE CONTENT FRAME
	    //ON OFF ON OFF ON OFF ON OFF ON OFF ON OFF
	    //framekonten.getContentPane().add(panelexplore);//Jadikan komen kalo mau edit yang satunya
	    framekonten.getContentPane().add(panelsidebar);
	    panelprofil.setBackground(new Color(0, 102, 153));
	    panelprofil.setBounds(197, 0, 546, 592);
	    //framekonten.getContentPane().add(panelprofil);
	    panelhome.setBackground(new Color(0, 102, 153));
	    panelhome.setBounds(0, 0, 730, 602);
	    paneladdnew.setBackground(new Color(0, 102, 153));
	    paneladdnew.setBounds(210, 0, 518, 602);
	    panelpayment.setBackground(new Color(0, 102, 153));
	    //framekonten.getContentPane().add(paneladdnew);
	    //framekonten.getContentPane().add(panelhome);
	    framekonten.getContentPane().add(panelpayment);

	    panelexplore.setLayout(null);
	    panelsidebar.setLayout(null);
	    panelprofil.setLayout(null);
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
        scrollPane.setBounds(23,70,475,336);
        jlgreeting.setHorizontalAlignment(SwingConstants.CENTER);
        jlgreeting.setText("Welcome to Steam");
        jlgreeting.setFont(new Font("Bebas Neue Bold", Font.BOLD, 26));
        jlgreeting.setBounds(23, 22, 475, 37);
	    
        panelexplore.add(jlgreeting);
        jlhome.setText("PLACE IMAGE HERE!!!");
        jlhome.setBounds(23, 461, 455, 102);
        panelexplore.add(jlhome);
        jbdetails.setText("DETAILS");
        jbdetails.setBounds(33, 416, 102, 33);
        panelexplore.add(jbdetails);
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
        jbaddnew.setText("Add Game");
        jbaddnew.setBounds(10, 207, 170, 76);
        panelsidebar.add(jbaddnew);
        jbexplore.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbexplore.setText("Explore");
        jbexplore.setBounds(10, 315, 170, 76);
        panelsidebar.add(jbexplore);
        jbprofil.setFont(new Font("Lato Black", Font.PLAIN, 15));
        jbprofil.setText("Profile");
        jbprofil.setBounds(10, 422, 170, 76);
        panelsidebar.add(jbprofil);
        jtabout.setEditable(false);
        jtabout.setForeground(new Color(255, 255, 255));
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
        scrollPanegame.setBounds(47, 324, 445, 257);
        panelprofil.add(scrollPanegame);
        jbeditabout.setText("Edit");
        jbeditabout.setBounds(427, 11, 94, 29);
        panelprofil.add(jbeditabout);
        jbsaveabout.setText("Save");
        jbsaveabout.setBounds(427, 51, 94, 29);
        panelprofil.add(jbsaveabout);
        
        
        //Panel Add New
        jlhargagamebaru.setFont(new Font("Lato Black", Font.BOLD, 17));
        jlhargagamebaru.setText("HARGA");
        jlhargagamebaru.setBounds(10, 46, 92, 45);
        paneladdnew.add(jlhargagamebaru);
        jlgenregamebaru.setText("GENRE");
        jlgenregamebaru.setFont(new Font("Lato Black", Font.BOLD, 17));
        jlgenregamebaru.setBounds(10, 85, 92, 32);
        paneladdnew.add(jlgenregamebaru);
        jlstudiogamebaru.setFont(new Font("Lato Black", Font.BOLD, 17));
        jlstudiogamebaru.setText("STUDIO");
        jlstudiogamebaru.setBounds(10, 121, 92, 32);
        paneladdnew.add(jlstudiogamebaru);
        jldeskripsigamebaru.setText("ABOUT THE GAME");
        jldeskripsigamebaru.setBounds(20, 171, 226, 32);
        jldeskripsigamebaru.setFont(new Font("Bebas Neue Bold", Font.BOLD, 28));
        paneladdnew.add(jldeskripsigamebaru);
        jtjudulgamebaru.setBounds(95, 29, 151, 20);
        paneladdnew.add(jtjudulgamebaru);
        jthargagamebaru.setBounds(95, 59, 151, 20);
        paneladdnew.add(jthargagamebaru);
        jtgenregamebaru.setBounds(95, 97, 151, 20);
        paneladdnew.add(jtgenregamebaru);
        jtstudiogamebaru.setBounds(95, 128, 151, 20);
        paneladdnew.add(jtstudiogamebaru);
        tadeskripsigamebaru.setBounds(20, 209, 440, 357);
        paneladdnew.add(tadeskripsigamebaru);
        jljudulgamebaru.setFont(new Font("Lato Black", Font.BOLD, 17));
        jljudulgamebaru.setText("JUDUL");
        jljudulgamebaru.setBounds(10, 17, 127, 45);
        paneladdnew.add(jljudulgamebaru);
        panelpayment.setBounds(197, 0, 533, 602);
        framekonten.getContentPane().add(panelpayment);
        panelpayment.setLayout(null);
        jtgamedetails.setFont(new Font("Lato", Font.PLAIN, 13));
        jtgamedetails.setBounds(21, 199, 404, 108);
        
        
        
        //Panel Payment
        
        panelpayment.add(jtgamedetails);
        jlnamagame.setForeground(new Color(211, 211, 211));
        jlnamagame.setFont(new Font("Lato Black", Font.PLAIN, 45));
        jlnamagame.setText("Nama game");
        jlnamagame.setBounds(22, 34, 288, 60);
        panelpayment.add(jlnamagame);
        jlhargagame.setText("Harga Game");
        jlhargagame.setFont(new Font("Lato Black", Font.PLAIN, 17));
        jlhargagame.setBounds(21, 122, 132, 31);
        panelpayment.add(jlhargagame);
        jlgenregame.setText("Genre Game");
        jlgenregame.setFont(new Font("Lato Black", Font.PLAIN, 17));
        jlgenregame.setBounds(21, 99, 132, 25);
        panelpayment.add(jlgenregame);
        jlstudiogame.setFont(new Font("Lato Black", Font.PLAIN, 17));
        jlstudiogame.setText("Studio Game");
        jlstudiogame.setBounds(21, 150, 146, 25);
        panelpayment.add(jlstudiogame);
        jbbuygame.setFont(new Font("Lato", Font.PLAIN, 13));
        jbbuygame.setText("Buy Game");
        jbbuygame.setBounds(22, 354, 146, 39);
        panelpayment.add(jbbuygame);
        jbaddwish.setText("Add to wishlist");
        jbaddwish.setFont(new Font("Lato", Font.PLAIN, 13));
        jbaddwish.setBounds(279, 354, 146, 39);
        panelpayment.add(jbaddwish);
	    
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
	
	public String getJudulGame(){
		return jtjudulgamebaru.getText();
	}
	
	public String getAboutuser() {
		return jtabout.getText();
	}
	/*public int getHargaGame(){
		String rice= jthargagamebaru.getText();
		return rice; //Note, convert to int later once you figure it out.
	}*/
	
	public String getGenreGame() {
		return jtgenregamebaru.getText();
	}
	public String getStudioGame() {
		return jtstudiogamebaru.getText();
	}
	public String getDeskripsi() {
		return tadeskripsigamebaru.getText();
	}

	
}
