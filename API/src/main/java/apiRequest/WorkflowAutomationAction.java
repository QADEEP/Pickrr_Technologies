package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WorkflowAutomationAction {
    @SerializedName("action_type")
    @Expose
    private Integer actionType;
    @SerializedName("entity_params")
    @Expose
    private EntityParams entityParams;

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public EntityParams getEntityParams() {
        return entityParams;
    }

    public void setEntityParams(EntityParams entityParams) {
        this.entityParams = entityParams;
    }
}
