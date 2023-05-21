//package utils;
//
//import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
//import com.google.api.client.http.javanet.NetHttpTransport;
//import com.google.api.services.sheets.v4.Sheets;
//import com.google.api.services.sheets.v4.model.ValueRange;
//import org.testng.annotations.DataProvider;
//
//import java.util.List;
//
//import static utils.SheetsQuickstart.JSON_FACTORY;
//import static utils.SheetsQuickstart.getCredentials;
//
//public class Dataprovider {
//    @DataProvider(name = "getDifferentCourierCodes")
//    public Object[][] getDifferentCourierCodes() throws Exception {
//        {
//            // Build a new authorized API client service.
//            final NetHttpTransport HTTP_TRANSPORT = GoogleNetHttpTransport.newTrustedTransport();
//            final String spreadsheetId = "1cER2cr3kTUlN55EKNd28PMdGQFqNLY_DTgtvvp3ICic";
//            final String range = "TestDataSheet!A2:B";
//            Sheets service =
//                    new Sheets.Builder(HTTP_TRANSPORT, JSON_FACTORY, getCredentials(HTTP_TRANSPORT))
//                            .setApplicationName(APPLICATION_NAME)
//                            .build();
//            ValueRange response = service.spreadsheets().values()
//                    .get(spreadsheetId, range)
//                    .execute();
//            List<List<Object>> values = response.getValues();
//            if (values == null || values.isEmpty()) {
//                System.out.println("No data found.");
//            } else {
//                // System.out.println("Name, Major");
//                for (List row : values) {
//                    System.out.printf("%s, %s\n", row.get(0), row.get(1));
//                }
//            }
//        }
//        return listOfList.stream().map(l -> l.stream().toArray(String[]::new)).toArray(String[][]::new);
//}
//}
