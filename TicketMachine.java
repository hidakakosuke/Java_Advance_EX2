package takeya;

public class TicketMachine {
    Buyer buyer = new Buyer();
    Menu main = new MainMenu();
    Menu sub = new SubMenu();
    Menu all = new Menu();
    BuyItem item = new BuyItem();
    
    public void StartBuy() {
        System.out.println("いらっしゃいませ！竹屋へようこそ！\n");
        SelectMenu();
    }

    public void SelectMenu() {
        System.out.println("何を行いますか？");
        int num = buyer.SetDo();
        if(num == 1) {  //メニューを見る
            DoMenu();
        }
        else if(num == 2) {  //現在の注文内容を確認する
            DoCheck();
        }
        else if(num == 3) {  //お会計
            DoBuy();
        }
    }

    public void DoMenu() {
        int num = buyer.SetMenu();
        if(num==1) {
            main.MenuList("メイン");
        }
        else if(num==2) {
            sub.MenuList("サブ");
        }
        else if(num==3) {
            all.MenuList("一覧");
        }
        int buyNum = buyer.SetItem();
        Menu[] menu = {null,main, sub, all};
        Menu menuNum = menu[num];
        String[] size = {null, "S", "M", "L"};
        int sizeNum;
        if(menuNum.getNum(buyNum) == 1) {
            sizeNum = buyer.SetSIze();
        }
        else {
            sizeNum = 0;
        }

        item.addBuyItem(menuNum.getName(buyNum), menuNum.getPrice(buyNum), size[sizeNum]);
        System.out.println(menuNum.getName(buyNum) + "を追加しました。\n");

        SelectMenu();
    }

    public void DoCheck() {
        item.getBuyItem();
        SelectMenu();
    }

    public void DoBuy() {
        if(item.mainBuy >= 1) {
            item.getBuyItem();
            while(true) {
                System.out.println(item.priceSum + "円頂戴いたします\n");
                int money = buyer.SetMoney();
                if(item.priceSum - money > 0) {
                    System.out.println("投入金額が足りません。再度入力してください");
                }
                else if(money - item.priceSum >= 0) {
                    System.out.println(money - item.priceSum + "円のお返しです。ありがとうございました！");
                    break;
                }
            }
        }
        else {
            System.out.println("メインメニューから１つ以上商品をご購入ください。\n");
            SelectMenu();
        }
        
    }
}
