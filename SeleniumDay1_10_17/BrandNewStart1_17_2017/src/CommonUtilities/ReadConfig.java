package CommonUtilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
public static String ReadConfigFile(String Key) throws IOException 
{
	
	String FilePath=System.getProperty("user.dir")+"//src//TestData//config.properties";
	Properties prop = new Properties();
	FileInputStream FIS = new FileInputStream(FilePath);
	prop.load(FIS);
	return prop.getProperty(Key);
}
}

