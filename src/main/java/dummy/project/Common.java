package dummy.project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

public class Common {
	
	
	private static Map<String, String> map;
	
	
	private static void storePropInMap(String filename) throws IOException{
		
		FileInputStream fileInputStream = new FileInputStream(new File(System.getProperty("user.dir")+ "//Resources//"+filename+".properties"));
		map = new HashMap<>();
		Properties properties = new Properties();
		properties.load(fileInputStream);
		for (Entry<Object, Object> entry : properties.entrySet()) {
			map.put(String.valueOf(entry.getKey()),
					String.valueOf(entry.getValue())); 
		}
		//System.out.println(map);

	}
	
	public static String getValueFromProperty(String filename,String key) throws IOException {
		
		storePropInMap(filename);
		return map.get(key);
	}
	
	public String getKeyFromProperty(String filename,String value) throws IOException {
		
		storePropInMap(filename);
		return map.get(value);
	}
	
	public static String getLocator(String s){
		String[] a= s.split(":");
		return a[0];
	}
	
	public static String getLocatorData(String s){
		String[] a= s.split(":");
		return a[1];
	}
	
	

}
