public static void main(String[] args) throws Exception {
    // Function<T,R>
    // Function<T, R>のTはメソッドの引数の型(Type)、Rは戻り値の型(return)を指定
    // メソッドは R apply(T)
    Function<Integer,String>asterisker = (i) ->{ return "*"+i; };
    String result = asterisker.apply(10);
    System.out.println(result); // *10

    //2つの引数を受け付けるBiFunctionというインターフェースもある
    BiFunction<Integer,Integer,Integer>adder = (a,b) -> {return a + b; };
    int result = adder.apply(1,2);
    System.out.println(result); //3
}
