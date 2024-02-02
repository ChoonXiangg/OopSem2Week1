package ie.atu.Productv5;

public class Music extends Product {
    private double price;
    private String description;
    private String code;
    private String artist;
    private String label;
    public Music(){
        price=0.0;
        description="";
        code="";
        artist="";
        label="";
    }
    public double getPrice() {
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    public String toString(){return description+" by "+artist;}
}