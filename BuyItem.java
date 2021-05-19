package takeya;

import java.util.List;
import java.util.ArrayList;

public class BuyItem {
    public int mainBuy = 0;
    public int priceSum = 0;
    List<BuyProduct> buyMenu = new ArrayList<BuyProduct>();

    public int buy_cnt=0;
    public void addBuyItem(String name, int price, String size) {
        if(size != null) {
            BuyProduct buyList = new BuyProduct(name, price, size);
            buyMenu.add(buyList);
            mainBuy++;
        }
        else {
            BuyProduct buyList = new BuyProduct(name, price, null);
            buyMenu.add(buyList);
        }
        buy_cnt++;
    }

    public void getBuyItem() {
        priceSum = 0;
        System.out.println("商品名：価格：サイズ");
        for (int cnt = 0; cnt < buyMenu.size(); cnt++) {
            if(buyMenu.get(cnt).getSize() != null) {
                if(buyMenu.get(cnt).getSize().equals("S"))
                {
                    System.out.println(buyMenu.get(cnt).getName() + "：" + (buyMenu.get(cnt).getPrice()-50) + "円："+ buyMenu.get(cnt).getSize());
                    priceSum += buyMenu.get(cnt).getPrice()-50;
                }
                else if(buyMenu.get(cnt).getSize().equals("M")) {
                    System.out.println(buyMenu.get(cnt).getName() + "：" + buyMenu.get(cnt).getPrice() + "円："+ buyMenu.get(cnt).getSize());
                    priceSum += buyMenu.get(cnt).getPrice();
                }
                else if(buyMenu.get(cnt).getSize().equals("L")) {
                    System.out.println(buyMenu.get(cnt).getName() + "：" + (buyMenu.get(cnt).getPrice()+100) + "円："+ buyMenu.get(cnt).getSize());
                    priceSum += buyMenu.get(cnt).getPrice()+100;
                }
                
            }
            else {
                System.out.println(buyMenu.get(cnt).getName() + "：" + buyMenu.get(cnt).getPrice() + "円");
                priceSum += buyMenu.get(cnt).getPrice();
            }
            
        }
        System.out.println("合計金額：" + priceSum +"円\n");
    }


}
