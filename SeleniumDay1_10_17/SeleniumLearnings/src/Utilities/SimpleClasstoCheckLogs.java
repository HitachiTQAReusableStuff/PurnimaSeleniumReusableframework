package Utilities;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SimpleClasstoCheckLogs {
	
	Logger APPLICATION_LOGS=Logger.getLogger("devpinoyLogger");
	
	@Test
	public void testLOgs(){
		
		APPLICATION_LOGS.debug("first test ran");
	}
}
