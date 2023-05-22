package apiPayloads;

import apiRequest.*;

public class FreshworkPayload {

    static FreshParent freshParent;
    public static FreshParent setbody(){
        freshParent=new FreshParent();
        WorkflowAutomation workflowAutomation=new WorkflowAutomation();
        freshParent.setWorkflowAutomation(workflowAutomation);
        workflowAutomation.setName("Whenever contact is added, add task");
        workflowAutomation.setCategory(2);
        workflowAutomation.setDescription(null);
        workflowAutomation.setCriteria(1);
        workflowAutomation.setPosition(null);
        workflowAutomation.setStatus(1);
        workflowAutomation.setScheduleInterval(0);
        workflowAutomation.setExecutionType(1);
        //workflowAutomation.setDeletableActionIds();
        workflowAutomation.setTemplateId("14");
        //workflowAutomation.setConditions();
        //workflowAutomation.setWorkflowAutomationActions();
        workflowAutomation.setSchedule(null);
        workflowAutomation.setUpdaterId(null);
        WorkflowAutomationAction workflowAutomationAction=new WorkflowAutomationAction();
        workflowAutomationAction.setActionType(7);
//        workflowAutomationAction.setActionType();
//        freshParent.setWorkflowAutomation();
//        FilterOptions filterOptions=new FilterOptions();
//        filterOptions.setBlockOperator();
//        filterOptions.setFilterRules();
//        EntityParams entityParams=new EntityParams();
//        entityParams.setModel();
//        entityParams.setDueDate();
//        entityParams.setTitle();
//        entityParams.setRelatedTo();
//        entityParams.setOwner();
//        entityParams.setStatus();
//        entityParams.setCollaborators();
//        DueDate dueDate=new DueDate();
//        dueDate.setDuration();
//        dueDate.setExecution();
//        dueDate.setField();
//        dueDate.setDurationCategory();
//        dueDate.setTime();
//        Conditions conditions=new Conditions();
//        conditions.setFilterOptions();

        return freshParent;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println(b);
    }
}
