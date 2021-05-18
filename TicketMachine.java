package takeya;

public class TicketMachine 
{
    Buyer buyer = new Buyer();
    Menu main = new MainMenu();
    Menu sub = new SubMenu();
    Menu all = new Menu();
    BuyItem item = new BuyItem();
    
    public void StartBuy()
    {
        System.out.println("いらっしゃいませ！竹屋へようこそ！\n");
        SelectMenu();
    }

    public void SelectMenu()
    {
        System.out.println("何を行いますか？");
        int num = buyer.SetDo();
        if(num == 1) //メニューを見る
        {
            DoMenu();
        }
        else if(num == 2) //現在の注文内容を確認する
        {
            DoCheck();
        }
        else if(num == 3) //お会計
        {
            DoBuy();
        }
    }

    public void DoMenu()
    {
        int num = buyer.SetMenu();
        if(num==1)
        {
            main.MenuList("メイン");
        }
        else if(num==2)
        {
            sub.MenuList("サブ");
        }
        else if(num==3)
        {
            all.MenuList("一覧");
        }
        int buy_num = buyer.SetItem();
        Menu[] menu = {null,main, sub, all};
        Menu menu_num = menu[num];
        String[] size = {null, "S", "M", "L"};
        int size_num;
        if(menu_num.getNum(buy_num) == 1)
        {
            size_num = buyer.SetSIze();
        }
        else
        {
            size_num = 0;
        }

        item.addBuyItem(menu_num.getName(buy_num), menu_num.getPrice(buy_num), size[size_num]);
        System.out.println(menu_num.getName(buy_num) + "を追加しました。\n");

        SelectMenu();
    }

    public void DoCheck()
    {
        item.getBuyItem();
        SelectMenu();
    }

    public void DoBuy()
    {
        if(item.main_buy >= 1)
        {
            item.getBuyItem();
            while(true)
            {
                System.out.println(item.price_sum + "円頂戴いたします\n");
                int money = buyer.SetMoney();
                if(item.price_sum - money > 0)
                {
                    System.out.println("投入金額が足りません。再度入力してください");
                }
                else if(money - item.price_sum >= 0)
                {
                    System.out.println(money - item.price_sum + "円のお返しです。ありがとうございました！");
                    break;
                }
            }
        }
        else
        {
            System.out.println("メインメニューから１つ以上商品をご購入ください。\n");
            SelectMenu();
        }
        
    }
}
