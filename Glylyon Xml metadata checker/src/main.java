import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.text.html.MinimalHTMLWriter;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class main {
	
	public static void main(String[] args){
		
		 
		/*JFileChooser chooser = new JFileChooser();
		
		chooser.showOpenDialog(null);
		
		file = chooser.getSelectedFile();
		System.out.println(file.getAbsolutePath());*/
		
		
		
		
	}
	
	
	public static void parseXML(File xmlFile){
		
	}

}
class searchButton_Action implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JFileChooser chooser = new JFileChooser();
		
		chooser.showOpenDialog(null);
		
		File file = chooser.getSelectedFile();
		
		
		
		
	}
	
}
 class scanButton_Action implements ActionListener {

	public void getData (File xmlfile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
 }
