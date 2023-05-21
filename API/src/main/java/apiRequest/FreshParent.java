package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FreshParent {
    @SerializedName("workflow_automation")
    @Expose
    private WorkflowAutomation workflowAutomation;

    public WorkflowAutomation getWorkflowAutomation() {
        return workflowAutomation;
    }

    public void setWorkflowAutomation(WorkflowAutomation workflowAutomation) {
        this.workflowAutomation = workflowAutomation;
    }
}
