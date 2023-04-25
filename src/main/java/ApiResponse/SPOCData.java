package ApiResponse;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SPOCData {
    @SerializedName("auto_secure_shipments")
    @Expose
    private Boolean autoSecureShipments;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("address")
    @Expose
    private SPOCAddress address;
    @SerializedName("email")
    @Expose
    private String email;

    public Boolean getAutoSecureShipments() {
        return autoSecureShipments;
    }

    public void setAutoSecureShipments(Boolean autoSecureShipments) {
        this.autoSecureShipments = autoSecureShipments;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public SPOCAddress getAddress() {
        return address;
    }

    public void setAddress(SPOCAddress address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
