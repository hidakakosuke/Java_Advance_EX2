package takeya;


public class MainMenu extends Menu{
    //商品リストの作成
    public void MenuList(String type) {
        System.out.println(type + "メニュー");
        System.out.println("ID：商品名：価格");
        makemenu();
        for (int cnt = 0; cnt < menu.size(); cnt++) {
            if(menu.get(cnt).getNum() == 1) {
                System.out.println(cnt+ "：" + menu.get(cnt).getName() + "：" + menu.get(cnt).getPrice() + "円");
            }
        }
        System.out.print("\n");
    }
}
