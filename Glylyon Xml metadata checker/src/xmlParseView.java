import java.awt.Container;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class xmlParseView {
	private static File file;
	private static JLabel fileLabel;
	private static JButton searchButton, scanButton;
	private static JFrame mainFrame;
	private static JPanel mainPanel;
	private static Container pane;
	private static JTextField fileNameInput;
	
	
 xmlParseView(){
		
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		 catch (ClassNotFoundException e) {}
		 catch (InstantiationException e) {}
		 catch (IllegalAccessException e) {}
		 catch (UnsupportedLookAndFeelException e) {}
		
		mainFrame = new JFrame("Meta-data Quality Analysis");
		fileLabel = new JLabel("File");
		searchButton = new JButton("Search");
		scanButton = new JButton("Scan");
		fileLabel = new JLabel("File");
		pane = new Container();
		mainPanel = new JPanel(null);
		fileNameInput = new JTextField("", 20);
		
		mainFrame.setSize(300, 250);
		pane = mainFrame.getContentPane();
		pane.setLayout(null);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		pane.add(mainPanel);
		mainPanel.add(fileLabel);
		mainPanel.add(searchButton);
		mainPanel.add(scanButton);
		mainPanel.add(fileNameInput);
		
		mainPanel.setBounds(0, 0, 300, 250);
		fileLabel.setBounds(10,10, 30, 30);
		fileNameInput.setBounds(40, 10, 150, 25);
		searchButton.setBounds(195, 10, 90, 25);
		scanButton.setBounds(10, 45, 275, 165);
		
		mainFrame.setVisible(true);
		
		searchButton.addActionListener( new searchButton_Action());
		scanButton.addActionListener(new scanButton_Action());
	}
}
