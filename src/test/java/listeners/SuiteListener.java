package listeners;

import org.testng.ISuite;
import org.testng.ISuiteListener;

import utils.Log4j2;

public class SuiteListener implements ISuiteListener {

	@Override
	public void onStart(ISuite suite) {
		Log4j2.info("Start Suite executed :" + suite.getName());
	}

	@Override
	public void onFinish(ISuite suite) {
		Log4j2.info("Finish Suite executed :" + suite.getName());
	}
}