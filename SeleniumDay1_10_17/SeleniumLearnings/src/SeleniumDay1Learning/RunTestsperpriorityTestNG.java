package SeleniumDay1Learning;



import org.testng.annotations.Test;

public class RunTestsperpriorityTestNG {


@Test(priority=3)
		public void tc1(){
			System.out.println("In tc1");
		}
		
		@Test(priority=1)
		public void tc4(){
			System.out.println("In tc4");
		}
		
		@Test(priority=0)
		public void tc2(){
			System.out.println("In tc2");
		}
		
		@Test(priority=2)
		public void tc3(){
			System.out.println("In tc3");
		}
		
	}



