package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WorkflowAutomation {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("description")
    @Expose
    private Object description;
    @SerializedName("category")
    @Expose
    private Integer category;
    @SerializedName("criteria")
    @Expose
    private Integer criteria;
    @SerializedName("position")
    @Expose
    private Object position;
    @SerializedName("status")
    @Expose
    private Integer status;
    @SerializedName("schedule_interval")
    @Expose
    private Integer scheduleInterval;
    @SerializedName("execution_type")
    @Expose
    private Integer executionType;
    @SerializedName("deletable_action_ids")
    @Expose
    private List<Object> deletableActionIds;
    @SerializedName("template_id")
    @Expose
    private String templateId;
    @SerializedName("conditions")
    @Expose
    private Conditions conditions;
    @SerializedName("workflow_automation_actions")
    @Expose
    private List<WorkflowAutomationAction> workflowAutomationActions;
    @SerializedName("schedule")
    @Expose
    private Object schedule;
    @SerializedName("updater_id")
    @Expose
    private Object updaterId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public Integer getCriteria() {
        return criteria;
    }

    public void setCriteria(Integer criteria) {
        this.criteria = criteria;
    }

    public Object getPosition() {
        return position;
    }

    public void setPosition(Object position) {
        this.position = position;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getScheduleInterval() {
        return scheduleInterval;
    }

    public void setScheduleInterval(Integer scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public Integer getExecutionType() {
        return executionType;
    }

    public void setExecutionType(Integer executionType) {
        this.executionType = executionType;
    }

    public List<Object> getDeletableActionIds() {
        return deletableActionIds;
    }

    public void setDeletableActionIds(List<Object> deletableActionIds) {
        this.deletableActionIds = deletableActionIds;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public List<WorkflowAutomationAction> getWorkflowAutomationActions() {
        return workflowAutomationActions;
    }

    public void setWorkflowAutomationActions(List<WorkflowAutomationAction> workflowAutomationActions) {
        this.workflowAutomationActions = workflowAutomationActions;
    }

    public Object getSchedule() {
        return schedule;
    }

    public void setSchedule(Object schedule) {
        this.schedule = schedule;
    }

    public Object getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(Object updaterId) {
        this.updaterId = updaterId;
    }

}
