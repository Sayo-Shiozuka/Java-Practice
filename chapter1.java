// 1-1 ソースコードの基本構造
public class Main {　     //Mainはクラス名/ソースファイルは「クラス名.java」
	public static void main(String[] args) {   //ここまでのコードは暗記する
		System.out.println("RPG:スッキリ魔王征伐");
		System.out.println("Ver.0.1 by 湊");
		System.out.println("<ただいま鋭意学習・製作中>");
		System.out.println("プログラムを終了します");
	}
}


// 1-2 変数宣言の文
public class Main {
  public static void main(String[] args) {
    int age;  //変数宣言の文(ageという箱を用意) - 型　変数名;
    age = 30;　　//箱に数字の「30」を入れる
    System.out.println(age);　//箱の中身を表示
  }
}

// 1-3 変数の再代入
public class Main {
    public static void main(String[] args){
        int age = 20;　//変数ageを20で初期化
        System.out.println("私の年齢は"+ age);
        age = 31;　　//変数ageに再度代入している
        System.out.println("・・・いや、本当の年齢は" + age);
    }
}

// 1-4 書き換えてはいけない変数の値を上書きしてしまう
public class Main {
    public static void main(String[] args){
        double pi = 3.14;　　//円周率を入れた変数
        int pie = 5;
        System.out.println("半径"+ pie + "cmのパイの面積は、");
        System.out.println(pie * pie * pi);
        System.out.println("パイの半径を倍にします");
        pi = 10;　　//誤り！代入すべき変数は「pie」
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * pi);
    }
}

// 1-5 円周率に定数を利用する（エラー）
/*　定数の宣言
  final 型　定数名(一般的にすべて大文字) = 初期値;
 */
public class Main {
    public static void main(String[] args){
        final double PI = 3.14;　　//定数として円周率を宣言
        int pie = 5;
        System.out.println("半径"+ pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
        System.out.println("パイの半径を倍にします");
        PI = 10;  //コンパイルエラーとなり誤りに気づく
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
    }
}