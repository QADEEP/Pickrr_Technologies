package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ExtentReportManager implements IReporter {
    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest extentTest;

    public static ExtentReports getReport(){
        if(extentReports==null){
            extentReports=new ExtentReports();
            System.getProperty("user.dir");
            sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir") + "\\ExtentReport\\");
            sparkReporter.config().setReportName("Sanity Report");
            sparkReporter.config().setDocumentTitle("UI Extent Report");
            extentReports.attachReporter(sparkReporter);
        }

        return extentReports;
    }

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

    }
}
