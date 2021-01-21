package proyek_mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;

import proyek_mvc.Model;
import proyek_mvc.View;

@SuppressWarnings("unused")
public class Control {
	int mastervariable=0;//HE IS THE CHOSEN ONE!!!
	
	Model model;
	View view;

	public Control(View vpc, Model mpc) {
		this.model = mpc;
        this.view = vpc;
        
        view.panellogin.setVisible(true);
        view.panelhome.setVisible(false);
        view.panelsidebar.setVisible(false);
        view.panelexplore.setVisible(false);
        view.panelprofil.setVisible(false);
        view.panelpayment.setVisible(false);
        view.paneladdnew.setVisible(false);
        view.panelsignin.setVisible(false);
        
        
        
        //LOGIN
        view.jblogin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		boolean valid = false;
        		String username = view.getUser();
        		String password = view.getPass();
        		if(view.getUser().equals("")||view.getPass().equals(""))JOptionPane.showMessageDialog(null, "Field Empty");
        		else {
        			String dataAnggota[][] = model.readLogin();
            		for(int i =0 ; i<model.getBanyakuser();i++) {
            			if(dataAnggota[i][0].equals(username)) {
            				if(dataAnggota[i][1].equals(password)) {
            					valid=true;
            				}
            			}
            			System.out.print(dataAnggota[i][0]+" "+view.getUser());
            			
            		}
            		if(valid == true) {
            			view.framelogin.dispose();
            			view.framekonten.setVisible(true);
            			view.panelhome.setVisible(true);
            		}
            		else JOptionPane.showMessageDialog(null, "Wrong Password or Username");
        		}
        		
        	}
        });
        view.jbsignnew.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		boolean valid =true;
        		String username = view.getUserbaru();
        		String password = view.getJtpasswordbaru();
        		String email = view.getEmail();
        		String nama = view.getNama();
        		String dataAnggota[][] = model.readLogin();
        		for(int i =0 ; i<model.getBanyakuser();i++) {
        			if(dataAnggota[i][0].equals(username)) {
        				valid=false;
        			}
        			System.out.print(dataAnggota[i][0]+" "+view.getUser());
        			
        		}
        		if(view.getUserbaru().equals("")||view.getJtpasswordbaru().equals(""))JOptionPane.showMessageDialog(null, "Field Empty");
        		else if(valid==false) JOptionPane.showMessageDialog(null, "Username Taken");
        		else model.signin(username, password, nama, email);
        	}
        });
        
        view.jbsignincancel.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panellogin.setVisible(true);
        		view.panelsignin.setVisible(false);
        		
        		
        	}
        });
        
        view.jbsignin.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panellogin.setVisible(false);
        		view.panelsignin.setVisible(true);
        	}
        });
        //HOME
        view.jbprofilhome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panelprofil.setVisible(true);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        		view.panelexplore.setVisible(false);
        		view.panelpayment.setVisible(false);
        		view.paneladdnew.setVisible(false);
        		String dataUser[][] = model.readUser();
        		view.jlnamaprofil.setText(dataUser[0][2]);
        		view.jlemailprofil.setText(dataUser[0][3]);
        		view.jtabout.setText(dataUser[0][4]);
        		String dataGame[][] = model.readGameList(view.getUser());
                view.tabelgame.setModel(new JTable(dataGame, view.namaKolom2).getModel());
                
        		
        	}
        });
        
        view.jbaddnewhome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.paneladdnew.setVisible(true);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        	}
        });
        
        view.jbexplorehome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mastervariable=0;
        		view.panelexplore.setVisible(true);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        		String dataGame[][] = model.readGame();
                view.tabel.setModel(new JTable(dataGame, view.namaKolom).getModel());
        	}
        });
        
        //SIDEBAR
        
        view.jbhome.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panelprofil.setVisible(false);
        		view.panelhome.setVisible(true);
        		view.panelsidebar.setVisible(false);
        		view.panelexplore.setVisible(false);
        		view.panelpayment.setVisible(false);
        		view.paneladdnew.setVisible(false);
        		
        	}
        });
        
        view.jbprofil.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panelprofil.setVisible(true);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        		view.panelexplore.setVisible(false);
        		view.panelpayment.setVisible(false);
        		view.paneladdnew.setVisible(false);
        		String dataUser[][] = model.readUser();
        		view.jlnamaprofil.setText(dataUser[0][2]);
        		view.jlemailprofil.setText(dataUser[0][3]);
        		view.jtabout.setText(dataUser[0][4]);
        		String dataGame[][] = model.readGameList(view.getUser());
                view.tabelgame.setModel(new JTable(dataGame, view.namaKolom2).getModel());
        	}
        });
        
        view.jbaddnew.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		view.panelprofil.setVisible(false);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        		view.panelexplore.setVisible(false);
        		view.panelpayment.setVisible(false);
        		view.paneladdnew.setVisible(true);
        	}
        });
        
        view.jbexplore.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mastervariable=0;
        		view.panelprofil.setVisible(false);
        		view.panelhome.setVisible(false);
        		view.panelsidebar.setVisible(true);
        		view.panelexplore.setVisible(true);
        		view.panelpayment.setVisible(false);
        		view.paneladdnew.setVisible(false);
        		
        		String dataGame[][] = model.readGame();
                view.tabel.setModel(new JTable(dataGame, view.namaKolom).getModel());
        	}
        });
        //EXPLORE
        view.tabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mousePressed(e);
                
                view.jbdetails.setEnabled(true);
                
                view.jbdetails.addActionListener(new ActionListener() {
                	int baris = view.tabel.getSelectedRow();
                    String dataterpilih = view.tabel.getValueAt(baris, 0).toString();
                	public void actionPerformed(ActionEvent e) {
                		if(mastervariable==0) {
                			String dataGame[][] = model.readGameDetail(dataterpilih);
                			view.jlnamagame.setText(dataGame[0][0]);
                			view.jlhargagame.setText(dataGame[0][1]);
                			view.jlgenregame.setText(dataGame[0][2]);
                			view.jlstudiogame.setText(dataGame[0][3]);
                			view.jtgamedetails.setText(dataGame[0][4]);
                			view.panelexplore.setVisible(false);
                            view.panelpayment.setVisible(true);
                            mastervariable++;
                		}
            			
                	}
                });
               
                
                
            }
        }
        );
        
        //PROFIL
        view.jbeditabout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 view.jtabout.setEditable(true);
        	}
        });

        view.jbsaveabout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String username=view.getUser();
        		String about = view.getAboutuser();
        		model.updateAbout(about, username);
        		view.jtabout.setEditable(false);
        	}
        });
        //PAYMENT
        view.jbbuygame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String username=view.getUser();
        		String judul = view.jlnamagame.getText();
        		model.addpayment(username, judul);
        		
        		
        	}
        });
        
        view.jbaddwish.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String username=view.getUser();
        		String judul = view.jlnamagame.getText();
        		model.addwishlist(username, judul);
        		
        	}
        });
        //ADD NEW//masih kurang handling harga
        view.jbnewgame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		boolean valid =true;
        		String judul = view.getJudulGame();
        		//int harga = view.getHargaGame();
        		String genre = view.getGenreGame();
        		String studio = view.getStudioGame();
        		String description = view.getDeskripsi();
        		String dataGame[][] = model.readGame();
        		for(int i =0 ; i<model.getBanyakgame();i++) {
        			if(dataGame[i][0].equals(view.getJudulGame())) {
        				valid=false;
        			}
        			System.out.print(dataGame[i][0]+" "+view.getJudulGame());
        			
        		}
        		if(view.getJudulGame().equals("")||view.getGenreGame().equals(""))JOptionPane.showMessageDialog(null, "Field Empty");
        		else if(valid==false) JOptionPane.showMessageDialog(null, "Title Taken");
        		else model.addgame(judul, 0, genre, studio, description);
        	}
        });
	}

}
