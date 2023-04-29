package APIRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NdrOverview {
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("page_number")
    @Expose
    private Integer pageNumber;
    @SerializedName("page_limit")
    @Expose
    private Integer pageLimit;
    @SerializedName("ndr_reason")
    @Expose
    private List<String> ndrReason;
    @SerializedName("courier_name")
    @Expose
    private String courierName;
    @SerializedName("status")
    @Expose
    private List<String> status;
    @SerializedName("action_status")
    @Expose
    private String actionStatus;
    @SerializedName("escalation_status")
    @Expose
    private List<String> escalationStatus;
    @SerializedName("is_placed_date_filter")
    @Expose
    private Boolean isPlacedDateFilter;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageLimit() {
        return pageLimit;
    }

    public void setPageLimit(Integer pageLimit) {
        this.pageLimit = pageLimit;
    }

    public List<String> getNdrReason() {
        return ndrReason;
    }

    public void setNdrReason(List<String> ndrReason) {
        this.ndrReason = ndrReason;
    }

    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    public List<String> getStatus() {
        return status;
    }

    public void setStatus(List<String> status) {
        this.status = status;
    }

    public Object getActionStatus() {
        return actionStatus;
    }

    public void setActionStatus(String actionStatus) {
        this.actionStatus = actionStatus;
    }

    public List<String> getEscalationStatus() {
        return escalationStatus;
    }

    public void setEscalationStatus(List<String> escalationStatus) {
        this.escalationStatus = escalationStatus;
    }

    public Boolean getIsPlacedDateFilter() {
        return isPlacedDateFilter;
    }

    public void setIsPlacedDateFilter(Boolean isPlacedDateFilter) {
        this.isPlacedDateFilter = isPlacedDateFilter;
    }
}
