package takeya;

public class Product 
{
    private String name_;//商品名
    private int price_;//価格
    private int num_;//メインかサブかの仕分け

    public Product(int num, String name, int price)
    {
        name_ = name;
        price_ = price;
        num_ = num;
    }

    public String getName()
    {
        return name_;
    }

    public int getPrice()
    {
        return price_;
    }

    public int getNum()
    {
        return num_;
    }
}
