package takeya;

public class BuyProduct
{
    private String name_;
    private int price_;
    private String size_;

    public BuyProduct(String name, int price, String size)
    {
        name_ = name;
        price_ = price;
        size_ = size;
    }

    public String getName()
    {
        return name_;
    }

    public int getPrice()
    {
        return price_;
    }

    public String getSize()
    {
        return size_;
    }
}
