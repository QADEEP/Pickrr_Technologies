package base;

public final class LoggerMessage {

    //Common log messages
    public static String getSourcePathPass 	= "Fetched Source path successfully";
    public static String getSourcePathFail 	= "Unable to fetch the Source path";
    public static String processingUserWait = "Processing user wait method for";
    public static String timeOut = "response timed out";
    public static String openFileFail = "unable to open file";
    public static String configFileError = "configure file error";
    public static String openAppFail = "unable to open application";
    public static String dbConnectionError ="database connection error";
    public static String loadImageFail = "unable to load image from file";

    //log messages for web application class
    public static String clickButtonPass = "Clicked Button successfully";
    public static String clickButtonFail = "Unable to click Button" ;
    public static String clickLinkPass = "Clicked Link successfully";
    public static String clickLinkFail = "Unable to click Link" ;
    public static String startDriverPass = "Driver started successfully";
    public static String startDriverFail = "Unable to start driver";
    public static String stopDriverPass = "Driver stopped successfully";
    public static String stopDriverFail = "Unable to stop driver";
    public static String closeDriverPass = "Driver closed successfully";
    public static String closeDriverFail = "Unable to close driver";
    public static String deleteCookiesPass = "Deleted cookies successfully";
    public static String deleteCookiesFail = "Unable to delete cookies";
    public static String switchWindowPass = "Switched window successfully";
    public static String switchWindowFail = "Unable to switch window";
    public static String switchFullScreenPass = "Switched to full screen successfully";
    public static String switchFullScreenFail = "Unable to switch to full screen";
    public static String switchDefaultPass = "Switched to default successfully";
    public static String switchDefaultFail = "Unable to switch to default";
    public static String switchAlertPass =	"Switched to alert successfully";
    public static String switchAlertFail = "Unable to switch to alert";
    public static String clickPass = "Clicked successfully";
    public static String clickFail = "Unable to click";
    public static String selectPass = "Selected element successfully";
    public static String deselectPass = "Selected element(s) successfully";
    public static String deselectFail = "Unable to deselect element(s)";
    public static String selectFail = "Unable to select element";
    public static String sendTextPass = "Sent text successfully";
    public static String sendTextFail = "Unable to send text";
    public static String getTextPassed = "Got text successfully";
    public static String getTextFailed = "Unable to get text";
    public static String getAttributeValuePass = "Got passed attribute value successfully";
    public static String getAttributeValueFail = "Unable to get attribute value";
    public static String getWebElementPass = "Fetched element successfully";
    public static String getWebElementFail = "Unable to get element";
    public static String getWebElementsPass = "Fetched elements successfully";
    public static String getWebElementsFail = "Unable to get elements";
    public static String getWebElementLocatorPass = "Fetched element locator successfully";
    public static String getWebElementLocatorFail = "Unable to web element locator";
    public static String waitForElementToDissapperPass="Waitiing for element to dissapper";
    public static String isPresentTrue="isPresent is true";
    public static String isPresentFalse="isPresent is false";
    public static String previousWebPagePass= "Navigated successfully to previous web page";
    public static String previousWebPageFail="Could not navigate to previous web page";
    public static String nextWebPagePass="Navigated successfully to next web page";
    public static String nextWebPageFail="Could not navigate to previous web page";
    public static String refreshWebPagePass= "Page refresh successful";
    public static String refreshWebPageFail="Could not refresh page";
    public static String switchToIframePass="Switched to iframe successfully";
    public static String switchToIframeFail="Unable to switch to iframe";
    public static String executeScriptPass="Javascript executed successfully";
    public static String executeScriptFail="Unable to execute javascript";
    public static String clickElementPass="Clicked Element successfully";
    public static String clickElementFail="Unable to click Element";
    public static String clickElementFromListPass="Clicked Element successfully";
    public static String clickElementFromListFail="Unable to click Element/Element list is empty";
    public static String mouseEventPass="Mouse event fired successfully for";
    public static String mouseEventFail="Unable to fire mouse event";
    public static String elementCountPass="Got the elements count successfully for";
    public static String elementCountFail="Unable to get elements count";
    //log messages for asserts
    public static String validPageLoadPass = "Valid web page is loaded";
    public static String validPageLoadFail = "Invalid web page is loaded";
    public static String textNotPresent = "Text not present";
    public static String elementFound = "Element found successfully";
    public static String elementNotFound = "Unable to find element";
    public static String textNotEqual = "Texts not equal";
    public static String textEqual = "Texts are equal";
    public static String textPresent = "Text present";
    public static String getWebElementPresent="Element Present";
    public static String getWebElementNotPresent="Element Not Present";


    //log messages for client applications and mobile applications
    public static String imagePathPass = "image path fetched successfully";
    public static String imagePathFail = "unable to get imagePath";
    public static String imageFound = "image found";
    public static String imageNotFound ="image not found";
    public static String clickImagePass = "clicked on image successfully";
    public static String clickImageFail ="unable to click on image";
    public static String doubleClickImagePass = "double clicked on image successfully";
    public static String doubleClickImageFail = "unable to double click on image";
    public static String rightClickImagePass = "right clicked image on successfully";
    public static String rightClickImageFail = "unable to right click on image";
    public static String closePass = "closed successfully";
    public static String closeFail = "unable to close";
    public static String pressKeyPass = "pressed key(s)";
    public static String pressKeyFail = "unable to press key(s)";
    public static String dragPass = "dragged successfully";
    public static String dragFail = "unable to drag";
    public static String dropPass = "dropped successfully";
    public static String dropFail = "unable to drop";
    public static String longPressImagePass="long pressed image successfully";
    public static String longPressImageFail="Unable to long press on an image";
    public static final String EmptyPropertySetToDefault = "empty or incorrect value,set to default value";
    public static final String EmptyProperty = "empty property,please fill the property value correctly and retry";

    public static String waitingForImageToBePresent="wait for image to be present for ";


    //log messages for mobile only
    public static String getTextPass = "found string";
    public static String getTextFail = "unable to find String";
    public static final String SimpleTapFailed = "tap failed for ";
    public static final String SimpleTapPassed = "tap passed for ";
    public static final String LongTapPassed = "long tap passed for ";
    public static final String LongTapFailed = "long tap failed for ";
    public static final String GesturePassed = "gesture passed ";
    public static final String GestureFailed = "gesture failed ";
    public static String GetWindowContextPass = "switched to window context successfully";
    public static String GetWindowContextFail = "unable to switch to window context";
    public static String GetWindowContextListPass = "Found contexts successfully";
    public static String GetWindowContextListFail = "unable to find contexts";
    public static String GetWindowURLFail = "Unable to get Window URL";
    public static String GetWindowHashCodeFail = "Unable to get Window HashCode";

    //log message for property
    public static String getFilePathPass = "fetched property file path successfully";
    public static String getFilePathFail = "unable to get property file path";
    public static String loadPropertyFilePass = "loaded property file successfully";
    public static String loadPropertyFileFail = "unable to load property file";

    //log messages for Utility
    public static String getMailPasswordPass = "temporary password retrived successfully for user";
    public static String getMailPasswordFail = "unable to retrive temproray password for user";
    public static String emptyMailBoxPass = "mail box cleaned successfully for the user";
    public static String emptyMailBoxFail = "unable to clean the mail box for user";
    public static String takeScreenShotFailed="could not take screenshot";

    //log messages for Services
    public static String requestedURI = "Complete URL :";
    public static String responseStatusCode = "Response status code :";
    public static String responseTime = "Response time is :";
    public static String responseFail = "Not getting any Response from Server ";
    public static String validStatusCodePass="Status code match";
    public static String validStatusCodeFail="Status code do not match";

    //log messages for API
    public static String validateEqualsPass = "Response contains expected value";
    public static String validateEqualsFail = "Response not contains expected value";
    public static String validateRegexPass = "Response contains expected value";
    public static String validateRegexFail = "Response not contains expected value";
    public static String getvalidKeyPassed = "Valid key passed to get the data";
    public static String getvalidKeyFailed = "Invalid key passed to get the data";

    //Ashnav Defined
    public static String orderIdMatch = "OrderID is present correctly";
    public static String noActiveElementError = "No Active Element Found";
}
