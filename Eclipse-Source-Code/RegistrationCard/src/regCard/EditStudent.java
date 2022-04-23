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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.CardLayout;

public class EditStudent extends JFrame {

	private JPanel contentPane;
	//private JFrame frame;

	static String studname,fathername,gender,regno,exmno,classroll,dob,category,religion;
	static String loginExm,loginroll,LoginPswd,askUser;
	private JTextField txtfather,txtLoginexmroll,txtLoginroll;
	static String userHome,fpath,exmfPath,sxcfPath,aecc,
	date,month,year,honours,semester,stream;
	static JPanel panel,LoginPanel;
	static int  indate,inmonth,inyear,inhonours,insemester;
	private JLabel lblErrorStud,lblErReg,lblErexm,lblErcls,lblErhonours,lblErsemister,lblErgender,lblErdob,lblErcategory,lblErreligion;

	static JTextField txtStudname,txtRegno,txtExmno,txtName,txtGender,txtRollno,txtDob,dobYear,txtFathername,txtReligion,txtCategory,
	txtHonours,txtSemester,txtStream,txtAecc;
	static String istudname,ifathername,igender,iregno,iexmno,iclassroll,idob,icategory,ireligion,idate,imonth,istream,ihonours,isemester,iaecc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudent frame = new EditStudent();
					frame.setVisible(true);
					JOptionPane.showMessageDialog(null,"Please Select the Registratin Number !","Unable to Edit",JOptionPane.ERROR_MESSAGE);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public EditStudent() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 389, 612);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, "name_10988711898937");
		panel.setLayout(null);
	
		RegLaunch launch = new RegLaunch();
		studname = launch.Name;
		fathername = launch.Father;
		gender = launch.Gender;
		regno = launch.Regno;
		exmno = launch.Exmno;
		classroll = launch.Classroll;
		dob = launch.Dob;
		category = launch.Category;
		religion = launch.Religion;
		date = launch.dobDate;
		month = launch.dobMonth;
		year = launch.dobYear;
		stream=launch.stream;
		honours = launch.honours;
		semester = launch.semester;
		aecc = launch.AECC;
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
                
                JOptionPane.showMessageDialog(null, str);
	
	
/*
 * indate = launch.
	    inmonth  = launch
		inyear = launch
	    inhonours = launch
		insemester = launch

 */
		
		JLabel lblRegistrationNo = new JLabel("Registration No :");
		lblRegistrationNo.setBounds(40, 118, 141, 31);
		panel.add(lblRegistrationNo);
		
		JLabel lblExamRollNo = new JLabel("Exam Roll No :");
		lblExamRollNo.setBounds(40, 160, 111, 19);
		panel.add(lblExamRollNo);
		
		JLabel lblClassRollNo = new JLabel("Class Roll No :");
		lblClassRollNo.setBounds(40, 191, 111, 19);
		panel.add(lblClassRollNo);
		
		JLabel lblCategory = new JLabel("Category :");
		lblCategory.setBounds(40, 318, 111, 19);
		panel.add(lblCategory);
		
		JLabel lblStudentName = new JLabel("Student Name :");
		lblStudentName.setBounds(40, 88, 141, 19);
		panel.add(lblStudentName);
		
		JLabel lbldob = new JLabel("Date Of Birth");
		lbldob.setBounds(40, 288, 89, 19);
		panel.add(lbldob);
		
		JLabel lblReligion = new JLabel("Religion :");
		lblReligion.setBounds(40, 348, 69, 19);
		panel.add(lblReligion);
		
		txtStudname = new JTextField(studname);
		txtStudname.setBounds(148, 87, 203, 20);
		panel.add(txtStudname);
		txtStudname.setColumns(10);
	
		txtRegno = new JTextField(regno);
		txtRegno.setColumns(10);
		txtRegno.setBounds(148, 123, 203, 20);
		panel.add(txtRegno);
				
		txtExmno = new JTextField(exmno);
		txtExmno.setColumns(10);
		txtExmno.setBounds(148, 159, 203, 20);
		panel.add(txtExmno);
		
		txtRollno = new JTextField(classroll);
		txtRollno.setColumns(10);
		txtRollno.setBounds(148, 190, 203, 20);
		panel.add(txtRollno);
		
		txtDob = new JTextField(dob);
		txtDob.setColumns(10);
		txtDob.setBounds(144, 287, 89, 20);
		panel.add(txtDob);
		
		
		txtCategory = new JTextField(category);
		txtCategory.setColumns(10);
		txtCategory.setBounds(144, 317, 203, 20);
		panel.add(txtCategory);
		
		txtReligion = new JTextField(religion);
		txtReligion.setColumns(10);
		txtReligion.setBounds(144, 348, 203, 20);
		panel.add(txtReligion);
		
		txtGender = new JTextField(gender);
		txtGender.setColumns(10);
		txtGender.setBounds(148, 249, 143, 20);
		panel.add(txtGender);
		
		JLabel lblAeccPaper = new JLabel("AECC Paper :");
		lblAeccPaper.setBounds(40, 459, 99, 14);
		panel.add(lblAeccPaper);
		
		txtAecc = new JTextField(aecc);
		txtAecc.setBounds(144, 456, 203, 20);
		panel.add(txtAecc);
		txtAecc.setColumns(10);
		//lblErreligion.setVisible(false);
		// String2Switch();
		
		JLabel lblStream = new JLabel("Stream    :");
		lblStream.setBounds(40, 384, 99, 14);
		panel.add(lblStream);
		
		txtStream = new JTextField(stream);
		txtStream.setColumns(10);
		txtStream.setBounds(144, 383, 203, 20);
		panel.add(txtStream);
		
		JLabel lblHonours = new JLabel("Honours     :");
		lblHonours.setBounds(40, 409, 99, 14);
		panel.add(lblHonours);
		
		txtHonours = new JTextField(honours);
		txtHonours.setColumns(10);
		txtHonours.setBounds(144, 406, 203, 20);
		panel.add(txtHonours);
		
		JLabel lblSemester = new JLabel("Semester    :");
		lblSemester.setBounds(40, 434, 99, 14);
		panel.add(lblSemester);
		
		txtSemester = new JTextField(semester);
		txtSemester.setColumns(10);
		txtSemester.setBounds(144, 434, 203, 20);
		panel.add(txtSemester);
		JButton btnSave = new JButton("SAVE");
		btnSave.setToolTipText("Save the File:Stephenware/sxc_student_iCards");
		btnSave.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/mini_icons/Save16.png")));
		btnSave.addActionListener(new ActionListener() {
	    		
			public void actionPerformed(ActionEvent arg0) 
			{
				AECC addAecc = new AECC();
              
				
				istudname=txtStudname.getText();
				ifathername=txtfather.getText();
				iregno=txtRegno.getText();
				iexmno=txtExmno.getText();
				iclassroll=txtRollno.getText();
				igender=txtGender.getText();
				idob=txtDob.getText();
				ireligion=txtReligion.getText();
				icategory=txtCategory.getText();
				istream=txtStream.getText();
				ihonours=txtHonours.getText();
				isemester=txtSemester.getText();
				iaecc=txtAecc.getText();
				
				//date = (String) comboDate.getSelectedItem();
				//month = (String) comboMonth.getSelectedItem();
			//	year = (String) comboYear.getSelectedItem();
				//honours = (String) comboHonours.getSelectedItem();
				//semester = (String) comboSemester.getSelectedItem();
				//	gender=txtGender.getText();
				//dob=txtDob.getText();
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
				//    honours=honours.toUpperCase();
				 //   semester = semester.toUpperCase();
	
		        	String str="Saving Your Details" +"\nName :\t"+ txtName
		                    +"\nRegistration No :\t"+txtRegno
		                    +"\nExam Roll No :\t"+txtExmno
		                    +"\nClass Roll no :\t"+txtRollno
		                    +"\nFather Name:\t"+txtFathername
		                    +"\nGender :\t"+txtGender
		                    +"\nDate Of Birth :\t"+txtDob
		                    +"\nReligion :\t"+txtReligion
		                    +"\nCategory :\t"+txtCategory
		                    +"\nStream :\t"+txtStream
		                    +"\nHonours : \t"+txtHonours
		                    +"\nSemister  :\t "+txtSemester
		                    +"\nAECC Paper :\t "+txtAecc
		        	        + "\n EditStudent.java";
                            JOptionPane.showMessageDialog(null, str);
 
                //     SaveEdit save = new SaveEdit();
                  //   save.SaveEdit();
				}
				//WriteFiles write = new WriteFiles();
				//write.WriteFiles();
			}
		);
		btnSave.setBounds(252, 507, 99, 23);
		panel.add(btnSave);
		
		JLabel lblLogo = new JLabel("");
		lblLogo.setIcon(new ImageIcon(RegLaunch.class.getResource("/img_src/logo.png")));
		//lblLogo.setIcon(new ImageIcon(Launch.class.getResource("/studExmroll/img_src/logo.png")));
		lblLogo.setBounds(10, 0, 460, 85);
		panel.add(lblLogo);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(40, 252, 89, 14);
		panel.add(lblGender);
		
		JLabel label = new JLabel("Father's Name :");
		label.setBounds(40, 222, 111, 19);
		panel.add(label);
		
		txtfather = new JTextField(fathername);
		txtfather.setColumns(10);
		txtfather.setBounds(148, 221, 203, 20);
		panel.add(txtfather);
		
		JButton btnNew = new JButton("New");
		btnNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
			     txtStudname.setText(null);
				txtfather.setText(null);
				txtGender.setText(null);
			//.setSelected(false);
			//	rdbtnFemale.setSelected(false);
				txtRegno.setText(null);
				txtExmno.setText(null);
				txtRollno.setText(null);
				txtDob.setText(null);
				txtCategory.setText(null);
				txtReligion.setText(null);
				txtAecc.setText(null);
				//comboCategory.setSelectedIndex(0);
			//	comboReligion.setSelectedIndex(0);
			//	comboDate.setSelectedIndex(0);
				//comboMonth.setSelectedIndex(0);
			//	comboYear.setSelectedIndex(0);
			 //   comboHonours.setSelectedIndex(0);
			   // comboSemester.setSelectedIndex(0);
				
				//comboCategory
		     	
			}
		});
		btnNew.setBounds(157, 507, 89, 23);
		panel.add(btnNew);
		
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
		btnBackToLog.setBounds(40, 507, 111, 23);
		panel.add(btnBackToLog);
		
		String aryReligion[]= {"Please Select Here","CHRISTIAN","SARNA","HINDU","ISLAM","MUSLIM","NA"};
			
		String aryCategory[] = {"Select Any Category","ST","SC","BC-I","BC-II","GENERAL","NA"};
		
		String aryMonth[] = {"Month","JANUARY","FEBRURAY","MARCH","APRIL","MAY",
				              "JUNE","JULY","AUGUST","SEPTEMBER",
		                      "OCTOBER","NOVEMBER","DECEMBER"};
	
     	String aryYear[] = {"Year","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999",
     			            "2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010",
     			            "2011","2012","2013","2014","2015","2016"};
		
     	
    // 	String separator = " ";
    // 	String yoSeparator[] = dob.split(separator);
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
		lblErrorStud.setBounds(361, 84, 22, 23);
		panel.add(lblErrorStud);
		lblErrorStud.setVisible(false);
		
		lblErReg = new JLabel("");
		lblErReg.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErReg.setBounds(361, 120, 22, 23);
		panel.add(lblErReg);
		lblErReg.setVisible(false);
		
		lblErexm = new JLabel("");
		lblErexm.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErexm.setBounds(361, 162, 22, 23);
		panel.add(lblErexm);
		lblErexm.setVisible(false);
		
		lblErcls = new JLabel("");
		lblErcls.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcls.setBounds(361, 193, 22, 23);
		panel.add(lblErcls);
		lblErcls.setVisible(false);
		
		lblErhonours = new JLabel("");
		lblErhonours.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErhonours.setBounds(357, 221, 22, 23);
		panel.add(lblErhonours);
		lblErhonours.setVisible(false);
		
		lblErsemister = new JLabel("");
		lblErsemister.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErsemister.setBounds(357, 246, 22, 23);
		panel.add(lblErsemister);
		lblErsemister.setVisible(false);
		
		lblErgender = new JLabel("");
		lblErgender.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErgender.setBounds(308, 252, 22, 23);
		panel.add(lblErgender);
		lblErgender.setVisible(false);
		
		lblErdob = new JLabel("");
		lblErdob.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErdob.setBounds(367, 338, 22, 23);
		panel.add(lblErdob);
		lblErdob.setVisible(false);
		
		lblErcategory = new JLabel("");
		lblErcategory.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErcategory.setBounds(357, 383, 22, 23);
		panel.add(lblErcategory);
		lblErcategory.setVisible(false);
		
		lblErreligion = new JLabel("");
		lblErreligion.setIcon(new ImageIcon(AddStudent.class.getResource("/img_src/mini_icons/warng.png")));
		lblErreligion.setBounds(357, 423, 22, 23);
		panel.add(lblErreligion);
	
	}
public void String2Switch()
{/*
	switch(gender)
	{
	case "MALE" :JOptionPane.showMessageDialog(null, gender);
		         rdbtnMale.setSelected(true);break;
	case "FEMALE" :JOptionPane.showMessageDialog(null, gender);
		         rdbtnFemale.setSelected(true);break;
	default:JOptionPane.showMessageDialog(null, "unable to prase String into integer");
	}
	
	*/
	
	
	}
}
