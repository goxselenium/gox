package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utils.Log4j2;

public class TestListener implements ITestListener {

	enum Status {
		PASSED, FAILED, SKIPPED
	}

	private static String getTestMethodName(ITestResult testResult) {
		return testResult.getMethod().getConstructorOrMethod().getName();
	}

	@Override
	public void onTestStart(ITestResult testResult) {
		Log4j2.info("Method name: " + getTestMethodName(testResult));
	}

	@Override
	public void onTestSuccess(ITestResult testResult) {
		Log4j2.info(getTestMethodName(testResult) + " :" + Status.PASSED);
		try {
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult testResult) {
		Log4j2.info(getTestMethodName(testResult) + " :" + Status.FAILED);
		try {
		} catch (Exception e) {
			Log4j2.error("Descripcion: " + e);
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult testResult) {
		Log4j2.info(getTestMethodName(testResult) + " : " + Status.SKIPPED);
	}

	@Override
	public void onStart(ITestContext itestContext) {
		Log4j2.info("Start Testng Test name: " + itestContext.getName());
	}

	@Override
	public void onFinish(ITestContext itestContext) {
		Log4j2.info("This is Passed methods: " + itestContext.getPassedTests().size());
		Log4j2.info("This is Failed methods: " + itestContext.getFailedTests().size());
		Log4j2.info("This is Skipped methods: " + itestContext.getSkippedTests().size());
	}
}
