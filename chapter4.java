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

4-7配列は自動的に初期化される
public class Main {
  public static void main(Stirng[] args){
    int[] scores = new int[5];
    System.out.println(scores[0]);  //0が出力される（エラーにならない）
  }
}

