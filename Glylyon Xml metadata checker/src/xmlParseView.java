import java.awt.Container;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class xmlParseView extends JFrame{
	private  File file;
	private  JLabel fileLabel;
	private  JButton searchButton, scanButton;
	
	private  JPanel mainPanel;
	
	private  JTextField fileNameInput;
	
	
 xmlParseView(){
		
		try {UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());}
		 catch (ClassNotFoundException e) {}
		 catch (InstantiationException e) {}
		 catch (IllegalAccessException e) {}
		 catch (UnsupportedLookAndFeelException e) {}
		
		
		fileLabel = new JLabel("File");
		searchButton = new JButton("Search");
		scanButton = new JButton("Scan");
		fileLabel = new JLabel("File");
		
		mainPanel = new JPanel(null);
		fileNameInput = new JTextField("", 20);
		
		this.setSize(300, 250);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		mainPanel.add(fileLabel);
		mainPanel.add(searchButton);
		mainPanel.add(scanButton);
		mainPanel.add(fileNameInput);
		this.add(mainPanel);
		
		fileLabel.setBounds(10,10, 30, 30);
		fileNameInput.setBounds(40, 10, 150, 25);
		searchButton.setBounds(195, 10, 90, 25);
		scanButton.setBounds(10, 45, 275, 165);
		
		
		
		
	}
 
 public void setFilePath(String filePath){
	 
 }
 void addFileSearchListener(ActionListener searchButtonListener){
	 
	 searchButton.addActionListener(searchButtonListener);
 }
 
 void addScanButtonListener(ActionListener scanListener){
	 scanButton.addActionListener(scanListener);
	 
 }
}
