public class Candy extends Product {
    public Candy(String name, double price,String type, String flavor) {
        super(name, price);
        this.type="rock";
        this.flavor="rock";
    }
    

    private String type;
    private String flavor;


    public String getType() {
        return type;
    }

    public String getFlavor() {
        return flavor;
    }
    public String toString() {
        return String.format("%s - %s - %s", super.toString(), type, flavor);
    }
}
