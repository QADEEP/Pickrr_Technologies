package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EntityParams {
    @SerializedName("model")
    @Expose
    private String model;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("owner")
    @Expose
    private String owner;
    @SerializedName("due_date")
    @Expose
    private DueDate dueDate;
    @SerializedName("related_to")
    @Expose
    private String relatedTo;
    @SerializedName("collaborators")
    @Expose
    private Collaborators collaborators;
    @SerializedName("status")
    @Expose
    private Integer status;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public DueDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(DueDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getRelatedTo() {
        return relatedTo;
    }

    public void setRelatedTo(String relatedTo) {
        this.relatedTo = relatedTo;
    }

    public Collaborators getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Collaborators collaborators) {
        this.collaborators = collaborators;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
