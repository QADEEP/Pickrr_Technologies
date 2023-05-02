package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest extentTest;

    public static ExtentReports getReport(){
        if(extentReports==null){
            extentReports=new ExtentReports();
            System.getProperty("user.dir");
            extentReports=new ExtentReports();
            sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir") + "/Reports/ExtentReport.html");
            sparkReporter.config().setReportName("Sanity Report");
            sparkReporter.config().setDocumentTitle("UI Extent Report");
            extentReports.attachReporter(sparkReporter);
        }

        return extentReports;
    }
}
