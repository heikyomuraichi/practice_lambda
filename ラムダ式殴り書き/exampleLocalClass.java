//　ローカルクラスの実装例
//　ローカルクラス→メソッドの処理中にクラスを宣言して利用できる仕組み
public static void main(String[] args) {
    class Local {
        public void sayHello() {
            System.out.println("Hello!");
        }
    }

    Local local = new Local();
    local.sayHello();// Hello!
}