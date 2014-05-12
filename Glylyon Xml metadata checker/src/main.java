import java.awt.Container;
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
	static File file;
	static JLabel fileLabel;
	static JButton searchButton, scanButton;
	static JFrame mainFrame;
	static JPanel mainPanel;
	static Container pane;
	public static void main(String[] args){
		createGUI();
		 
		JFileChooser chooser = new JFileChooser();
		
		chooser.showOpenDialog(null);
		
		file = chooser.getSelectedFile();
		System.out.println(file.getAbsolutePath());
		
		
		
	}
	public static void createGUI(){
		
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		 catch (ClassNotFoundException e) {}
		 catch (InstantiationException e) {}
		 catch (IllegalAccessException e) {}
		 catch (UnsupportedLookAndFeelException e) {}
		
		mainFrame = new JFrame("Meta-data Quality Analysis");
		fileLabel = new JLabel("File");
		searchButton = new JButton("Search");
		scanButton = new JButton("Scan");
		
		mainFrame.setSize(300, 250);
		pane = mainFrame.getContentPane();
		pane.setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.add(mainPanel);
		mainPanel.add(fileLabel);
		mainPanel.add(searchButton);
		mainPanel.add(scanButton);
		
		
	}
	

}
