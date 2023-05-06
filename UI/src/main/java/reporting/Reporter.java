package reporting;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reporter  {
    public static ExtentReports extentReports;
    public static ExtentSparkReporter sparkReporter;
    public static ExtentTest extentTest;

    public static ExtentTest getExtentTest() {
        return extentTest;
    }
    public static void setExtentTest(String testcaseName) {
        extentTest = extentReports.createTest(testcaseName);
    }

//    public static void setTestcaseStatus(Status status,String description,String testCaseName) {
//        String path="./screenShot/"+ testCaseName + ".png";
//        if (status.toString().equalsIgnoreCase("Pass")) {
//            extentTest.pass("");
//            extentTest.log(Status.PASS, "Test Case is passed !");
//        } else if (status.toString().equalsIgnoreCase("Fail")) {
//            extentTest.fail(""+ extentTest.addScreenCaptureFromPath(path));
//            extentTest.log(Status.FAIL, "Test Case is failed !");
//        } else if (status.toString().equalsIgnoreCase("Skip")) {
//            extentTest.skip("");
//            extentTest.log(Status.SKIP, "Test Case is skipped !");
//
//        }
//    }

    public static void setTestcaseStatus(Status logStatus, String description, String testMethodName) {
        String path="./screenShot/"+ testMethodName + ".png";
        if (logStatus.toString().equalsIgnoreCase("PASS")) {
            extentTest.pass("pass");
            extentTest.log(logStatus, "<b><font face=\"Courier New\" color = \"green\">" + description + "</font></b>");
        }
        else if (logStatus.toString().equalsIgnoreCase("FAIL")) {
            extentTest.fail("Test Case Failed Snapshot is below " + extentTest.addScreenCaptureFromPath(path));
            extentTest.log(logStatus,"<a href="+path+"> <img src='"+
                    path+"/selenium-reports/html/"+ testMethodName + ".jpg' height='100' width='100'/> </a>");
        } else if (logStatus.toString().equalsIgnoreCase("SKIP")) {
            extentTest.skip("skip");
            extentTest.log(logStatus, "<b><font face=\"Courier New\" color = \"blue\">" + description + "</font></b>");
        }
    }
    public static void init() {
        if (extentReports == null) {
            extentReports = new ExtentReports();
            sparkReporter = new ExtentSparkReporter("reports/ExtentReport.html");
            extentReports.attachReporter(sparkReporter);
            System.out.println(sparkReporter.getFile());
            sparkReporter.config().setReportName("Deep Chand");
            sparkReporter.config().setDocumentTitle("UI Extent Report");
        }
    }
    public static void generateReport(){
        extentReports.flush();
    }
}