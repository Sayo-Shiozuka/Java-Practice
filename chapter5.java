// 5-1 シンプルなメソッドの定義
public class Main{
  public static void hello() {
    System.out.println("湊さん、こんにちは");
  }
}

// 5-2 メソッドの呼び出し
public class Main {
  public static void main(String[] args){
    System.out.println("メソッドを呼び出します");
    hello();
    System.out.println("メソッドの呼び出しが終わりました");
  }
  public static void hello() {
    System.out.println("湊さん、こんにちは");
  }
}

//5-3 mainメソッド以外からメソッドを呼び出す
public class Main {
  public static void methodA(){
    System.out.println("methodA");
    methodB();
  }
  public static void methodB(){
    System.out.println("methodB");
  }
  public static void main(String[] args){
    methodA();
  }
}

//5-4 引数の例(渡す値が1つの場合)
public class Main {
  public static void main(String[] args){
    System.out.println("メソッドを呼び出します")
    hello("湊");
    hello("朝香");
    hello("菅原");
    System.out.println("メソッドの呼び出しが終わりました")
  }
  public static void hello(String name){
    System.out.println(name + "さん、こんにちは");
  }
}

//5-5 引数の例(渡す値が複数の場合)
public class Main{
  public static void main(String[] args){
    add(100, 20);
    add(200, 50);
  }
  //複数の値を受け取るaddメソッド
  public static void add(int x, int y){
    int ans = x + y;
    System.out.println(x + "y" + y + "=" + ans);
  }
}

//5-6 引数を使わずに値を渡せないのか？(エラー)
  //mainメソッド内で宣言した変数xとyは、mainメソッドのブロックの中でしか使用できない為エラーになる
public class Main {
  public static void main(String[] args){
    int x = 100;
    int y = 10;
    add();
  }
  public static void add() {
    int ans = x + y;
    System.out.println(x + "+" + y + "=" + ans);
  }
}

//5-7 戻り値の例
public class Main {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args){
    int ans = add(100, 10);
    System.out,println("100 + 10 = " + ans);
  }
}

//5-8 戻り値をそのまま使う
public class Main {
  public static int add(int x, int y) {
    int ans = x + y;
    return ans;
  }
  public static void main(String[] args){
    System.out.println(add(add(10, 20), add(30, 40)));
  }
}

//5-9 return文の後に処理は書けない(エラー)
public static int sample() {
  //・・・
  return 1;
  int x = 10; //この文が実行されることはないのでコンパイルエラーになる
}

//5-10 オーバーロード(引数の型が異なる場合)
public class Main {
  //1つ目のaddメソッド
  public static int add(int x, int y) {
    return x + y;
  }
  //2つ目のaddメソッド
  public static double add(double x, double y){
    return x + y;
  }
  //3つ目のaddメソッド
  public static String add(String x, String y) {
    return x + y;
  }
  public static void main(String[] args){
    System.out.println(add(10, 20));
    System.out.println(add(3.5, 2.7));
    System.out.println(add("Hello", "World"));う
  }
}

//5-11 オーバーロード(引数の数が異なる場合)
public class Main {
  public static int add(int x, int y) {
    return x + y;
  }
  public static int add(int x, int y, int z) {
    return x + y + z;
  }
  public static void main(String[] args) {
    System.out.println("10+20=" + add(10, 20));
    System.out.println("10+20+30=" + add(10, 20, 30));
  }
}

//5-12 引数に配列を受け取るメソッドの利用
public class Main {
  //int型配列を受け取り、すべての要素を表示するメソッド
  public static void printArray(int[] array){
    for (int element : array){
      System.out.println(element)
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3}:
    printArray(array);   //配列を渡す
  }
}

//5-13 同じ配列を3章していることを確認する
public class Main {
  // int型配列を受け取り、
  //配列内の要素すべてに1を加えるメソッド
  public static void incArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      array[i]++;
    }
  }
  public static void main(String[] args) {
    int[] array = {1, 2, 3};
    incArray(array);
    for (int i : array) {
      System.out.println(i);
    }
  }
}

//5-14 戻り値に配列を用いる
public class Main {
  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for (int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
  public static void main(String[] args) {
    int[] array = makeArray(3);
    for (int i : array) {
      System.out.println(i);
    }
  }
}

//練習問題
//5-1
public class Main {
  public static void main(String[] args) {
    introduceOneself();
  }

  public static void introduceOneself() {
    String name = "Sayo";
    int age = 25;
    double height = 161.5;
    char zodiac = '猪';
    System.out.println("私の名前は" + name + "です");
    System.out.println("歳は" + age + "です");
    System.out.println("身長は" + height + "cmです");
    System.out.println("十二支は" + zodiac + "です");
  }
}

//5-2
public class Main {
  public static void main(String[] args) {
    String title = "お誘い";
    String address = "uso800@xxx.com";
    String text = "今度、飲みに行きませんか";
    email(title, address, text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
}

//5-3
public class Main {
  public static void main(String[] args) {
    String address = "uso800@xxx.com";
    String text = "今度、飲みに行きませんか";
    email(address, text)
  }
  public static void email(String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
  public static void email(String title, String address, String text) {
    System.out.println(address + "に、以下のメールを送信しました");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text); 
  }
}

//5-4
public class Main {
  public static void main(String[] args) {
    double triangleArea = calcTriangleArea(10.0, 5.0);
    System.out.println("三角形の面積：" + triangleArea + "平方cm");
    double circleArea = calcCircleArea(5.0);
    System.out.println("円の面積：" + circleArea + "平方cm");
  }
  public static double calcTriangleArea(double bottom, double height ) {
    double area = (bottom * height) / 2;
    return area;
  }
  public static double calcCircleArea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}