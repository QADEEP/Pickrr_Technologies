package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DueDate {
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("duration_category")
    @Expose
    private String durationCategory;
    @SerializedName("execution")
    @Expose
    private String execution;
    @SerializedName("field")
    @Expose
    private String field;
    @SerializedName("time")
    @Expose
    private String time;

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDurationCategory() {
        return durationCategory;
    }

    public void setDurationCategory(String durationCategory) {
        this.durationCategory = durationCategory;
    }

    public String getExecution() {
        return execution;
    }

    public void setExecution(String execution) {
        this.execution = execution;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}
