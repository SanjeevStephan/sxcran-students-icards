package regCard;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;

public class AddStudent extends JFrame {

	private JPanel contentPane;
	private JTextField txtStudname,txtRegno,txtExmno,txtRollno,txtDob;
	static String studname,fathername,gender,regno,exmno,classroll,dob,category,religion,stream;
	static String loginExm,loginroll,LoginPswd,askUser,Batch,BatchFrom,BatchTo;
	private JTextField txtfather,txtLoginexmroll,txtLoginroll;
	static String userHome,fpath,exmfPath,sxcfPath;
	private JRadioButton rdbtnMale,rdbtnFemale;
	private JComboBox comboCategory,comboReligion,comboDate,comboMonth,comboYear,comboHonours,comboSemester,comboStream,
	comboBatchFrom,comboBatchTo;
	static JPanel AddPanel,LoginPanel;
	static String date,month,year,honours,semester;
	private JLabel lblErrorStud;
	private JLabel lblErReg;
	private JLabel lblErexm;
	private JLabel lblErcls;
	private JLabel lblErhonours;
	private JLabel lblErsemister;
	private JLabel lblErgender;
	private JLabel lblErdob;
	private JLabel lblErcategory;
	private JLabel lblErreligion;
	private JLabel lblBatch;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent frame = new AddStudent();
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
	public AddStudent() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 419, 595);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel AddPanel = new JPanel();
		contentPane.add(AddPanel, "name_10046127391736");
		AddPanel.setLayout(null);
		
		userHome = System.getProperty("user.home");
		fpath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
		
		JLabel lblRegistrationNo = new JLabel("Registration No :");
		lblRegistrationNo.setBounds(40, 118, 141, 31);
		AddPanel.add(lblRegistrationNo);
		
		JLabel lblExamRollNo = new JLabel("Exam Roll No :");
		lblExamRollNo.setBounds(40, 160, 111, 19);
		AddPanel.add(lblExamRollNo);
		
		JLabel lblClassRollNo = new JLabel("Class Roll No :");
		lblClassRollNo.setBounds(40, 191, 111, 19);
		AddPanel.add(lblClassRollNo);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setBounds(42, 428, 111, 19);
		AddPanel.add(lblCategory);
		
		JLabel lblStudentName = new JLabel("Student Name :");
		lblStudentName.setBounds(40, 88, 141, 19);
		AddPanel.add(lblStudentName);
		
		JLabel lbldob = new JLabel("Date Of Birth");
		lbldob.setBounds(42, 387, 89, 19);
		AddPanel.add(lbldob);
		
		JLabel lblReligion = new JLabel("Religion :");
		lblReligion.setBounds(42, 468, 69, 19);
		AddPanel.add(lblReligion);
		
		txtStudname = new JTextField();
		txtStudname.setBounds(148, 87, 203, 20);
		AddPanel.add(txtStudname);
		txtStudname.setColumns(10);
	
		txtRegno = new JTextField();
		txtRegno.setColumns(10);
		txtRegno.setBounds(148, 123, 203, 20);
		AddPanel.add(txtRegno);
		txtRegno.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String stud= txtStudname.getSelectedText();
				if(stud.length()==0)
				{
					//lblErrorStud.setVisible(true);
					JOptionPane.showMessageDialog(null, "Student name is empty");
				}
				else {JOptionPane.showMessageDialog(null, "Student name is empty");}
			}});
		
		txtExmno = new JTextField();
		txtExmno.setColumns(10);
		txtExmno.setBounds(148, 159, 203, 20);
		AddPanel.add(txtExmno);
		
		txtRollno = new JTextField();
		txtRollno.setColumns(10);
		txtRollno.setBounds(148, 190, 203, 20);
		AddPanel.add(txtRollno);
		
		txtDob = new JTextField();
		txtDob.setColumns(10);
		txtDob.setBounds(312, 345, 33, 20);
		AddPanel.add(txtDob);
		txtDob.setVisible(false);
		
		JButton btnSave = new JButton("SAVE");
		btnSave.setToolTipText("Save the File:Stephenware/sxc_student_iCards");
		btnSave.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/Save16.png")));
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				AECC addAecc = new AECC();
              
				
				studname=txtStudname.getText();
				fathername=txtfather.getText();
			//	gender=txtGender.getText();
				regno=txtRegno.getText();
				exmno=txtExmno.getText();
				classroll=txtRollno.getText();
				//dob=txtDob.getText();
				date = (String) comboDate.getSelectedItem();
				month = (String) comboMonth.getSelectedItem();
				year = (String) comboYear.getSelectedItem();
				honours = (String) comboHonours.getSelectedItem();
				semester = (String) comboSemester.getSelectedItem();
				Batch = BatchFrom + "-" + BatchTo;
				dob = date +" " + month+" " + year;
				//religion=txtReligion.getText();
					 
					//JOptionPane.showMessageDialog(null, "category "+category);
				 
			//	checkbox2();
			//	checkbox2();
				//checkboxOk();
				 studname = studname.toUpperCase();
		        	fathername = fathername.toUpperCase();
		        	regno = regno.toUpperCase();
		        	exmno = exmno.toUpperCase();
		        	dob = dob.toUpperCase();
				  //  honours=honours.toUpperCase();
				    semester = semester.toUpperCase();
			/*
				 	String str="Check Your Details" +"\nName :\t"+ studname
                            +"\nRegistration No :\t"+regno
	                        +"\nExam Roll No :\t"+exmno
                            +"\nClass Roll no :\t"+classroll
                            +"\nHonours : \t"+honours
                            +"\nSemister  :\t "+semester
                            +"\nDate Of Birth :\t"+dob
                            +"\nFather Name:\t"+fathername
                            +"\nGender :\t"+gender
                            +"\nReligion :\t"+religion
                            +"\nCategory :\t"+category;
                            JOptionPane.showMessageDialog(null, str);
  */
                     WriteFiles write = new WriteFiles();
                     write.WriteFiles();
		        	
				}
				//WriteFiles write = new WriteFiles();
				//write.WriteFiles();
			}
		);
		btnSave.setBounds(252, 504, 99, 23);
		AddPanel.add(btnSave);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/logo.png")));
		//lblLogo.setIcon(new ImageIcon(Launch.class.getResource("/studExmroll/img_src/logo.png")));
		lblLogo.setBounds(10, 0, 460, 85);
		AddPanel.add(lblLogo);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(42, 348, 89, 14);
		AddPanel.add(lblGender);
		
		JLabel label = new JLabel("Father's Name :");
		label.setBounds(42, 318, 111, 19);
		AddPanel.add(label);
		
		txtfather = new JTextField();
		txtfather.setColumns(10);
		txtfather.setBounds(150, 317, 203, 20);
		AddPanel.add(txtfather);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			     txtStudname.setText(null);
				txtfather.setText(null);
				//txtGender.setText(null);
				rdbtnMale.setSelected(false);
				rdbtnFemale.setSelected(false);
				txtRegno.setText(null);
				txtExmno.setText(null);
				txtRollno.setText(null);
				txtDob.setText(null);
				comboCategory.setSelectedIndex(0);
				comboReligion.setSelectedIndex(0);
				comboDate.setSelectedIndex(0);
				comboMonth.setSelectedIndex(0);
				comboYear.setSelectedIndex(0);
			    comboHonours.setSelectedIndex(0);
			    comboSemester.setSelectedIndex(0);
				
				//comboCategory
			//	txtCategory.setText(null);
				//txtReligion.setText(null);
				
			}
		});
		btnNew.setBounds(157, 504, 89, 23);
		AddPanel.add(btnNew);
		
		JButton btnBackToLog = new JButton("Log In");
		btnBackToLog.setToolTipText("Go Back To Log In Page ");
		btnBackToLog.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/Home16.png")));
		btnBackToLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				AddPanel.setVisible(false);
				LoginPanel.setVisible(true);	
			}
		});
		btnBackToLog.setBounds(40, 504, 111, 23);
		AddPanel.add(btnBackToLog);
		
		 rdbtnMale = new JRadioButton("Male");
		rdbtnMale.setBounds(166, 344, 69, 23);
		AddPanel.add(rdbtnMale);
		rdbtnMale.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				rdbtnMale.setSelected(true);
				rdbtnFemale.setSelected(false);	
				gender="MALE";
			}});
		
		 rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(237, 344, 69, 23);
		AddPanel.add(rdbtnFemale);
	    rdbtnFemale.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0)
			{
				rdbtnFemale.setSelected(true);
				rdbtnMale.setSelected(false);	
				gender="FEMALE";
			}});
	
		String aryReligion[]= {"Please Select Here","CHRISTIAN","SARNA","HINDU","ISLAM","MUSLIM","NA"};
		comboReligion = new JComboBox(aryReligion);
		comboReligion.setBounds(150, 467, 203, 20);
		AddPanel.add(comboReligion);
			
		String aryCategory[] = {"Select Any Category","ST","SC","BC-I","BC-II","GENERAL","NA"};
		 comboCategory = new JComboBox(aryCategory);
		comboCategory.setBounds(150, 427, 203, 20);
		AddPanel.add(comboCategory);	
		
		String aryMonth[] = {"Month","JANUARY","FEBRURAY","MARCH","APRIL","MAY",
				              "JUNE","JULY","AUGUST","SEPTEMBER",
		                      "OCTOBER","NOVEMBER","DECEMBER"};
		 comboMonth = new JComboBox(aryMonth);
		comboMonth.setBounds(194, 388, 99, 19);
		AddPanel.add(comboMonth);
		comboMonth.addItemListener(new ItemListener() {

			@Override
	   public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				Month();
			}});
	
     	String aryYear[] = {"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
     			            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
     			            "2011","2012","2013","2014","2015","2016"};
		comboYear = new JComboBox(aryYear);
		comboYear.setBounds(303, 388, 63, 19);
		AddPanel.add(comboYear);
		comboYear.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				Year();
			}});
			
		String aryDate[] = {"Date","1","2","3","4","5","6","7","8","9","10",
				           "11","12","13","14","15","16","17","18","19","20",
				           "21","22","23","24","25","26","27","28","29","30","31"};
		comboDate = new JComboBox(aryDate);
		comboDate.setBounds(130, 387, 54, 20);
		AddPanel.add(comboDate);
		
		JLabel lblHonours = new JLabel("Honours :");
		lblHonours.setBounds(42, 268, 89, 14);
		AddPanel.add(lblHonours);
		
		JLabel lblSemister = new JLabel("Semester :");
		lblSemister.setBounds(42, 293, 89, 14);
		AddPanel.add(lblSemister);
		
		String aryDept[] = {"Select Honours","History","PoliticalSc","Hindi","Geography","Economics",
	            "Physics","Chemistry","Mathematics","Zoology","Botony","Geology",
	            "ComputerSc","Animation","BBA","Accounts"};
		 comboHonours = new JComboBox(aryDept);
		comboHonours.setBounds(150, 265, 203, 20);
		AddPanel.add(comboHonours);
		comboHonours.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) 
			{honours = (String) comboHonours.getSelectedItem();			
			}});
		
		
		String arySemister[] = {"Select Semester","Semester-I","Semester-II","Semester-III","Semester-IV","Semester-V","Semester-VI"};
		 comboSemester = new JComboBox(arySemister);
		comboSemester.setBounds(150, 290, 203, 20);
		AddPanel.add(comboSemester);
		comboSemester.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) 
			{semester = (String) comboSemester.getSelectedItem();}});
	
		
		
		lblErrorStud = new JLabel("");
		lblErrorStud.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErrorStud.setBounds(361, 84, 22, 23);
		AddPanel.add(lblErrorStud);
		lblErrorStud.setVisible(false);
		
		lblErReg = new JLabel("");
		lblErReg.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErReg.setBounds(361, 120, 22, 23);
		AddPanel.add(lblErReg);
		lblErReg.setVisible(false);
		
		lblErexm = new JLabel("");
		lblErexm.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErexm.setBounds(361, 162, 22, 23);
		AddPanel.add(lblErexm);
		lblErexm.setVisible(false);
		
		lblErcls = new JLabel("");
		lblErcls.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcls.setBounds(361, 193, 22, 23);
		AddPanel.add(lblErcls);
		lblErcls.setVisible(false);
		
		lblErhonours = new JLabel("");
		lblErhonours.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErhonours.setBounds(359, 268, 22, 23);
		AddPanel.add(lblErhonours);
		lblErhonours.setVisible(false);
		
		lblErsemister = new JLabel("");
		lblErsemister.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErsemister.setBounds(359, 293, 22, 23);
		AddPanel.add(lblErsemister);
		lblErsemister.setVisible(false);
		
		lblErgender = new JLabel("");
		lblErgender.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErgender.setBounds(359, 345, 22, 23);
		AddPanel.add(lblErgender);
		lblErgender.setVisible(false);
		
		lblErdob = new JLabel("");
		lblErdob.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErdob.setBounds(365, 377, 22, 23);
		AddPanel.add(lblErdob);
		lblErdob.setVisible(false);
		
		lblErcategory = new JLabel("");
		lblErcategory.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcategory.setBounds(359, 430, 22, 23);
		AddPanel.add(lblErcategory);
		lblErcategory.setVisible(false);
		
		lblErreligion = new JLabel("");
		lblErreligion.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErreligion.setBounds(359, 470, 22, 23);
		AddPanel.add(lblErreligion);
		
		JLabel lblUndergraduateStream = new JLabel("Bachealor Stream :");
		lblUndergraduateStream.setBounds(40, 242, 104, 14);
		AddPanel.add(lblUndergraduateStream);
		
		String aryStream[] = {"Select Stream","Bachealor of Arts","Bachealor of Commerce","Bachealor of Science"};
		comboStream = new JComboBox(aryStream);
		comboStream.setBounds(150, 240, 174, 20);
		AddPanel.add(comboStream);
		
		lblBatch = new JLabel("Batch :");
		lblBatch.setBounds(40, 217, 46, 14);
		AddPanel.add(lblBatch);
		
		String aryBatchfrom[] = {"From Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
		            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
		            "2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
		comboBatchFrom = new JComboBox(aryBatchfrom);
		comboBatchFrom.setBounds(148, 214, 87, 20);
		AddPanel.add(comboBatchFrom);
		comboBatchFrom.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				BatchFrom = (String) comboBatchFrom.getSelectedItem();	
				Batch();
				}});
		
		JLabel lblTo = new JLabel("To");
		lblTo.setBounds(250, 215, 22, 18);
		AddPanel.add(lblTo);
		

		String aryBatchto[] = {"To Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
		            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
		            "2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025"};
		 comboBatchTo = new JComboBox(aryBatchto);
		comboBatchTo.setBounds(271, 214, 80, 20);
		AddPanel.add(comboBatchTo);
		comboBatchTo.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				BatchTo = (String) comboBatchTo.getSelectedItem();
				Batch();
				
			}});
		
		lblErreligion.setVisible(false);
		comboStream.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				Stream();
			}});
		
	
		comboDate.addItemListener(new ItemListener() 
		   {@Override
			public void itemStateChanged(ItemEvent arg0)
			{Date();}});

		  comboCategory.addItemListener(new ItemListener() 
		  {@Override
			public void itemStateChanged(ItemEvent arg0)
			{Category();}});
		
		 comboReligion.addItemListener(new ItemListener()
		 {@Override
			public void itemStateChanged(ItemEvent arg0) 
		    {Religion();}});
     }
	
	
	
	public void Date() 
	{
		 date = (String) comboDate.getSelectedItem();
		// JOptionPane.showMessageDialog(null, date);
	}
	public void Month() 
	{
		 month = (String) comboMonth.getSelectedItem();
	//	JOptionPane.showMessageDialog(null, month);
	}
	public void Year()
	{
		 year = (String) comboYear.getSelectedItem();
		// JOptionPane.showMessageDialog(null, year);
	}
	public void Category()
	{

		int selected = comboCategory.getSelectedIndex();
		switch(selected)
		{
		case 0 : //JOptionPane.showMessageDialog(null,"YOu have not Selected Any category");
		        category=null;
		         break;
		case 1 :category = "ST"; break;
		case 2 :category = "SC";break;
		case 3 :category = "BC-I";break;
		case 4 :category = "BC-II";break;
		case 5 :category = "GENERAL";break;
		case 6 :category = "NA";break;
		default : JOptionPane.showMessageDialog(null,"Please Selected any CATEGORY to Proceed","Not Seleced ",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	public void Religion()
	{
		int selected = comboReligion.getSelectedIndex();
		switch(selected)
		{
		case 0 : //JOptionPane.showMessageDialog(null,"YOu have not Selected Any category");
		        religion=null;
		         break;
		case 1 :religion = "CHRISTIAN"; break;
		case 2 :religion = "SARNA";break;
		case 3 :religion = "HINDU";break;
		case 4 :religion = "ISLAM";break;
		case 5 :religion = "MUSLIM";break;
		case 6 :religion = "NA";break;
		default : JOptionPane.showMessageDialog(null,"Please Selected any RELIGION to Proceed","Not Seleced ",JOptionPane.ERROR_MESSAGE);
		}
	}
	public void Stream()
	{
		int selected = comboStream.getSelectedIndex();
		switch(selected)
		{
		case 0 : //JOptionPane.showMessageDialog(null,"YOu have not Selected Any category");
		        stream=null;
		         break;
		case 1 :stream = "Bachealor of Arts"; break;
		case 2 :stream = "Bachealor of Commerce";break;
		case 3 :stream = "Bachealor of Science";break;
		default : JOptionPane.showMessageDialog(null,"Please Selected any RELIGION to Proceed","Not Seleced ",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public static void Batch()
	{
		Batch = BatchFrom +"-"+ BatchTo;
		//JOptionPane.showMessageDialog(null, Batch);
	}
	}



