package takeya;

public class Product {
    private String name;//商品名
    private int price;//価格
    private int num;//メインかサブかの仕分け

    public Product(int num, String name, int price) {
        this.name = name;
        this.price = price;
        this.num = num;
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public int getNum() {
        return this.num;
    }
}
