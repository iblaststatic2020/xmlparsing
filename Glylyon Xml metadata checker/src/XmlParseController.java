import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


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
			theModel.SearchButtonFunction();
			
		}
	}
	
	class scanListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
		}
		
	}
}
