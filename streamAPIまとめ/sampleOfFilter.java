// Stream filter(Predicate<T>)
// filterメソッドはPredicateを引数にとり、条件に合致しないものを
// 除いたStreamを返す。
// 返り値はStreamなのでそのままForEachメソッドを呼び出すこともできる。

int[] numbers = {-1, 2, 0, -3, 8};

List<Integer> numbersList = new ArrayList<>();

for(int n : numbers) {
  numbersList.add(n);
}

numbersList.stream().filter((i) -> { return i > 0; })
                    .forEach((i) -> {System.out.print(i+" ");});

// filterのようなメソッドは中間操作と呼ばれている→その後にメソッドを呼び出せる（返り値がstreamだから）
// 対してforEachのようなメソッドを終端操作と呼ぶ