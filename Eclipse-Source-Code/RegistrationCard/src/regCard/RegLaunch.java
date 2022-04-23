package regCard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JTextField;

import java.awt.SystemColor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

import javax.swing.table.DefaultTableModel;


import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RegLaunch {

	private JFrame frame;
	private JTable table;
    static String Name,Mother,Father,Dob,dobDate,dobMonth,dobYear,Gender,Regno,Exmno,Classroll,Religion,Category,Batch,ImgSrc,AGE;
    private JTable table_1;
    static String selectedStr,honours,semester,stream;
    static String userHome,fpath,newfpath,Status,AECC,GE,AECCfpath,regDir;
    static JLabel lblaecc,lblge,lblHonours,lblStatus,lblImghere,lblhonours;
    static JButton btnIdCard,btnAdd,btnAddAecc,btnSearch;
    private JTextField txtSearch;
    static int totalFiles;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegLaunch window = new RegLaunch();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RegLaunch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 634, 445);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, "name_6094638350897");
		panel.setLayout(null);
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/logo.png")));
		lblLogo.setBounds(91, -12, 376, 85);
		panel.add(lblLogo);
		
		 userHome = System.getProperty("user.home");
		 fpath  = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
		 regDir = fpath + "\\Regno";
		File filepath = new File(regDir);
		String listFiles[] = filepath.list();
		 
		
		
		lblStatus = new JLabel("");
		lblStatus.setForeground(Color.RED);
		lblStatus.setBackground(Color.RED);
		lblStatus.setBounds(20, 88, 410, 20);
		panel.add(lblStatus);
		
		totalFiles = listFiles.length; 
		lblStatus.setText(" \t \t \t \t Total ( "+totalFiles + " )Students Data Found");
				
		JLabel lblProgramme = new JLabel("PROGRAMME    ");
		lblProgramme.setBounds(10, 15, 89, 27);
		panel.add(lblProgramme);
		lblProgramme.setVisible(false);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setForeground(Color.BLACK);
		separator_2.setBounds(10, 145, 457, 2);
		panel.add(separator_2);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{" REGISTRATION", "EXAM ROLL NO.", "CLASS ROLL NO.", "BATCH"},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.setBackground(SystemColor.control);
		table.setBounds(10, 145, 457, 32);
		panel.add(table);
		
		JLabel lblRegistrationCard = new JLabel("REGISTRATION CARD");
		lblRegistrationCard.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegistrationCard.setBounds(194, 64, 203, 20);
		panel.add(lblRegistrationCard);
		
	    lblhonours = new JLabel("Bachelor of Arts (Honours) in History");
		lblhonours.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblhonours.setBounds(49, 115, 427, 32);
		panel.add(lblhonours);
		
		//list.setVisible(false);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(SystemColor.desktop);
		separator.setBounds(-35, 115, 663, 2);
		panel.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setForeground(Color.BLACK);
		separator_1.setBounds(10, 283, 589, -3);
		panel.add(separator_1);
		
		JLabel lblElectiveSubjectOffered = new JLabel("Elective Subject Offered :");
		lblElectiveSubjectOffered.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblElectiveSubjectOffered.setBackground(SystemColor.desktop);
		lblElectiveSubjectOffered.setBounds(10, 291, 160, 14);
		panel.add(lblElectiveSubjectOffered);
		
		JLabel lblAecc = new JLabel("AECC");
		lblAecc.setBounds(10, 309, 46, 14);
		panel.add(lblAecc);
		
		JLabel lblGe = new JLabel("GE");
		lblGe.setBounds(10, 325, 46, 14);
		panel.add(lblGe);
		
		 lblaecc = new JLabel("");
		lblaecc.setBounds(107, 306, 171, 21);
		panel.add(lblaecc);
		
		 lblge = new JLabel("");
		lblge.setBounds(107, 325, 273, 22);
		panel.add(lblge);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setForeground(Color.BLACK);
		separator_3.setBounds(10, 303, 589, 2);
		panel.add(separator_3);
		
		JLabel lblBarcode = new JLabel("");
		lblBarcode.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/barcode_mini.png")));
		lblBarcode.setBounds(10, 350, 225, 32);
		panel.add(lblBarcode);
		
		JLabel lblDevelopedBySanjeev = new JLabel("Developed By ");
		lblDevelopedBySanjeev.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
		lblDevelopedBySanjeev.setBounds(0, 393, 68, 14);
		panel.add(lblDevelopedBySanjeev);
		
		JLabel lblControllerOfExamination = new JLabel("CONTROLLER OF EXAMINATION");
		lblControllerOfExamination.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblControllerOfExamination.setBounds(293, 393, 213, 14);
		panel.add(lblControllerOfExamination);
		
		JLabel lblPrincipal = new JLabel("PRINCIPAL");
		lblPrincipal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPrincipal.setBounds(516, 393, 83, 14);
		panel.add(lblPrincipal);
		
		JLabel lblImghere = new JLabel("Student Img ");
		lblImghere.setForeground(SystemColor.desktop);
		lblImghere.setBackground(SystemColor.textHighlight);
		lblImghere.setIcon(new ImageIcon(ImgSrc));
		lblImghere.setBounds(10, 180, 112, 100);
		panel.add(lblImghere);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setForeground(Color.BLACK);
		separator_4.setBounds(10, 120, 457, 2);
		panel.add(separator_4);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setForeground(Color.BLACK);
		separator_5.setBounds(10, 345, 589, 2);
		panel.add(separator_5);
		
		
		JList list_1 = new JList(listFiles);
		list_1.setBackground(SystemColor.control);
		list_1.setBounds(10, 53, 134, 20);
		panel.add(list_1);
		list_1.setVisible(false);
		
		JComboBox comboBox = new JComboBox(listFiles);
		comboBox.setBounds(477, 173, 131, 27);
		panel.add(comboBox);
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) 
			{
				int index = comboBox.getSelectedIndex();
				selectedStr = "16AHIS033717";
				 selectedStr = listFiles[index];
				//JOptionPane.showMessageDialog(null, selectedStr);
				 // ImgSrc=fpath + "\\Stud_img\\"+selectedStr;
				 // lblImghere.setIcon(new ImageIcon(ImgSrc));
				 newfpath = regDir + "\\"+selectedStr;
				//JOptionPane.showMessageDialog(null, newfpath);
			//	lblStatus.setText("Reading Student Info ("+(index+1) + "\\" + totalFiles + ")");
				try {
					lblStatus.setText("Reading Student Info ("+(index+1) + "\\" + totalFiles + ")");
					
					FileInputStream fstream = new FileInputStream(newfpath);
					DataInputStream dstream = new DataInputStream(fstream);
					BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
				    String Readme = br.readLine();
				    String spliter =  "%";
				    String splitMe[] = Readme.split(spliter);    
				    
				   // Mother=" ";
				   // Batch = "2016-2019";
				    //honours=splitMe[0];
					Regno=splitMe[1];
					Exmno=splitMe[2];
					Classroll=splitMe[3];
					Name=splitMe[4];
					Gender=splitMe[5];
					Dob=splitMe[6];
					Father=splitMe[7];
					Religion=splitMe[8];
					Category=splitMe[9];
					stream=splitMe[10];
					Batch=splitMe[11];
				    honours=splitMe[12];
				    semester=splitMe[13];
					ImgSrc=fpath + "\\Stud_img\\"+Exmno+".jpg";
					lblImghere.setIcon(new ImageIcon(ImgSrc));
				
					String listInfo[] = {"STUDENT'S NAME :" + Name,"\nFATHER'S NAME :" + Father,"\nRELIGION :" + Religion,"\nCATEGORY :" + Category,"\nDATE OF BIRTH :" + Dob +"\t \t \t \t\t\t \t \t"+"GENDER :" + Gender};
					
					lblhonours.setText(stream + " (Honours) in "+ honours);
					
					
					table.setModel(new DefaultTableModel(
							new Object[][] {
								{" REGISTRATION", "EXAM ROLL NO.", "CLASS ROLL NO.", "BATCH"},
								{Regno ,  Exmno , Classroll , Batch},
							},
							new String[] {
								"New column", "New column", "New column", "New column"
							}
						));
					
					Calendar cal = Calendar.getInstance();
					//   Getting the Current year 
					String space = " ";
					String removeSpace[] = Dob.split(space);
					dobYear = removeSpace[2];
				    int  birthYear = Integer.parseInt(dobYear);
					int YearNow = cal.get(Calendar.YEAR);
					
					
					int PastYear = Integer.parseInt(dobYear);
					int AGE = (YearNow - PastYear);
					
					table_1.setModel(new DefaultTableModel(
							new Object[][] {
								{"STUDENT'S NAME  :", Name},
								{" FATHER'S NAME  :", Father},
								{"RELIGION        :", Religion},
								{"CATEGORY        :", Category},
								{"DATE OF BIRTH   :", Dob},
								{"GENDER          :", Gender},
								{"AGE             :", AGE }
							},
							new String[] {
								"New column", "New column"
							}
						));
					
					
					AECCfpath = fpath + "\\AECC\\"+Exmno +".txt";
				///	JOptionPane.showMessageDialog(null, "AECCPATH "+AECCfpath);
					
					try {
						FileInputStream fstream2 = new FileInputStream(AECCfpath);
                        DataInputStream dstream2 = new DataInputStream(fstream2);
                        BufferedReader br2 = new BufferedReader(new InputStreamReader(dstream2));
                        String aecc= br2.readLine();
                        String splitme = "%";
                        String splittedtxt[] = aecc.split(splitme);
                        
                        AECC = splittedtxt[1];
                        GE = splittedtxt[2];
                        lblaecc.setText(AECC);
    					lblge.setText(GE);
    					//lblStatus.setText("");
    					btnAddAecc.setVisible(false);
    					
					} catch (Exception e) {
						lblStatus.setText("Exam Roll No: "+ Exmno + ". AECC Paper not Added! Please Add");
						btnAddAecc.setVisible(true);
						e.printStackTrace();
					}
					
					
				    
				} catch (FileNotFoundException e) {
					
					e.printStackTrace();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}});
		
		
		JLabel lblSelectRegistrationNo = new JLabel("Select Registration No");
		lblSelectRegistrationNo.setBounds(477, 145, 131, 32);
		panel.add(lblSelectRegistrationNo);
		String listInfo[] = {"STUDENT'S NAME :" + Name,"\nFATHER'S NAME :" + Father,"\nRELIGION :" + Religion,"\nCATEGORY :" + Category,"\nDATE OF BIRTH :" + Dob +"\t \t \t \t\t\t \t \t"+"GENDER :" + Gender};
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
				{"STUDENT'S NAME :", null},
				{" FATHER'S NAME  : ", null},
				{"RELIGION             : ", null},
				{"CATEGORY          :   ", null},
				{"DATE OF BIRTH  :      ", null},
				{"GENDER              :  ", null},
				{"AGE              :  ", null},
				
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(103);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(208);
		table_1.setBackground(SystemColor.control);
		table_1.setBounds(123, 179, 344, 118);
		panel.add(table_1);
		
		 btnIdCard = new JButton("ID");
		 btnIdCard.setToolTipText("Open ID Card ");
		btnIdCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				
				//frame.dispose();
				IDcard id;
				id = new IDcard();
				id.setVisible(true);
				//FileReader();
			    
			}
		});
		btnIdCard.setBounds(477, 120, 45, 35);
		panel.add(btnIdCard);
		
		btnAddAecc = new JButton("add");
		btnAddAecc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				AECC aecc = new AECC();
				aecc.setVisible(true);
			}
		});
		btnAddAecc.setBounds(426, 84, 62, 25);
		panel.add(btnAddAecc);
		btnAddAecc.setVisible(false);
		
		JLabel lblMe = new JLabel("sanjeev stephan murmu");
		lblMe.setFont(new Font("Old English Text MT", Font.PLAIN, 20));
		lblMe.setBounds(75, 384, 203, 24);
		panel.add(lblMe);
		
		JLabel lblAlSinha = new JLabel("a.k sinha");
		lblAlSinha.setFont(new Font("Old English Text MT", Font.PLAIN, 22));
		lblAlSinha.setBounds(351, 354, 116, 35);
		panel.add(lblAlSinha);
		
		JLabel lblNicholasTete = new JLabel("nicholas tete");
		lblNicholasTete.setFont(new Font("Old English Text MT", Font.PLAIN, 22));
		lblNicholasTete.setBounds(498, 350, 110, 43);
		panel.add(lblNicholasTete);
		
		JButton btnAddstud = new JButton("");
		btnAddstud.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AddStudent add = new AddStudent();
				add.setVisible(true);
				
			}
		});
		btnAddstud.setToolTipText("Add New Student");
		btnAddstud.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/ic_menu_invite_4.png")));
		btnAddstud.setBounds(528, 120, 45, 35);
		panel.add(btnAddstud);
		
		btnAdd = new JButton("");
		 btnAdd.setToolTipText("Add Your AECC Paper");
		 btnAdd.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/ic_menu_compose_3.png")));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//AECC aecc = new AECC();
				//aecc.setVisible(true);
			//	EditStudent edit = new EditStudent();
				//edit.setVisible(true);
				
				StudentListEditor editor = new StudentListEditor();
				editor.setVisible(true);
			}
		});
		btnAdd.setBounds(580, 120, 45, 35);
		panel.add(btnAdd);
		
		txtSearch = new JTextField();
		txtSearch.setForeground(SystemColor.textHighlight);
		txtSearch.setBackground(SystemColor.control);
		txtSearch.setBounds(498, 82, 89, 25);
		panel.add(txtSearch);
		txtSearch.setColumns(10);
		txtSearch.setVisible(false);
		
		btnSearch = new JButton("");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			selectedStr = txtSearch.getText();
			//FileReader();
			
				
			}
		});
		btnSearch.setIcon(new ImageIcon("D:\\old\\IconArch\\Android_Icons\\ic_menu_search_1.png"));
		btnSearch.setBounds(588, 82, 28, 27);
		panel.add(btnSearch);
		btnSearch.setVisible(false);
		
		
		JButton btnBackup = new JButton("BACKUP");
		btnBackup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BackupData backup = new BackupData();
				backup.BackupData();
				lblStatus.setText(backup.Status);
			}
		});
		btnBackup.setBounds(475, 18, 116, 23);
		panel.add(btnBackup);
		
		JButton btnRestore = new JButton("RESTORE");
		btnRestore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				RestoreData restore = new RestoreData();
				restore.RestoreData();
			}
		});
		btnRestore.setBounds(475, 52, 116, 23);
		panel.add(btnRestore);
		
		JButton btnStudentListEditor = new JButton("Student List Editor");
		btnStudentListEditor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				StudentListEditor editor = new StudentListEditor();
				editor.setVisible(true);
			}
		});
		btnStudentListEditor.setBounds(438, 305, 121, 23);
		panel.add(btnStudentListEditor);
		btnStudentListEditor.setVisible(false);
	}
}
