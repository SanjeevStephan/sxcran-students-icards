package regCard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;


public class RestoreData {
	static String userName,userDir,icardDir,aeccDir,classrollDir,imgDir,dataDir,
	userHome,restoredPath,iRestorebat,tmdir,tpStephenware,tmpdir,regDir;
	public static void RestoreData()
	{
		tmpdir = System.getProperty("java.io.tmpdir");
        userHome = System.getProperty("user.home");
        restoredPath = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
	    tpStephenware = tmpdir + "Stephenware\\iCARDBACKUP";
	    iRestorebat = tpStephenware + "\\iRestore.bat";
	    userName = System.getProperty("user.name");
		userDir = System.getProperty("user.dir");
		
	    //JOptionPane.showMessageDialog(null, tpStephenware);
		//dataDir = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
	    aeccDir = restoredPath + "\\AECC";
	    classrollDir = restoredPath + "\\ClassRollNo";
	    regDir= restoredPath + "\\Regno";
	    imgDir = restoredPath + "\\Stud_img";
	    
	    /*
	     * Creating files in the Documents\\Stephenware\\sxc_student_iCards
	     * Folder to be created in the DIrectory sxc_student_iCards
	     * AECC | ClassRollNo  | Stud_img
	     */
	    boolean mdStephenware = (new File(restoredPath)).mkdirs();
	    boolean mdReg = (new File(regDir)).mkdirs();
	    boolean mdAECC = (new File(aeccDir)).mkdirs();
	    boolean mdClassroll = (new File(classrollDir)).mkdirs();
	    boolean mdImg = (new File(imgDir)).mkdirs();
	    
	    try {
			Runtime.getRuntime().exec("explorer "+iRestorebat);
			JOptionPane.showMessageDialog(null,"Files Succesfully Restored "
					+ "\nRestoredPath :"+restoredPath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
