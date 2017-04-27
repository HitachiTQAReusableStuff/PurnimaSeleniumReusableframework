package UtilityMethods;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;



public class LoadConfig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*Steps to Load Config
	 * Create a Method definition to static string method passing string parameter to it
	 * create a string variable and get the path of the file using system get property string value
	 * create obj of properties class
	 * create a fileinputstream objwhich is a java utility and pass the path of the file.
	 * load the file usinf fileinputstremaobj.
	 * return key value getting the property from the file.
	 * */
	 
	
public static String ReadConfigFile(String Key) throws IOException{
	

	String FilePath = System.getProperty("user.dir")+"//src//TestData//Config.properties";
	Properties prop = new Properties();
	FileInputStream FIS = new FileInputStream(FilePath);
	prop.load(FIS);

	return prop.getProperty(Key);
	
	}



}
