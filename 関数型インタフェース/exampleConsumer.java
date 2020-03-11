// Consumer<T>のTはメソッドの引数の型を指定
Consumer<String>buyer = (goods) -> { System.out.println(goods + "を購入しました。"); };
buyer.accept("おにぎり");//　おにぎりを購入しました。

BiConsumer<String,String>buyer = (goods,goods2) -> { System.out.println(goods +"と"+goods2+ "を購入しました"); };
buyer.accept("おにぎり","お茶");//おにぎりとお茶を購入しました