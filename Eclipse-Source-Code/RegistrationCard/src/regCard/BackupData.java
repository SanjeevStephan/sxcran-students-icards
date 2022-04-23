package regCard;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

//import registrationCard.RegLaunch;

public class BackupData {

	static String userName,userHome,userDir,icardDir,aeccDir,classrollDir,imgDir,dataDir,regDir,
	tmpdir,tpStephenware,Status,iBackupbat,iRestorebat,backupCode,restoreCode,
	iCARDbkdir,AECCbkdir,REGbkdir,ROLLbkdir,IMGbkdir;
	public static void BackupData() 
	{   
		RegLaunch reg = new RegLaunch();
	    
		userName = System.getProperty("user.name");
	    userHome = System.getProperty("user.home");
		userDir = System.getProperty("user.dir");
		tmpdir = System.getProperty("java.io.tmpdir");
	    //JOptionPane.showMessageDialog(null, tpStephenware);
		dataDir = userHome + "\\Documents\\Stephenware\\sxc_student_iCards";
		regDir = userHome + "\\Documents\\Stephenware\\sxc_student_iCards\\Regno";
		  
	    aeccDir = dataDir + "\\AECC";
	    classrollDir = dataDir + "\\ClassRollNo";
	    imgDir = dataDir + "\\Stud_img";
		
		/*
		 * Creating Backup folder in the current directory
		 * 
		 * Backup Folders To Be Created: 
		 * iCardBACKUP | AECC | RegNum | ClassRollNo | Stud_img  
		 */
	    iCARDbkdir = userDir + "\\iCARDBACKUP";
	    AECCbkdir = iCARDbkdir + "\\AECC";
	    REGbkdir = iCARDbkdir + "\\RegNum";
	    ROLLbkdir = iCARDbkdir + "\\ClassRollNo";
	    IMGbkdir = iCARDbkdir + "\\Stud_img";
	    tpStephenware = tmpdir + "Stephenware\\iCARDBACKUP";
	    boolean mdiCARDBACKUP = (new File(iCARDbkdir)).mkdirs();
	    boolean mdRegNum = (new File(REGbkdir)).mkdirs();
	    boolean mdAECC = (new File(AECCbkdir)).mkdirs();
	    boolean mdROLLL = (new File(ROLLbkdir)).mkdirs();
	    boolean mdIMG = (new File(IMGbkdir)).mkdirs();
	    boolean mdtmp = (new File(tpStephenware)).mkdirs();
	    //  iCardBACKUP | AECC | ClassRollNo | Stud_img  created successfully;
	  
	    boolean checkbk = (new File(iCARDbkdir)).isDirectory();
	    if(checkbk==true)
	    {Status = "Folder Successfully Created";}
	    else {Status = "Folder Failed to Create";
		}
	     
	    /*
	     * BatchCode commands to be Written in the file : iBackup.bat | iRestore.bat
	     */
	    iBackupbat = tpStephenware + "\\iBackup.bat";
	    iRestorebat = tpStephenware + "\\iRestore.bat";
	    
	    backupCode = "copy "+regDir +"\\*.txt" + " "+REGbkdir
	    		   + "\n copy "+aeccDir +"\\*.txt" + " "+AECCbkdir
	               + "\n copy "+classrollDir +"\\*.txt" + " "+ROLLbkdir
	               + "\n copy "+imgDir +"\\*.jpg" + " "+IMGbkdir;
	    
	    restoreCode = "copy "+REGbkdir +"\\*.txt" + " "+regDir 
	    		   + "\n copy "+AECCbkdir +"\\*.txt" + " "+aeccDir 
	               + "\n copy "+ROLLbkdir +"\\*.txt" + " "+classrollDir 
	               + "\n copy "+IMGbkdir +"\\*.jpg" + " "+imgDir ;
	    
	    
	    
	    /*
		 * Creating Batch Files in the Following Directories
		 *  AppData\local\temp\Stephenware\iCARDBACKUP
		 * 
		 */
	    
	    try 
	    {
			FileWriter fw1 = new FileWriter(iBackupbat);
			BufferedWriter bw1 = new BufferedWriter(fw1);
			bw1.write(backupCode);
			bw1.close();
			
			FileWriter fw2 = new FileWriter(iRestorebat);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			bw2.write(restoreCode);
			bw2.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    /*
	     * Executing the batch code 
	     */
	    try {
			Runtime.getRuntime().exec("explorer "+iBackupbat);
			JOptionPane.showMessageDialog(null,"Files Backup was Successfully "
					+ "\n Files are Saved in \n"+iCARDbkdir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
