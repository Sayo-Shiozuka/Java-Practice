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

// 2-9 文字列の連結
public class Main {
  public static void main(String[] args){
    String msg = "私の年齢は" + 23;
    System.out.println(msg);
  }
}

// 2-10 命令実行の分（画面に表示する）
public class Main{
  public static void main(Stirng[] args){
    String name = "すがわら";
    String message;
    message = name + "さん、こんにちは";
    System.out.println(message);
  }
}

// 2-11 改行なし画面出力の命令
public class Main{
  public static void main(String[] args){
    String name = "すがわら";
    System.out.println("私の名前は");
    System.out.println(name);
    System.out.print("です");
  }
}

// 2-12 大きいほうの数値を代入する命令
public class Main{
  public static void main(String[] args){
    int a = 5;
    int b = 3;
    int m = Math.max(a, b);
    System.out.println("比較実験：" + a + "と" + b + "とで大きいほうは･･･" + m);
  }
}

// 2-13 String型をint型に変換する命令
public class Main {
  public static void main(String[] args){
    String age = "31";
    int n = Integer.parseInt(age);  //ageは数値として解釈させたい文字列
    System.out.println
      ("あなたは来年、" + (n + 1) + "歳になりますね。");
  }
}

//2-14 ランダムな数を生成する命令
public class Main{
  public static void main(String[] args){
    int r = new java.util.Random().nextInt(90);   //90は発生させる乱数の上限値
    System.out.println("あなたはたぶん、" + r + "歳ですよね？")
  }
}

// 2-15 キーボードから入力を受け付ける命令
public class Main {
  public static void main(String[] args){
    System.out.println("あなたの名前を入力してください。");
    String name = new java.util.Scanner(System.in).nextLine();  //キーボードから１行の文字列の入力を受け付ける
    System.out.println("あなたの年齢を入力してください。");
    int age = new java.util.Scanner(System.in).nextInt();　　//キーボードから1つの整数の入力を受け付ける
    System.out.println
        ("ようこそ、" + age  "歳の" + name + "さん");
  }
}

練習問題 2-3
public class Main{
  public static void main(String[] args){
    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を入力してください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("あなたの年齢を入力してください")
    String ageString = 
        new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果がでました！")
    System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
    System.out.println("1: 大吉 2: 中吉 3:吉 4:凶");
  }
}