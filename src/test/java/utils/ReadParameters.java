package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// TODO: Auto-generated Javadoc
/**
 * The Class ReadParameters.
 */
public class ReadParameters {

	static Properties prop = null;
	static InputStream fs = null;

	/**
	 * Static block is a set of instructions that is run only once when
	 * a class is loaded into memory. A static block is also called a static
	 * initialization block
	 */
	static {
		prop = new Properties();
		try {
			fs = ReadParameters.class.getClassLoader().getResourceAsStream("config.properties");
			prop.load(fs);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Gets the property.
	 * @param key the key
	 * @return the property
	 */
	public static String getProperty(String key) {
		return prop.getProperty(key).toString().trim();
	}
}