// 無名クラスの例
// 無名クラス→インタフェースを実装したローカルクラスの宣言を省略する仕組み
public static void main(String[] args) {

    Runnable runner = new Runnable() {
      public void run() {
        System.out.println("Hello Lambda!");
      }
    };
  
    runner.run(); //Hello Lambda!
}