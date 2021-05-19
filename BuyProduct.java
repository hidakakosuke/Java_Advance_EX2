package takeya;

public class BuyProduct {
    private String name;
    private int price;
    private String size;

    public BuyProduct(String name, int price, String size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public String getSize() {
        return this.size;
    }
}
