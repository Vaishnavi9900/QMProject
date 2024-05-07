package DataProviderpack;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ItestListenerClass extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName());
		
		CaptureScreenshot(result.getTestContext().getName()+ "_" +result.getMethod().getMethodName()+" .jpg");
		
	}

	

	
	
	

}
