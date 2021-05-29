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