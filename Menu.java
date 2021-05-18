package takeya;

import java.util.List;
import java.util.ArrayList;

public class Menu {

    List<Product> menu = new ArrayList<Product>();
    // メニューの作成
    public void MenuList(String type) 
    {
        System.out.println(type + "メニュー");
        System.out.println("ID：商品名：価格");
        makemenu();
        for (int cnt = 0; cnt < menu.size(); cnt++) 
        {
            System.out.println(cnt+ "：" + menu.get(cnt).getName() + "：" + menu.get(cnt).getPrice() + "円");
        }
    }

    // 商品リストの作成
    public List<Product> makemenu() 
    {
        menu.clear();
        Product list1 = new Product(1,"牛丼", 380);  
        Product list2 = new Product(1,"豚丼", 400); 
        Product list3 = new Product(1,"カレー", 450); 
        Product list4 = new Product(2,"ポテトサラダ", 200);  
        Product list5 = new Product(2,"グリーンサラダ", 150); 
        Product list6 = new Product(2,"味噌汁", 50); 
        Product list7 = new Product(2,"豚汁", 150); 
        menu.add(list1);
        menu.add(list2);
        menu.add(list3);
        menu.add(list4);
        menu.add(list5);
        menu.add(list6);
        menu.add(list7);
        return menu;
    }

    public int getNum(int num)
    {
        int number = menu.get(num).getNum();
        return number;
    }

    public String getName(int num)
    {
        String name = menu.get(num).getName();
        return name;
    }

    public int getPrice(int num)
    {
        int price = menu.get(num).getPrice();
        return price;
    }

    public int getSize()
    {
        makemenu();
        int num = menu.size();
        return num;
    }

}