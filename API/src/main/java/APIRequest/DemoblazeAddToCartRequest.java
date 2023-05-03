package APIRequest;

public class DemoblazeAddToCartRequest {

    private String id;
    private String cookie;
    private double productID;
    private boolean flag;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCookie() {
        return cookie;
    }

    public void setCookie(String cookie) {
        this.cookie = cookie;
    }

    public double getProductID() {
        return productID;
    }

    public void setProductID(double productID) {
        this.productID = productID;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}
