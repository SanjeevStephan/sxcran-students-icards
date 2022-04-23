package regCard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class WriteFiles {

static String txtStud,txtRegno,txtExmroll,txtName,txtGender,txtClassroll,txtDob,dobYear,txtFathername,txtReligion,txtCategory,
txtHonours,txtSemester,txtStream;

AddStudent add = new AddStudent();
	public void WriteFiles() 
	{
		Scanner in  = new Scanner(System.in);
		
		String Homepath = System.getProperty("user.home");
		String currentDir = System.getProperty("user.dir");
		
		String docDir = Homepath +"\\Documents\\Stephenware\\sxc_student_iCards";
		String regDir = docDir +"\\Regno";
		String sxcStudDir = currentDir + "\\sxc_student_iCards";
	     
		
		//txtStud=launch.studname;
		txtName=add.studname;
		txtRegno=add.regno;
		txtExmroll=add.exmno;
        txtClassroll=add.classroll;
        txtDob=add.dob;
        txtFathername=add.fathername;
        txtGender=add.gender;
        txtReligion=add.religion;
		txtCategory=add.category;
		txtStream=add.stream;
		String txtBatch = add.Batch;
		txtHonours=add.honours;
		txtSemester=add.semester;
		String str="Check Your Details" +"\nName :\t"+ txtName
		                                +"\nRegistration No :\t"+txtRegno
				                        +"\nExam Roll No :\t"+txtExmroll
		                                +"\nClass Roll no :\t"+txtClassroll
		                                +"\nDate Of Birth :\t"+txtDob
		                                +"\nFather Name:\t"+txtFathername
		                                +"\nGender :\t"+txtGender
		                                +"\nReligion :\t"+txtReligion
		                                +"\nCategory :\t"+txtCategory
		                                +"\nStream :\t"+txtStream
		                                +"\nBatch :\t"+txtBatch
		                                +"\nHonours :\t"+txtHonours
		                                +"\nSemester :\t"+txtSemester
		                                +"\nWriteFiles.java";
		
		JOptionPane.showMessageDialog(null, str);

		 try {
			 boolean createDir = (new File(docDir)).mkdir();
			 
			String filePath = regDir +"\\" +txtExmroll+".txt";
			 
			JOptionPane.showMessageDialog(null,"File will be saved in the path :\n"+filePath);	
			
			FileWriter fWriter = new FileWriter(filePath);
			BufferedWriter bwriter = new BufferedWriter(fWriter);
		    bwriter.write("%"+txtRegno);
		    bwriter.write("%"+txtExmroll);
		    bwriter.write("%"+txtClassroll);
		    bwriter.write("%"+txtName);
		    bwriter.write("%"+txtGender);
		    bwriter.write("%"+txtDob);
		    bwriter.write("%"+txtFathername);
		    bwriter.write("%"+txtReligion);
		    bwriter.write("%"+txtCategory);
		    bwriter.write("%"+txtStream);
		    bwriter.write("%"+txtBatch);
		    bwriter.write("%"+txtHonours);
		    bwriter.write("%"+txtSemester);
		    bwriter.close();
			
		    boolean success = (new File(docDir)).isFile();
		    while(success) 
		    {JOptionPane.showMessageDialog(null,"File Succesfully Written");}
		  } catch (IOException e) {
			  JOptionPane.showMessageDialog(null,"Failed to Save the File !","Error found in WriteFiles.java ",JOptionPane.ERROR_MESSAGE);
				
			  e.printStackTrace();}
		
		 try {
			
			String filePath = docDir +"\\ClassRollNo\\"+txtClassroll+".txt";
			 
			 FileWriter fWriter2 = new FileWriter(filePath);
			 BufferedWriter bw2 = new BufferedWriter(fWriter2);
			 bw2.write(txtExmroll);
			 bw2.close();
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null,"Please Check your Class Roll Path !","Error found in WriteFiles.java ",JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
		}
		
	}
}
