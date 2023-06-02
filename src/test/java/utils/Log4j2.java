package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2 {

	// Description: Declaro el objeto log Log4j2 e inicializo
	private static final Logger log4j2 = LogManager.getLogger(Log4j2.class);

	// Description: Info Level Logs
	public static void info(String text) {
		log4j2.info(text);
	}

	// Description: Warn Level Logs
	public static void warn(String e) {
		log4j2.warn(e);
	}

	// Description: Error Level Logs
	public static void error(String e) {
		log4j2.error(e);
	}

	// Description: Fatal Level Logs
	public static void fatal(String e) {
		log4j2.fatal(e);
	}
}
