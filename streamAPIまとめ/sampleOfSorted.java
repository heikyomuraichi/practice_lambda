// Stream sorted(Comparator<T>)
// Comparatorを引数に取るsortedメソッド　中間操作
int[] numbers = {-1, 2, 0, -3, 8};

List<Integer> numberList = new ArrayList<>();

for(int n : numbers) {
  numberList.add(n);
}


nunberList.stream().filter((i)->{return i >=0;})
                   .sorted((i1,i2) -> {return i1 - i2;})
                   .map((i) -> { return "*" + i + "*";})
                   .forEach((s) -> { System.out.print(s + " ");});