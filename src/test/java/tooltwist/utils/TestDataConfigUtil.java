package tooltwist.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestDataConfigUtil {
	private InputStream input = null;
	private Properties prop = null;
	private static Properties testdata = null;
	
	

	private TestDataConfigUtil() {
		testdata = new Properties();
		try {
			input = getClass().getClassLoader().getResourceAsStream("testdata.properties");
			testdata.load(input);
			testdata.getProperty("slHomePage");
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		
	}

	public String getConfig(String configName) {
		return testdata.getProperty(configName) == null ? "" : testdata.getProperty(configName);
	}

	private static class TestDataConfigLazyHolder {
		public static final TestDataConfigUtil instance = new TestDataConfigUtil();
	}

	public static TestDataConfigUtil getTestDataConfig() {
		return TestDataConfigLazyHolder.instance;
	}

}
