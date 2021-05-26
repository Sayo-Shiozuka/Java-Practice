// 2-1 変数宣言の文と計算の文
public class Main {
  public static void main(String[] args){
    int a;
    int b;
    a = 20;
    b = a + 5;
    System.out.println(a);
    System.out.println(b);
  }
}

// 2-2 エスケープシーケンスを用いていない例（エラー）
public class Main {
  public static void main(String[] args){
    System.out.println("私の好きな記号は二重引用符(")"); //文字列とみなされる部分が変になる
  }
}

// 2-3 エスケープシーケンスを用いた例
public class Main {
  public static void main (String[] args){
    System.out.println("私の好きな記号は二重引用符(¥")です"); //¥"によって二重引用符は文字とみなされる
  }
}

