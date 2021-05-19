package takeya;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Buyer {
    Menu all = new Menu();

    public int SetDo() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("１：メニューを見る");
        System.out.println("２：現在の注文内容を確認する");
        System.out.println("３：お会計をする");
        System.out.print("？　");
        int num = 0;
        while(true) {
            try {
                String inputstr = br.readLine();
                num = Integer.parseInt(inputstr);
                if(num>=1 && num<=3) {
                    break;
                }
                else {
                    System.out.print("入力が正しくありません。再度入力してください。");
                    System.out.println(" ? ");
                }
            }
            catch(Exception ex) {
                System.out.print("入力が正しくありません。再度入力してください。");
                System.out.println(" ? ");
            }
        }
        System.out.print("\n");
        return num;
        
    }

    public int SetMenu() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("メニューを選択してください");
        System.out.println("１：メインメニュー");
        System.out.println("２：サブメニュー");
        System.out.println("３：商品一覧");
        System.out.print("？　");
        int num = 0;
        while(true) {
            try {
                String inputstr = br.readLine();
                num = Integer.parseInt(inputstr);
                if(num>=1 && num<=3) {
                    break;
                }
                else {
                    System.out.print("入力が正しくありません。再度入力してください。");
                    System.out.println(" ? ");
                }
            }
            catch(Exception ex) {
                System.out.print("入力が正しくありません。再度入力してください。");
                System.out.println(" ? ");
            }
        }
        System.out.print("\n");
        return num;
    }

    public int SetItem() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("購入したい商品の番号を入力してください");
        System.out.print("？　");
        int num = 0;
        while(true) {
            try {
                String inputstr = br.readLine();
                num = Integer.parseInt(inputstr);
                if(num>=0 && num<=all.getSize()) {
                    break;
                }
                else {
                    System.out.print("入力が正しくありません。再度入力してください。");
                    System.out.println(" ? ");
                }
            }
            catch(Exception ex) {
                System.out.print("入力が正しくありません。再度入力してください。");
                System.out.println(" ? ");
            }
        }
        System.out.print("\n");
        return num;
    }

    public int SetSIze() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("選択した商品サイズの番号を入力してください");
        System.out.println("NO.：サイズ：料金変化");
        System.out.println("１：S：−50円");
        System.out.println("２：M：料金変化なし");
        System.out.println("３：L：＋100円");
        System.out.print("？　");
        int num = 0;
        while(true) {
            try {
                String inputstr = br.readLine();
                num = Integer.parseInt(inputstr);
                if(num>=1 && num<=3) {
                    break;
                }
                else {
                    System.out.print("入力が正しくありません。再度入力してください。");
                    System.out.println(" ? ");
                }
            }
            catch(Exception ex) {
                System.out.print("入力が正しくありません。再度入力してください。");
                System.out.println(" ? ");
            }
        }
        System.out.print("\n");
        return num;
    }

    public int SetMoney() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("投入金額を入力してください");
        System.out.print("？　");
        int num = 0;
        while(true) {
            try {
                String inputstr = br.readLine();
                num = Integer.parseInt(inputstr);
                break;
            }
            catch(Exception ex) {
                System.out.print("入力が正しくありません。再度入力してください。");
                System.out.println(" ? ");
            }
        }
        System.out.print("\n");
        return num;
    }
}
