import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



 public class c1 implements ITestListener{

	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Suceess");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Failed");
	}

	public void onStart(ITestContext context) {
		System.out.println("Stareted");
	}

	public void onFinish(ITestContext context) {
		System.out.println("finished");
	}
	 
 }

