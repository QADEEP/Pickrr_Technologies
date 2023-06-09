package apiPayloads;

import apiRequest.NdrOverview;

import java.util.ArrayList;
import java.util.List;

public class NDROverviewPayload  implements NDRReasons{

    public static NdrOverview verifyNdrOverview(){
        NdrOverview ndrOverview=new NdrOverview();
        ndrOverview.setStartDate("23-04-2023");
        ndrOverview.setEndDate("29-04-2023");
        ndrOverview.setPageNumber(0);
        ndrOverview.setPageLimit(20);
        ndrOverview.setNdrReason(ndrReasonList());
        ndrOverview.setCourierName("");
        return ndrOverview;
    }

    public static List<String> ndrReasonList(){
        List<String>  arrayList=new ArrayList<>();
        arrayList.add(CNF);
        arrayList.add(CNF1);
        return arrayList;
    }
}
