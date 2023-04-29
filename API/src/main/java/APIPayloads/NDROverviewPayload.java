package APIPayloads;

import APIRequest.NdrOverview;

public class NDROverviewPayload {

    public static NdrOverview verifyNdrOverview(){
        NdrOverview ndrOverview=new NdrOverview();
        ndrOverview.setStartDate("23-04-2023");
        ndrOverview.setEndDate("29-04-2023");
        ndrOverview.setPageNumber(0);
        ndrOverview.setPageLimit(20);
       // ndrOverview.setNdrReason();
        return ndrOverview;
    }
}
