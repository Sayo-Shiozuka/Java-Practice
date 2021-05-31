// 3-1 天気による行動の変化をJavaで表す
public class Main {
  public static void main(String[] args){
    boolean tenki = true;
    if (tenki == true) {
      System.out.println("洗濯をします");
      System.out.println("散歩にいきます");
    } else {
      System.out.println("DVDを見ます")
    }
  }
}

//3-2 トイレの空きを待つ繰り返し処理
public class Main {
  public static void main(String[] args){
    boolean doorClose = true;　　//ここでtrueかfalseを代入
    while (doorClose == true) {  //ドアが閉まっている間は
      System.out.println("ノックする");
      System.out.println("1分待つ");
    }
  }
}

//3-3 波カッコを省略した記述
public class Main {
  public static void main(String[] args){
    boolean tenki = true;
    if (tenki == true){   //内容が2行なので波カッコは省略不可能
      System.out.println("洗濯をします");
      System.out.println("散歩にいきます");
    }else     //1行しかないので波カッコは省略可能
    System.out.println("DVDを見ます")
  }
}

//3-4 冗長でスッキリしないソースコード
public class Main {
  public static void main(String[] args){
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(4) + 1
    if (fortune == 1){
      System.out.println("大吉");
    }else if (fortune == 2){
      System.out.println("中吉");
    }else if (fortune == 3) {
      System.out.println("吉");
    }else {
      System.out.println("凶");
    }
  }
}

//3-5 break文を忘れると...
public class Main {
  public static void main(String[] args){
    System.out.println("あなたの運勢を占います");
    int fortune = 1;
    switch (fortune){
      case 1:
        system.out.println("大吉");
        //ここにbreak;を入れ忘れている
      case 2:
        system.out.println("中吉");
      break;
      case 3:
        system.out.println("吉");
      break;
      default:
        system.out.println("凶");
    }
  }
}

//3-6 あえてbreak文を書かない
public class Main{
  public static void main(String[] args){
    System.out.println("あなたの運勢を占います");
    int fortune = new java.util.Random().nextInt(5) + 1;
    switch (fortune) {
      case 1:
      case 2:     //fortuneが1か2なら
        System.out.println("いいね！");
        break;
      case 3:
        System.out.println("普通です");
        break;
      case 4:
      case 5:
        System.out.println("うーん...");
    }
  }
}

//3-7 基本的なfor文
public class Main{
  public static void main(String[] args){
    for (int i = 0; i < 10; i++){
      System.out.println("こんにちは");
    }
  }
}

//3-8 for文のループ変数iの内容を表示する
public class Main{
  public static void main(String[] args){
    for (int i = 0; i < 3; i++){
      System.out.print("現在" + (i + 1) + "週目→");
    }
  }
}

//3-9 for文のループを2重にして九九の表を出力する
public class Main{
  public static void main(String[] args){
    for (int = i; i < 10; i++){
      for (int j = 1; j < 10; j++){
        System.out.print(i * j);  //掛け算の結果を出力
        System.out.print(" ")   //空白を出力
      }
      System.out.println("");   //改行を出力
    }
  }
}

// 練習3-3
public class Main {
  public static void main(String[] args){
  int isHungry = 1;
  String food = "おにぎり";
  System.out.println("こんにちは");
    if (isHungry== 0){
      System.out.println("お腹がいっぱいです")
    } else { 
      System.out.println("はらぺこです");
    }
    if (isHungry== 1){
      System.out.println(food + "をいただきます");
    }
    System.out.println("ごちそうさまでした")
  }
}

// 練習3-5
public class Main {
  public static void main(String[] args){
    System.out.print
      ("[メニュー] 1 : 検索 2 : 登録 3:  削除 4 : 変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
      case 3:
        System.out.println("削除します");
      case 4:
        System.out.println("変更します");
      break;
    }
  }
}

//練習3-6
public class Main {
  public static void main(String[] args){
    System.out.print("【数あてゲーム】");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 0; i < 5; i++){
      System.out.println("0~9の数字を入力してください");
      int num = new.java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("アタリ！");
      break;
      } else {
        System.out.println("違います");
      }
    }
    System.out.println("ゲームを終了します")
  }
}