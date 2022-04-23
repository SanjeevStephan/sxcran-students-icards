package regCard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

//import registrationCard.IDcard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JOptionPane;
import java.awt.Color;
public class IDcard extends JFrame {

	private JPanel contentPane;
	static JLabel lblimg,lblPic;
	static String studname,fathername,gender,regno,exmno,classroll,dob,category,religion;
    JLabel lblIdname,lblIdfather,lblIdregd,lblIdexmroll,lblIdroll,lblIdcategory,lblIddob,lblIdreligion;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IDcard frame = new IDcard();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IDcard() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		// invoking the path from the launch here
				RegLaunch launch = new RegLaunch();
				String exmroll = launch.Exmno;
				//ReadFiles read = new ReadFiles();
				
				exmno = launch.Exmno;
				studname=launch.Name;
				fathername=launch.Father;
				regno=launch.Regno;
				classroll= launch.Classroll;
				gender=launch.Gender;
				dob=launch.Dob;
				religion=launch.Religion;
				category=launch.Category;
				//String fpath = read.fpath;
				String fpath =System.getProperty("user.home");
				
				String sxcfPath = fpath +"\\Documents\\Stephenware\\sxc_student_iCards\\"+ exmroll+".txt";;
				String studImg = fpath + "\\Documents\\Stephenware\\sxc_student_iCards\\Stud_img\\"+exmroll +".jpg";
				
				//JOptionPane.showMessageDialog(null, sxcfPath);
				/*
				 * 
				 * READING FILES FROM THE FILE USING THE PATH fpath
				 */
		/*		try
				{
				FileInputStream fstream = new FileInputStream(sxcfPath);
				DataInputStream dstream = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
				String strline = br.readLine();
				
			//	JOptionPane.showMessageDialog(null, strline);
				String seperater = "%";
				String splitMe[]=strline.split(seperater);
				
				regno=splitMe[1];
				exmno=splitMe[2];
				classroll=splitMe[3];
				studname=splitMe[4];
				gender=splitMe[5];
				dob=splitMe[6];
				fathername=splitMe[7];
				religion=splitMe[8];
				category=splitMe[9];
				
				/*
				 * JOptionPane.showMessageDialog(null, "Registration no :"+regno
		                +"\nExm roll no"+exmno
		                +"\nClass roll no"+classroll
		                +"\nStudnent "+studname
		                +"\ngender :"+gender
		                +"\nDate of birth"+dob
		                +"\nFather name :"+fathername
		                +"\nReligion :"+religion
		                +"\nCategory :"+category);                 
				 */
				
		/*	} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/	
				contentPane.setLayout(null);
				
				//JOptionPane.showMessageDialog(null, "ITS WORKING "+sxcfPath);
			  //  JOptionPane.showMessageDialog(null, "father name :" + studname);
				//IDcard id = new IDcard();
				//id.setTitle("ID Card |"+studname);
				
				JLabel lblLogo = new JLabel("");
				lblLogo.setIcon(new ImageIcon(IDcard.class.getResource("/img_src/logo.png")));
				lblLogo.setBounds(16, 0, 418, 69);
				contentPane.add(lblLogo);
				
				JLabel lblBaiHistory = new JLabel("B.A-I History");
				lblBaiHistory.setFont(new Font("Simplified Arabic Fixed", Font.PLAIN, 15));
				lblBaiHistory.setBounds(159, 69, 139, 14);
				contentPane.add(lblBaiHistory);
				
				JSeparator separator = new JSeparator();
				separator.setBackground(new Color(0, 100, 0));
				separator.setBounds(16, 91, 424, 2);
				contentPane.add(separator);
				
				lblPic = new JLabel("");
				lblPic.setForeground(Color.BLUE);
				lblPic.setBackground(Color.BLUE);
				//lblPic.setIcon(new ImageIcon("C:\\Users\\Stephan\\Documents\\sxc_student_info\\stud_img\\16AHIS031448.jpg"));
				lblPic.setBounds(10, 101, 99, 88);
				contentPane.add(lblPic);
				lblPic.setIcon(new ImageIcon(studImg));
				/*
				 * 
				 * Using the exm roll no to complete the Image file Path below
				 * 
				 * 
				 */
			
				
				//exmroll="16AHIS031448";
			//	String userHome = System.getProperty("user.home");
			//	String sxcfPath = userHome + "\\Documents"+"\\sxc_student_info"+"\\stud_img\\"+exmroll+".jpg";
				//JOptionPane.showMessageDialog(null, sxcfPath);
				lblimg = new JLabel("");
				lblimg.setBounds(16, 104, 91, 88);
				contentPane.add(lblimg);
				//lblPic.setIcon(new ImageIcon("C:\\Users\\Stephan\\Documents\\sxc_student_info\\stud_img\\16AHIS033717.jpg"));
				
				JLabel lblName = new JLabel("Name  :");
				lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblName.setBounds(118, 104, 46, 14);
				contentPane.add(lblName);
				
				lblIdname = new JLabel(studname);
				lblIdname.setForeground(new Color(220, 20, 60));
				lblIdname.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblIdname.setBounds(166, 104, 265, 14);
				contentPane.add(lblIdname);
				
				setTitle("ID Card | "+studname);
				JLabel lblFather = new JLabel("Father :");
				lblFather.setForeground(Color.BLACK);
				lblFather.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblFather.setBounds(119, 129, 57, 14);
				contentPane.add(lblFather);
				
				JLabel lblDob = new JLabel("D.O.B  :");
				lblDob.setForeground(Color.BLACK);
				lblDob.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblDob.setBounds(119, 152, 57, 14);
				contentPane.add(lblDob);
				
				 lblIdfather = new JLabel(fathername);
				lblIdfather.setForeground(Color.BLACK);
				lblIdfather.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblIdfather.setBounds(169, 129, 265, 14);
				contentPane.add(lblIdfather);
				
				JLabel lblClassRollNo = new JLabel("Class Roll No :");
				lblClassRollNo.setForeground(Color.BLACK);
				lblClassRollNo.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblClassRollNo.setBounds(266, 153, 91, 14);
				contentPane.add(lblClassRollNo);
				
				JLabel lblRegistrationNo = new JLabel("Registration No :");
				lblRegistrationNo.setIcon(null);
				lblRegistrationNo.setForeground(Color.WHITE);
				lblRegistrationNo.setBackground(Color.WHITE);
				lblRegistrationNo.setBounds(10, 200, 99, 24);
				contentPane.add(lblRegistrationNo);
				
				JLabel lblExamRollNo = new JLabel("Exam Roll No:");
				lblExamRollNo.setBackground(Color.WHITE);
				lblExamRollNo.setForeground(Color.WHITE);
				lblExamRollNo.setBounds(229, 205, 79, 14);
				contentPane.add(lblExamRollNo);
				
				JLabel lblBarcode = new JLabel("");
				lblBarcode.setIcon(new ImageIcon(IDcard.class.getResource("/img_src/barcode_mini.png")));
				lblBarcode.setBounds(64, 223, 313, 49);
				contentPane.add(lblBarcode);
				
				JLabel lblReligion = new JLabel("Religion :");
				lblReligion.setForeground(Color.BLACK);
				lblReligion.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblReligion.setBounds(266, 175, 74, 14);
				contentPane.add(lblReligion);
				
				JLabel lblCategory = new JLabel("Category :");
				lblCategory.setForeground(Color.BLACK);
				lblCategory.setFont(new Font("Tahoma", Font.BOLD, 12));
				lblCategory.setBounds(119, 175, 74, 14);
				contentPane.add(lblCategory);
				
				 lblIddob = new JLabel(dob);
				lblIddob.setForeground(Color.BLACK);
				lblIddob.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblIddob.setBounds(166, 152, 99, 14);
				contentPane.add(lblIddob);
				
				 lblIdcategory = new JLabel(category);
				lblIdcategory.setForeground(Color.BLACK);
				lblIdcategory.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblIdcategory.setBounds(186, 175, 79, 14);
				contentPane.add(lblIdcategory);
				
				 lblIdreligion = new JLabel(religion);
				lblIdreligion.setForeground(Color.BLACK);
				lblIdreligion.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblIdreligion.setBounds(329, 175, 64, 14);
				contentPane.add(lblIdreligion);
				
				 lblIdroll = new JLabel(classroll);
				lblIdroll.setForeground(Color.BLACK);
				lblIdroll.setFont(new Font("Tahoma", Font.BOLD, 11));
				lblIdroll.setBounds(357, 153, 64, 14);
				contentPane.add(lblIdroll);
				
				 lblIdregd = new JLabel(regno);
				lblIdregd.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblIdregd.setForeground(Color.WHITE);
				lblIdregd.setBounds(118, 200, 91, 24);
				contentPane.add(lblIdregd);
				
				 lblIdexmroll = new JLabel(exmno);
				 lblIdexmroll.setBackground(Color.WHITE);
				lblIdexmroll.setFont(new Font("Tahoma", Font.PLAIN, 12));
				lblIdexmroll.setForeground(Color.WHITE);
				lblIdexmroll.setBounds(316, 200, 118, 24);
				contentPane.add(lblIdexmroll);
				
				
				JLabel lblRegbgd = new JLabel("");
				lblRegbgd.setForeground(new Color(0, 100, 0));
				lblRegbgd.setBackground(new Color(0, 100, 0));
				lblRegbgd.setIcon(new ImageIcon(IDcard.class.getResource("/img_src/BlueScreen.png")));
				lblRegbgd.setBounds(5, 200, 435, 24);
				contentPane.add(lblRegbgd);
				
				
		
		
	}

}
