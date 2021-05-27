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

// 2-4 インクリメント演算子
public class Main {
  public static void main(Stirng[] args){
    int a;
    a = 100;
    a++; //aの内容が1増える
    System.out,println(a);
  }
}

// 2-5 値より大きな型の変数に代入
public class Main {
  public static void main(String[] args){
    float f = 3;  //float型にint型を代入
    double d = f;   //double型の変数にfloat型を代入
    System.out.println(f);
    System.out.println(d);
  }
}

// 2-6 データより小さな型の変数に代入（エラー）
public class Main{
  public static void main(String[] args){
    int i = 3.2; //小数点以下がエラーになる
  }
}

//2-7 強制的な型変換
public class Main{
  public static void main(String[] args){
    int age = (int)3.2; //3.2をintに型変換して代入せよと強制的変換
    System.out.println(age);　//小数点以下の情報は失われれる
  }
}

// 2-8 事なる型同士の算術演算
public class Main {
  public static void main(String[] args){
    double d = 8.5 / 2; 　//2(int型)を2.0(double型)に変換
    long 1 = 5 + 2L;    //5(int型)を5L(long型)に変換
  }
}

2-9 文字列の連結
public class Main {
  public static void main(String[] args){
    String msg = "私の年齢は" + 23;
    System.out.println(msg);
  }
}