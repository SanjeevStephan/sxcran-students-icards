package regCard;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JSeparator;

public class StudentListEditor extends JFrame {

//	private JPanel contentPane;

	static String studname,fathername,gender,regno,exmno,classroll,dob,category,religion;
	static String loginExm,loginroll,LoginPswd,askUser,Batch,Imgsrc,spliter;
	private static JTextField txtfather;
	private JTextField txtLoginexmroll;
	private JTextField txtLoginroll;
	static String userHome,fpath,exmfPath,sxcfPath,aecc,AeccPath,regDir,filePath,
	date,month,year,honours,semester,stream;
	static JPanel contentPane,LoginPanel;
	static int  indate,inmonth,inyear,inhonours,insemester;
	private JLabel lblErrorStud,lblErReg,lblErexm,lblErcls,lblErhonours,lblErsemister,lblErgender,lblErdob,lblErcategory,lblErreligion;
	static JTextField txtCategory, txtReligion,txtGender,txtAecc,txtStream,txtHonours,txtSemester,
	txtDob,txtRollno,txtExmno,txtRegno,txtStudname;
	static JLabel lblImghere;
	private JSeparator separator_2;
	private JLabel lblBlubgd;
	private JTextField txtBatch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentListEditor frame = new StudentListEditor();
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
	public StudentListEditor() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 498, 587);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		userHome = System.getProperty("user.home");
		fpath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
		regDir = fpath + "\\Regno";
		

		File file = new File(regDir);
		String listfiles[] = file.list(); 
		
		JPanel contentpane = new JPanel();
		contentPane.add(contentpane, "name_10579933049230");
		contentpane.setLayout(null);

		JLabel lblRegistrationNo = new JLabel("Registration No :");
		lblRegistrationNo.setBounds(144, 131, 141, 31);
		contentpane.add(lblRegistrationNo);
		
		JLabel lblExamRollNo = new JLabel("Exam Roll No :");
		lblExamRollNo.setBounds(144, 173, 111, 19);
		contentpane.add(lblExamRollNo);
		
		JLabel lblClassRollNo = new JLabel("Class Roll No :");
		lblClassRollNo.setBounds(144, 204, 111, 19);
		contentpane.add(lblClassRollNo);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setBounds(148, 339, 111, 19);
		contentpane.add(lblCategory);
		
		JLabel lblStudentName = new JLabel("Student Name :");
		lblStudentName.setBounds(144, 101, 141, 19);
		contentpane.add(lblStudentName);
		
		JLabel lbldob = new JLabel("Date Of Birth");
		lbldob.setBounds(148, 308, 89, 19);
		contentpane.add(lbldob);
		
		JLabel lblReligion = new JLabel("Religion :");
		lblReligion.setBounds(148, 369, 69, 19);
		contentpane.add(lblReligion);
		
		JComboBox comboBox = new JComboBox(listfiles);
		comboBox.setBounds(10, 223, 124, 19);
		contentpane.add(comboBox);
		comboBox.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
			int index = comboBox.getSelectedIndex();
			String cobra = (String) comboBox.getSelectedItem();
		//	JOptionPane.showMessageDialog(null, "index :"+index + " cobra :" + cobra);	
			
			 filePath = regDir + "\\"+cobra;
		//	JOptionPane.showMessageDialog(null, "index :"+index + " filePath :" + filePath);	
			FileReader();
			
			}});
	
		txtStudname = new JTextField(studname);
		txtStudname.setBounds(252, 100, 203, 20);
		contentpane.add(txtStudname);
		txtStudname.setColumns(10);
	
		txtRegno = new JTextField(regno);
		txtRegno.setColumns(10);
		txtRegno.setBounds(252, 136, 203, 20);
		contentpane.add(txtRegno);
				
		txtExmno = new JTextField(exmno);
		txtExmno.setColumns(10);
		txtExmno.setBounds(252, 172, 203, 20);
		contentpane.add(txtExmno);
		
		txtRollno = new JTextField(classroll);
		txtRollno.setColumns(10);
		txtRollno.setBounds(252, 203, 203, 20);
		contentpane.add(txtRollno);
		
		txtDob = new JTextField(dob);
		txtDob.setColumns(10);
		txtDob.setBounds(256, 307, 89, 20);
		contentpane.add(txtDob);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setToolTipText("Save the File:Stephenware/sxc_student_iCards");
		btnSave.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/Save16.png")));
		btnSave.addActionListener(new ActionListener() {
	    		
			public void actionPerformed(ActionEvent arg0) 
			{
				AECC addAecc = new AECC();
              
				
				studname=txtStudname.getText();
				fathername=txtfather.getText();
				regno=txtRegno.getText();
				exmno=txtExmno.getText();
				classroll=txtRollno.getText();
				gender=txtGender.getText();
				dob=txtDob.getText();
				religion=txtReligion.getText();
				category=txtCategory.getText();
				stream=txtStream.getText();
				honours=txtHonours.getText();
				semester=txtSemester.getText();
				aecc=txtAecc.getText();
				//dob = date +" " + month+" " + year;
				//JOptionPane.showMessageDialog(null, "category "+category);
				 
				    studname = studname.toUpperCase();
		        	fathername = fathername.toUpperCase();
		        	regno = regno.toUpperCase();
		        	exmno = exmno.toUpperCase();
		        	dob = dob.toUpperCase();
		        	gender=gender.toUpperCase();
		        	religion=religion.toUpperCase();
		            category=category.toUpperCase();
				//    honours=honours.toUpperCase();
				 //   semester = semester.toUpperCase();
		/*	
				 	String str="StudentListEditor Details" +"\nName :\t"+ studname
                            +"\nRegistration No :\t"+regno
	                        +"\nExam Roll No :\t"+exmno
                            +"\nClass Roll no :\t"+classroll
                            +"\nFather Name:\t"+fathername
                            +"\nGender :\t"+gender
                            +"\nDate Of Birth :\t"+dob
                            +"\nReligion :\t"+religion
                            +"\nCategory :\t"+category
                            +"\nStream :\t"+stream
                            +"\nHonours : \t"+honours
                            +"\nSemister  :\t "+semester
                            +"\nAECC Paper :\t "+aecc;
                            
                          
                            JOptionPane.showMessageDialog(null, str);
  */          
		            dispose();
                     SaveListEditor save = new SaveListEditor();
                     save.SaveEdit();
                     
                //     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             		
             		//setBounds(100, 100, 498, 498);
				}
				//WriteFiles write = new WriteFiles();
				//write.WriteFiles();
			}
		);
		btnSave.setBounds(10, 514, 99, 23);
		contentpane.add(btnSave);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(148, 274, 89, 14);
		contentpane.add(lblGender);
		
		JLabel label = new JLabel("Father's Name :");
		label.setBounds(144, 235, 111, 19);
		contentpane.add(label);
		
		txtfather = new JTextField(fathername);
		txtfather.setColumns(10);
		txtfather.setBounds(252, 234, 203, 20);
		contentpane.add(txtfather);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			    txtStudname.setText(null);
				txtfather.setText(null);
				txtGender.setText(null);
				txtRegno.setText(null);
				txtExmno.setText(null);
				txtRollno.setText(null);
				txtDob.setText(null);
				txtCategory.setText(null);
				txtReligion.setText(null);
			    txtAecc.setText(null);
			    txtStream.setText(null);
			    txtHonours.setText(null);
		     	txtAecc.setText(null);
			}
		});
		btnNew.setBounds(10, 486, 99, 23);
		contentpane.add(btnNew);
		
		JButton btnBackToLog = new JButton("Home");
		btnBackToLog.setToolTipText("Go Back To Log In Page ");
		btnBackToLog.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/Home16.png")));
		btnBackToLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//EditPanel.setVisible(false);
				//LoginPanel.setVisible(true);	
				//AECC aecc = new AECC();
				//aecc.setVisible(true);
			// frame.dispose();	
				
			}
		});
		btnBackToLog.setBounds(10, 459, 99, 23);
		contentpane.add(btnBackToLog);
		
		String aryReligion[]= {"Please Select Here","CHRISTIAN","SARNA","HINDU","ISLAM","MUSLIM","NA"};
			
		String aryCategory[] = {"Select Any Category","ST","SC","BC-I","BC-II","GENERAL","NA"};
		
		String aryMonth[] = {"Month","JANUARY","FEBRURAY","MARCH","APRIL","MAY",
				              "JUNE","JULY","AUGUST","SEPTEMBER",
		                      "OCTOBER","NOVEMBER","DECEMBER"};
	
     	String aryYear[] = {"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
     			            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
     			            "2011","2012","2013","2014","2015","2016"};
		
     	
     	String separator = " ";
   //  	String yoSeparator[] = dob.split(separator);
     //	String dobyear = yoSeparator[2];
     //	int Year = Integer.parseInt(dobyear);
     	
     //	JOptionPane.showMessageDialog(null, dobyear);
			
		String aryDate[] = {"Date","1","2","3","4","5","6","7","8","9","10",
				           "11","12","13","14","15","16","17","18","19","20",
				           "21","22","23","24","25","26","27","28","29","30","31"};
		
		String aryDept[] = {"Select Honours","History","PoliticalSc","Hindi","Geography","Economics",
	            "Physics","Chemistry","Mathematics","Zoology","Botony","Geology",
	            "ComputerSc","Animation","BBA","Accounts"};
		
		
		String arySemister[] = {"Select Semester","Semester-I","Semester-II","Semester-III","Semester-IV","Semester-V","Semester-VI"};
	
		
		
		lblErrorStud = new JLabel("");
		lblErrorStud.setIcon(new ImageIcon("D:\\old\\IconArch\\Android_Icons\\warng.png"));
		lblErrorStud.setBounds(455, 0, 22, 23);
		contentpane.add(lblErrorStud);
		lblErrorStud.setVisible(false);
		
		lblErReg = new JLabel("");
		lblErReg.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErReg.setBounds(455, 36, 22, 23);
		contentpane.add(lblErReg);
		lblErReg.setVisible(false);
		
		lblErexm = new JLabel("");
		lblErexm.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErexm.setBounds(455, 78, 22, 23);
		contentpane.add(lblErexm);
		lblErexm.setVisible(false);
		
		lblErcls = new JLabel("");
		lblErcls.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcls.setBounds(455, 109, 22, 23);
		contentpane.add(lblErcls);
		lblErcls.setVisible(false);
		
		lblErhonours = new JLabel("");
		lblErhonours.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErhonours.setBounds(451, 202, 22, 23);
		contentpane.add(lblErhonours);
		lblErhonours.setVisible(false);
		
		lblErsemister = new JLabel("");
		lblErsemister.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErsemister.setBounds(455, 171, 22, 23);
		contentpane.add(lblErsemister);
		lblErsemister.setVisible(false);
		
		lblErgender = new JLabel("");
		lblErgender.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErgender.setBounds(416, 274, 22, 23);
		contentpane.add(lblErgender);
		lblErgender.setVisible(false);
		
		lblErdob = new JLabel("");
		lblErdob.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErdob.setBounds(357, 340, 22, 23);
		contentpane.add(lblErdob);
		lblErdob.setVisible(false);
		
		lblErcategory = new JLabel("");
		lblErcategory.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcategory.setBounds(451, 349, 22, 23);
		contentpane.add(lblErcategory);
		lblErcategory.setVisible(false);
		
		lblErreligion = new JLabel("");
		lblErreligion.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErreligion.setBounds(451, 438, 22, 23);
		contentpane.add(lblErreligion);
		
		txtCategory = new JTextField(category);
		txtCategory.setColumns(10);
		txtCategory.setBounds(256, 338, 203, 20);
		contentpane.add(txtCategory);
		
		txtReligion = new JTextField(religion);
		txtReligion.setColumns(10);
		txtReligion.setBounds(256, 369, 203, 20);
		contentpane.add(txtReligion);
		
		txtGender = new JTextField(gender);
		txtGender.setColumns(10);
		txtGender.setBounds(256, 271, 143, 20);
		contentpane.add(txtGender);
		
		JLabel lblAeccPaper = new JLabel("AECC Paper :");
		lblAeccPaper.setBounds(144, 520, 99, 14);
		contentpane.add(lblAeccPaper);
		
		txtAecc = new JTextField(aecc);
		txtAecc.setBounds(252, 517, 203, 20);
		contentpane.add(txtAecc);
		txtAecc.setColumns(10);
		
		JLabel lblStream = new JLabel("Stream    :");
		lblStream.setBounds(144, 399, 99, 14);
		contentpane.add(lblStream);
		
		txtStream = new JTextField("");
		txtStream.setColumns(10);
		txtStream.setBounds(252, 396, 203, 20);
		contentpane.add(txtStream);
		
		JLabel lblHonours = new JLabel("Honours     :");
		lblHonours.setBounds(144, 450, 99, 14);
		contentpane.add(lblHonours);
		
		txtHonours = new JTextField((String) null);
		txtHonours.setColumns(10);
		txtHonours.setBounds(252, 447, 203, 20);
		contentpane.add(txtHonours);
		
		JLabel lblSemester = new JLabel("Semester    :");
		lblSemester.setBounds(144, 478, 99, 14);
		contentpane.add(lblSemester);
		
		txtSemester = new JTextField((String) null);
		txtSemester.setColumns(10);
		txtSemester.setBounds(252, 475, 203, 20);
		contentpane.add(txtSemester);
		
		
		 lblImghere = new JLabel("");
		lblImghere.setIcon(new ImageIcon("D:\\Programwares\\Eclipse\\MyJars\\iCARDBACKUP\\Stud_img\\16AHIS033717.jpg"));
		lblImghere.setBounds(19, 95, 101, 98);
		contentpane.add(lblImghere);
		
		JLabel lblSelectRegistrationNo = new JLabel("Select Registration No");
		lblSelectRegistrationNo.setBounds(10, 206, 129, 14);
		contentpane.add(lblSelectRegistrationNo);
		
		JLabel lblSxcranbg = new JLabel("");
		lblSxcranbg.setIcon(new ImageIcon(StudentListEditor.class.getResource("/img_src/logo.png")));
		lblSxcranbg.setBounds(36, 0, 462, 90);
		contentpane.add(lblSxcranbg);
		
		JLabel lblDevelopedBy = new JLabel("Developed by");
		lblDevelopedBy.setFont(new Font("Orator Std", Font.PLAIN, 11));
		lblDevelopedBy.setBounds(10, 399, 124, 14);
		contentpane.add(lblDevelopedBy);
		
		JLabel lblSanjeevStephanMurmu = new JLabel("Sanjeev Stephan Murmu");
		lblSanjeevStephanMurmu.setFont(new Font("Pristina", Font.PLAIN, 19));
		lblSanjeevStephanMurmu.setBounds(0, 410, 159, 38);
		contentpane.add(lblSanjeevStephanMurmu);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 446, 124, 2);
		contentpane.add(separator_1);
		
		separator_2 = new JSeparator();
		separator_2.setBounds(10, 396, 115, 2);
		contentpane.add(separator_2);
		
		lblBlubgd = new JLabel("blubgd");
		lblBlubgd.setIcon(new ImageIcon(StudentListEditor.class.getResource("/img_src/BlueScreen.png")));
		lblBlubgd.setBounds(10, 94, 117, 98);
		contentpane.add(lblBlubgd);
		
		txtBatch = new JTextField("");
		txtBatch.setColumns(10);
		txtBatch.setBounds(252, 424, 203, 20);
		contentpane.add(txtBatch);
		
		JLabel lblBatch = new JLabel("Batch :");
		lblBatch.setBounds(156, 425, 61, 14);
		contentpane.add(lblBatch);
		lblErreligion.setVisible(false);
		// String2Switch();
	}
	public static void FileReader()
	{
		try {
			FileInputStream fstream = new FileInputStream(filePath);
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
			String strline = br.readLine();
			
			 spliter = "%";
			String split[] = strline.split(spliter);
			
			  Batch = "2016-2019";
			    //honours=splitMe[0];
				regno=split[1];
				exmno=split[2];
				classroll=split[3];
				studname=split[4];
				gender=split[5];
				dob=split[6];
				fathername=split[7];
				religion=split[8];
				category=split[9];
				stream=split[10];
			    honours=split[11];
			    semester=split[12];
				Imgsrc=fpath + "\\Stud_img\\"+exmno+".jpg";
				lblImghere.setIcon(new ImageIcon(Imgsrc));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Incorrect Array Order !","Unable to Parse ARRAY",JOptionPane.ERROR_MESSAGE);
			e.printStackTrace();
		}
		AECC();
		
		  txtStudname.setText(studname);
			txtfather.setText(fathername);
			txtGender.setText(gender);
			txtRegno.setText(regno);
			txtExmno.setText(exmno);
			txtRollno.setText(classroll);
			txtDob.setText(dob);
			txtCategory.setText(category);
			txtReligion.setText(religion);
		    txtStream.setText(stream);
		    txtHonours.setText(honours);
			txtSemester.setText(semester);
			txtAecc.setText(aecc);
	}
	public static void AECC()
	{
		AeccPath = fpath + "\\AECC\\"+exmno + ".txt";
		
		try {
			FileInputStream fstream = new FileInputStream(AeccPath);
			DataInputStream dstream = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(dstream));
			String aeccstr = br.readLine();
			
			String splitIt[] = aeccstr.split(spliter);
			aecc = splitIt[1];
			//JOptionPane.showMessageDialog(null, aecc);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
}
