package TestCases;
import java.io.IOException;


import org.testng.annotations.*;
import UtilityMethods.LaunchApp;
import UtilityMethods.LoadConfig;

public class LoginNshore {

	@Test
    public void NshoreLoginCheck() throws IOException {
	
		LaunchApp.LaunchApplication(LoadConfig.ReadConfigFile("Nshoreurl"));
		 
		LaunchApp.Screenprintcapture("NshoreLandingPage");
		LaunchApp.InputText(LoadConfig.ReadConfigFile("NshoreUserNameXpath"),LoadConfig.ReadConfigFile("NshoreUsernameValue"));
		
		LaunchApp.InputText(LoadConfig.ReadConfigFile("NshorePasswordXpath"),LoadConfig.ReadConfigFile("NshorePasswordValue"));
		
		LaunchApp.WebButton(LoadConfig.ReadConfigFile("NshoreLoginSubmit"));

	
LaunchApp.Screenprintcapture("NshoreLoggedInPage");

          }
   
    
    
	
		
}
