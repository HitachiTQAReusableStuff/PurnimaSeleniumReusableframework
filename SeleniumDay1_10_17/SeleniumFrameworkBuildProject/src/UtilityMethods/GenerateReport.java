package UtilityMethods;


import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
/**
 * two ways to implement listener in TestNG
 * 1) By implementing ITestListener interface
 * 2) By extending TestListenerAdapter class
 * @author Admin
 *
 */
public class GenerateReport extends TestListenerAdapter {
	//implements ITestListener
	public void onTestSuccess(ITestResult tr){
		System.out.println("Listener-Success - "+tr.getName());

	}
	public void onTestFailure(ITestResult tr){
		System.out.println("Listener-Failure - "+tr.getName());

	}
	public void onTestSkipped(ITestResult tr){
		System.out.println("Listener-Skipped - "+tr.getName());

	}
	public void onTestStart(ITestResult tr){
		System.out.println("Listener-Starting test - "+tr.getName());

	}

}
