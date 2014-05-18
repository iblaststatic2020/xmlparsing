import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;


public class XmlParseController {
	private xmlParseView theView;
	private XmlParseModel theModel;
	
	public XmlParseController(xmlParseView theView, XmlParseModel themodel){
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addFileSearchListener(new FileSearchListener());
		this.theView.addScanButtonListener(new scanListener());
	}
	
	class FileSearchListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			//theModel.SearchButtonFunction();
			JFileChooser fileChooser = new JFileChooser();
			File selectedFile;
			int status = fileChooser.showOpenDialog(null);
			
			if (status == JFileChooser.APPROVE_OPTION){
				 selectedFile = fileChooser.getSelectedFile();
				theModel.setSavedInputFile(selectedFile);
			}
			//theView.setFileName(selectedFile.getAbsolutePath()); 
		}
	}
	
	class scanListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
