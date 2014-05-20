import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;


public class XmlParseController {
	private xmlParseView theView;
	private XmlParseModel theModel;
	public File file;
	int sectionCount;
	public XmlParseController(xmlParseView theView, XmlParseModel theModel){
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addFileSearchListener(new FileSearchListener());
		this.theView.addScanButtonListener(new scanListener());
	}
	
	class FileSearchListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			JFileChooser fileChooser = new JFileChooser();
			
			int status = fileChooser.showOpenDialog(null);
			File selectedFile = fileChooser.getSelectedFile();
			file = selectedFile;
			if (status == JFileChooser.APPROVE_OPTION){
				 selectedFile = fileChooser.getSelectedFile();
				
				 
				 
			}
			
			theView.setFileName(selectedFile.getAbsolutePath()); 
		}
		/*public void setSectionCount(int section){
			System.out.println(section);
			theModel.getSectionCount();
			theView.setSectionCount(section);
		}*/
	}
	
	class scanListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
				theModel.setSavedInputFile(file);
				sectionCount = theModel.getSectionCount();
				 theView.setSectionCount(sectionCount);
			
		}
		
	}
}
