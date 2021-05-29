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