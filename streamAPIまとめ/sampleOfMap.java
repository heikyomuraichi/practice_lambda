// Stream map(Function<T, R>)
// mapメソッドはFunctionを引数に取り、処理後の結果をStreamにして返します。
// filterと同じく中間操作です。

int[] numbers = {-1, 2, 0, -3, 8};

List<Integer> numbersList = new ArrayList<>();

for(int n : numbers) {
  numbersList.add(n);
}

numberList.stream().filter((i) -> { return i >= 0;})
                   .map((i) -> { return "*" + i + "*";})
                   .forEach((s) -> {System.out.print(s + ""); });