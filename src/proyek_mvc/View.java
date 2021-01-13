package proyek_mvc;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Font;

@SuppressWarnings("unused")
public class View extends JFrame {

	private static final long serialVersionUID = 1L;
	JFrame framelogin = new JFrame();
	JFrame framekonten = new JFrame();
	JPanel panellogin = new JPanel();

    JPanel panelsidebar = new JPanel();
    JPanel panelexplore = new JPanel();
    JPanel panelprofil = new JPanel();
    JPanel panelpayment = new JPanel();
    JPanel paneladdnew = new JPanel();
    
    //Panel Login
    JLabel jltitle = new JLabel();
    JLabel jlusername = new JLabel();
    JLabel jlpassword = new JLabel();
    JTextField jtusername = new JTextField();
    JPasswordField jtpassword = new JPasswordField();
    JButton jblogin = new JButton();
    JButton jbsignin = new JButton();

    
    //Panel Explore
    JLabel jlhome = new JLabel();
    JLabel jlgreeting = new JLabel();
    JTable tabel;
    DefaultTableModel dtm;
    JScrollPane scrollPane;
    Object namaKolom[] = {"Judul", "Harga", "Studio"};
    
    
	public View() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		framelogin.setTitle("Login");
        framelogin.setVisible(true);
        framelogin.getContentPane().setLayout(null);
        framelogin.setSize(483, 297);
        
	    framekonten.setTitle("UAP");
	    framekonten.setVisible(false);
	    framekonten.getContentPane().setLayout(null);
	    framekonten.setSize(1280, 1024);
	    panellogin.setBounds(0, 0, 467, 258);
	  
	    
	    
	    //THE TITLE/LOGIN FRAME
	    
	    
	   // framelogin.getContentPane().add(panellogin); (Jadikan Komen untuk Edit yang Lain)
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
	    
	    
	    //THE CONTENT FRAME

	    framekonten.getContentPane().add(panelexplore);
	    framekonten.getContentPane().add(panelsidebar);
	    framekonten.getContentPane().add(panelprofil);
	    framekonten.getContentPane().add(panelpayment);
	    framekonten.getContentPane().add(paneladdnew);

	    panelexplore.setLayout(null);
	    panelsidebar.setLayout(null);
	    panelprofil.setLayout(null);
	    panelpayment.setLayout(null);
	    paneladdnew.setLayout(null);
		
	    //Panel Explore
	    dtm = new DefaultTableModel(namaKolom, 0);
	    tabel = new JTable(dtm);
        scrollPane = new JScrollPane(tabel);
        panelexplore.add(scrollPane);
        scrollPane.setBounds(10,40,343,360);
	    
	    
	}
	public String getUser(){
        return jtusername.getText();
    }
	@SuppressWarnings("deprecation")
	public String getPass() {
		return jtpassword.getText();
	}
}
