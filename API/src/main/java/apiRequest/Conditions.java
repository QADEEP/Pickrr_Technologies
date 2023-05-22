package apiRequest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Conditions {
    @SerializedName("filter_options")
    @Expose
    private FilterOptions filterOptions;

    public FilterOptions getFilterOptions() {
        return filterOptions;
    }

    public void setFilterOptions(FilterOptions filterOptions) {
        this.filterOptions = filterOptions;
    }
}
