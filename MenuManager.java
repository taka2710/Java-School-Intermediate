import java.util.ArrayList;
import java.util.HashMap;

public class MenuManager {
    // ここにフィールドを追加します。
    HashMap<String, ArrayList<String>> map = new HashMap<>();
    // コンストラクタ
    MenuManager(){
        // サンドイッチメニューの登録
        ArrayList<String> list = new ArrayList<>();
        list.add("ハンバーガー");
        list.add("チーズバーガー");
        list.add("ダブルチーズバーガー");
        map.put("sandwitch",list);
        //ドリンクメニューの登録
        list = new ArrayList<>();
        list.add("コーラ");
        list.add("オレンジジュース");
        list.add("コーヒー");
        map.put("drink",list);
        //サイドメニューの登録
        list = new ArrayList<>();
        list.add("フライドポテト");
        list.add("チキンナゲット");
        list.add("アップルパイ");
        map.put("sidemenu",list);
    }

    // ここにsearchMenuを作成します。
    public void searchMenu(String menu) {
        ArrayList<String> list = new ArrayList<String>(map.keySet());
        ArrayList<String> checklist1 = new ArrayList<String>(map.get(list.get(0)));
        ArrayList<String> checklist2 = new ArrayList<String>(map.get(list.get(1)));
        ArrayList<String> checklist3 = new ArrayList<String>(map.get(list.get(2)));
        boolean contains1 = checklist1.contains(menu);
        boolean contains2 = checklist2.contains(menu);
        boolean contains3 = checklist3.contains(menu);
        if (contains1 == true){
            System.out.println(menu + "は" + list.get(0) + "に含まれています。");
        }
        else if (contains2 == true){
            System.out.println(menu + "は" + list.get(1) + "に含まれています。");
        }
        else if (contains3 == true){
            System.out.println(menu + "は" + list.get(2) + "に含まれています。");
        }
        else { 
            System.out.println("該当するメニューはありません。");
        }
    }
    // ここにsetMenuを作成します。
    public void setMenu(String category, String menu) {
        ArrayList<String> mlist = new ArrayList<String>(map.get(category));
        mlist.add(menu);
        map.put(category, mlist);
    }
    // ここにshowMenuを作成します。
    public void showMenu(String category) {
        System.out.println(map.get(category));
    }
}
