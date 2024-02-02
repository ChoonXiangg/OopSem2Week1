package ie.atu.Productv5;

public class TV extends Product {
    private double price;
    private String description;
    private String code;
    private double size;
    private String manufacturer;
    public TV(){
        price=0.0;
        description="";
        code="";
        size=0.0;
        manufacturer="";
    }public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public String toString() {
        return description+" by "+manufacturer;
    }
}