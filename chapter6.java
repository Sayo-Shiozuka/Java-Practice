//6-1 計算機プログラム
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  }
  public static int tasu(int a, int b) {
    return (a + b);
  }
  public static int hiku(int a, int b) {
    return (a - b);
  }
}

//6-2 CalcLogic.javaに計算処理を追加する
public class CalcLogic {
  public static int tasu(int a, int b) {
    return (a + b);
  }
  public static int hiku(int a, int b) {
    return (a - b);
  }
}

//6-3 main メソッドだけが残されたCalc.java
public class Calc {
  public static void main(String[] args) {
    int a = 10; int b = 2;
    int total = tasu(a, b);
    int delta = hiku(a, b);
    System.out.println("足すと" + total + "、引くと" + delta);
  } 
}