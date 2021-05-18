package takeya;

import java.util.List;
import java.util.ArrayList;

public class BuyItem 
{
    public int main_buy = 0;
    public int price_sum = 0;
    List<BuyProduct> buy_menu = new ArrayList<BuyProduct>();

    public int buy_cnt=0;
    public void addBuyItem(String name, int price, String size)
    {
        if(size != null)
        {
            BuyProduct buy_list = new BuyProduct(name, price, size);
            buy_menu.add(buy_list);
            main_buy++;
        }
        else
        {
            BuyProduct buy_list = new BuyProduct(name, price, null);
            buy_menu.add(buy_list);
        }
        buy_cnt++;
    }

    public void getBuyItem()
    {
        price_sum = 0;
        System.out.println("商品名：価格：サイズ");
        for (int cnt = 0; cnt < buy_menu.size(); cnt++) 
        {
            if(buy_menu.get(cnt).getSize() != null)
            {
                if(buy_menu.get(cnt).getSize().equals("S"))
                {
                    System.out.println(buy_menu.get(cnt).getName() + "：" + (buy_menu.get(cnt).getPrice()-50) + "円："+ buy_menu.get(cnt).getSize());
                    price_sum += buy_menu.get(cnt).getPrice()-50;
                }
                else if(buy_menu.get(cnt).getSize().equals("M"))
                {
                    System.out.println(buy_menu.get(cnt).getName() + "：" + buy_menu.get(cnt).getPrice() + "円："+ buy_menu.get(cnt).getSize());
                    price_sum += buy_menu.get(cnt).getPrice();
                }
                else if(buy_menu.get(cnt).getSize().equals("L"))
                {
                    System.out.println(buy_menu.get(cnt).getName() + "：" + (buy_menu.get(cnt).getPrice()+100) + "円："+ buy_menu.get(cnt).getSize());
                    price_sum += buy_menu.get(cnt).getPrice()+100;
                }
                
            }
            else
            {
                System.out.println(buy_menu.get(cnt).getName() + "：" + buy_menu.get(cnt).getPrice() + "円");
                price_sum += buy_menu.get(cnt).getPrice();
            }
            
        }
        System.out.println("合計金額：" + price_sum +"円\n");
    }


}
