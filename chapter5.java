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