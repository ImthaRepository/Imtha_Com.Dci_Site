package Utilities;

import java.util.HashMap;
import java.util.Map;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Log_File_Insert {
	static Map<Integer, ExtentTest> extentTestMap =new HashMap<Integer, ExtentTest>();
	
	
public static synchronized ExtentTest getTest() {
	return (ExtentTest) extentTestMap.get((int)(long)(Thread.currentThread().getId()));
}
	
	public static synchronized void	 longText(String message) {
		getTest().log(Status.PASS, message);
	}
}
