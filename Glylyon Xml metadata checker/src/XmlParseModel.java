import java.io.File;

import javax.lang.model.element.Element;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;


public class XmlParseModel {
public File file = null;
NodeList nList;
int sectionCount;

public XmlParseModel(){
	
}
	


	public void setSavedInputFile(File selectedFile) {
		// TODO Auto-generated method stub
		file = selectedFile;
		try{
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(file);
			nList = doc.getElementsByTagName("section");
			sectionCount = nList.getLength();
			if (sectionCount > 0){
				getSectionCount();
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

	public int getSectionCount() {
		System.out.println("this the model's section Count: " +sectionCount);
		return sectionCount;
	}
	
	
	
}
