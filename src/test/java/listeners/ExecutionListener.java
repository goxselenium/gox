package listeners;

import org.testng.IExecutionListener;

import utils.Log4j2;

public class ExecutionListener implements IExecutionListener {

	private long startTime;

	@Override
	public void onExecutionStart() {
		startTime = System.currentTimeMillis();
	}

	@Override
	public void onExecutionFinish() {
		Log4j2.info("TestNG has finished, took around " + (System.currentTimeMillis() - startTime) + "ms");
	}
}
