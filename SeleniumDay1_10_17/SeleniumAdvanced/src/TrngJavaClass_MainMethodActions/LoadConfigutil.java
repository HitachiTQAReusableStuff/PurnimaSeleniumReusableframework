package TrngJavaClass_MainMethodActions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadConfigutil {

public static void main(String[] args) throws IOException {
	//System.out.println(readProperty("url"));
}
//Create a static method with return type as String
//Get the File
//Load the File through Properties Class
//Through return (as this is not Void) get the property and pass the Key
//So that whoever uses this Method can pass key as String
//and Use the method which read, load and allow to use the file
public String readProperty(String key) throws IOException{
	String file = System.getProperty("user.dir")+"//src//DataFiles//Config.properties";
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream(file);
	prop.load(fis);
	return prop.getProperty(key);
	
}


}
