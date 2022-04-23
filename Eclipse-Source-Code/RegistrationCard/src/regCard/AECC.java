package regCard;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
public class AECC extends JFrame {

	private JPanel contentPane;
	static String userHome,fpath,AECC,AECCpath,AECCfpath,GE,exmno;
    JRadioButton rdbtnHindi,rdbtnEnglish;
    JLabel lblimg;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AECC frame = new AECC();
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
	public AECC() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 267, 370);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		userHome = System.getProperty("user.home");
        fpath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
		AECCpath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards"+ "\\AECC";
		File file = new File(fpath);
		String ListFiles[] = file.list();
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.control);
		contentPane.add(panel, "name_30744392847192");
		panel.setLayout(null);
		
		JLabel lblAeccSubject = new JLabel("(Ablity Enhancement Compulsory Core Paper )");
		lblAeccSubject.setBounds(10, 207, 274, 31);
		panel.add(lblAeccSubject);
		
		JLabel lblGenericElectivePaper = new JLabel("(Generic Elective Paper)");
		lblGenericElectivePaper.setBounds(30, 273, 217, 14);
		panel.add(lblGenericElectivePaper);
		
		JLabel lblPleaseSelectYour = new JLabel("Please Select Your AECC Paper");
		lblPleaseSelectYour.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPleaseSelectYour.setBounds(3, 0, 244, 31);
		panel.add(lblPleaseSelectYour);
		
		
		
		JComboBox comboBox = new JComboBox(ListFiles);
		comboBox.setBounds(10, 137, 139, 31);
		panel.add(comboBox);
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				
				String imgsrc;
				int index = comboBox.getSelectedIndex();
				String selectedfile = ListFiles[index];
				AECCfpath = AECCpath + "\\"+selectedfile;
				String exmfpath = fpath + "\\"+selectedfile ;
				//JOptionPane.showMessageDialog(null, exmfpath);
				try {
					FileInputStream fstream = new FileInputStream(exmfpath);
					DataInputStream dstream = new DataInputStream(fstream);
					BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
		            String strline = br.readLine();
		            String split = "%";
		            String septxt[] = strline.split(split);
				    exmno = septxt[2];
				  //  JOptionPane.showMessageDialog(null, exmno);
				    imgsrc = fpath + "\\Stud_img\\"+exmno+".jpg";
					//JOptionPane.showMessageDialog(null, imgsrc);
					lblimg.setIcon(new ImageIcon(imgsrc));
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//JOptionPane.showMessageDialog(null, AECCfpath);
				
				
			}});
		
		JLabel lblAecc = new JLabel("AECC");
		lblAecc.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAecc.setBounds(30, 182, 44, 31);
		panel.add(lblAecc);
		
		JLabel lblGe = new JLabel("GE");
		lblGe.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblGe.setBounds(30, 243, 39, 31);
		panel.add(lblGe);
		
		 rdbtnEnglish = new JRadioButton("English");
		rdbtnEnglish.setBounds(85, 188, 83, 23);
		panel.add(rdbtnEnglish);
		rdbtnEnglish.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				rdbtnEnglish.setSelected(true);
				rdbtnHindi.setSelected(false);
				AECC = "English";
			}});
		
		
		 rdbtnHindi = new JRadioButton("Hindi");
		rdbtnHindi.setBounds(170, 188, 77, 23);
		panel.add(rdbtnHindi);
		rdbtnHindi.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				AECC = "Hindi";
				rdbtnHindi.setSelected(true);
				rdbtnEnglish.setSelected(false);
			}});
		
		JRadioButton rdbtnEnvironmentalIssueIn = new JRadioButton("Environmental Issue in India");
		rdbtnEnvironmentalIssueIn.setBounds(63, 243, 201, 23);
		panel.add(rdbtnEnvironmentalIssueIn);
		rdbtnEnvironmentalIssueIn.setSelected(true);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//JOptionPane.showMessageDialog(null, AECCfpath);
				GE = "Environmental Issue In India";
				try {
					FileWriter fstream = new FileWriter(AECCfpath);
					BufferedWriter bw = new BufferedWriter(fstream);
		            bw.write("%"+AECC+"%"+GE);
		            bw.close();
		            
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});
		btnSave.setBounds(151, 137, 97, 31);
		panel.add(btnSave);
		
		lblimg = new JLabel("");
		//lblimg.setIcon(new ImageIcon("C:\\Users\\Stephan\\Documents\\Stephenware\\sxc_student_iCards\\Stud_img\\16AHIS031444.jpg"));
		lblimg.setBounds(44, 24, 105, 108);
		panel.add(lblimg);
		
		userHome = System.getProperty("user.home");
		fpath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards\\";
		AECCpath = fpath + "\\AECC";
		boolean mkDir = (new File(AECCpath)).mkdirs();
		
		
		
	}

}
