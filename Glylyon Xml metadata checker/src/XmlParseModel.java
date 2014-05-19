import java.io.File;

import javax.swing.JFileChooser;


public class XmlParseModel {
public File file = null;



	


	public void setSavedInputFile(File selectedFile) {
		// TODO Auto-generated method stub
		file = selectedFile;
		
		System.out.println(file.exists());
		
	}
	
	
	
}
