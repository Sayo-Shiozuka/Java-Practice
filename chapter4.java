4-1 点数管理プログラム
public class Main {
  public static void main(String[] args){
    int sansu = 20;
    int kokugo = 30;
    int rika = 40;
    int eigo = 50;
    int syakai = 80;

    int sum = sansu + kokugo + rika + syakai + eigo;

    int avg = sum / 5;
    System.out.println("合計店:" + sum);
    System.out.println("平均点:" + avg);
  }
}

4-2 配列の作成手順
public class Main {
  public static void main(String[] args){
    int[] scores;
    scores = new int[5];  //int型の要素を5つ作成してscoresに代入し、配列scoresの完成
  }
}

4-3 配列の作成手順(Step1とStep2を同時に行う)
public class Main {
  public static void main(String[] args){
    int[] scores = new int[5];
  }
}

4-4 配列の長さを調べる
public class Main {
  public static void main(String[] args){
    int[] scores = new int[5];
    int num = scores.length;
    System.out.println("要素の数:" + num);
  }
}

4-5 配列の要素に値を代入
public class Main {
  public static void main(String[] args){
    int[] scores;
    scores = new int[5];
    scores[1] = 30;
    System.out.println(scores[1])
  }
}

4-6 初期化されていない変数を利用（エラー）
public class Main {
  public static void main(String[] args){
    int x;
    System.out.println(x);  //xが初期化されていないので、コンパイルエラーになる
  }
}

4-7 配列は自動的に初期化される
public class Main {
  public static void main(Stirng[] args){
    int[] scores = new int[5];
    System.out.println(scores[0]);  //0が出力される（エラーにならない）
  }
}

4-8 配列を用いた点数管理プログラム（エラー）
public class Main {
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    int sum = scores[1] + scores[2] + scores[3] + scores[4] + scores[5];
    int avg = sum / scores.length;
    System.out.println("合計点:" + sum);
    System.out.println("平均点:" + avg);
  }
}

4-9 for文をつかって配列を扱う
public class Main {
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    for (int i = 0; i < scores.length; i++){
      System.out.println(scores[i]);
    }
  }
}

4-10 点数管理プログラム(for文の利用)
public class Main {
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点:" + sum);
    System.out.println("平均点:" + avg);
  }
}

4-11 50点以上の科目の数を調べる
public class Main {
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    int count = 0;
    for (int i = 0; i < scores.length; i++){
      if (scores[i] >= 50){
        count++;
      }
    }
    System.out.println("50点以上の科目の数は:" + count);
  }
}

4-12 DNAの記号をランダムに表示する
public class Main{
  public static void main(String[] args){
    int[] seq = new int[10];

    //塩基配列をランダムに生成
    for (int i = 0; i < seq.length; i++){
      seq[i] = new.java.util.Random().nextInt(4);
    }

    //生成した塩基配列の記号を表示
    for (int i = 0; i < seq.length; i++){
      switch (seq[i]){
        case 0:
          System.out.print("A ");
          break;
        case 1:
          System.out.print("T ");
          break;
        case 2:
          System.out.print("G ");
          break;
        case 3:
          System.out.print("C ");
          break;
      }
    }
  }
}

4-13 従来のfor文
public class Main {
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    for (int i = 0; i < scores.length; i++){
      System.out.println(scores[i]);
    }
  }
}

4-14 拡張for文
public class Main{
  public static void main(String[] args){
    int[] scores = {20, 30, 40, 50, 80};
    for (int value : scores){
      System.out.println(value);
    }
  }
}

4-15 実行結果は？
public class Main {
  public static void main(String[] args){
    int[] arrayA = {1, 2, 3};
    int[] arrayB;
    arrayB = arrayA;
    arrayB[0] = 100;
    System.out.println(arrayA[0]);
  }
}