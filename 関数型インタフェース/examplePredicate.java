// Predicate<T>のTはメソッドの引数の型を指定
// メソッドはboolean test(T)

Predicate<String> checker = (s) -> { return s.equals("Java"); };
boolean result = checker.test("Java");
System.out.println(result); //true