package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FilterOptions {
    @SerializedName("block_operator")
    @Expose
    private String blockOperator;
    @SerializedName("filter_rules")
    @Expose
    private FilterRules filterRules;

    public String getBlockOperator() {
        return blockOperator;
    }

    public void setBlockOperator(String blockOperator) {
        this.blockOperator = blockOperator;
    }

    public FilterRules getFilterRules() {
        return filterRules;
    }

    public void setFilterRules(FilterRules filterRules) {
        this.filterRules = filterRules;
    }
}
