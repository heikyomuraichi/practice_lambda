
// void forEach(Consumer<T>)
// forEachメソッドはConsumerを引数にとり、要素の数だけ処理を繰り返す

int[] numbers = {-1,-2,0,-3,8};

List<Integer> numbersList = new ArrayList<>();

for (int n:numbers) {
    numbersList.add(n);
}


numbersList.stream().forEach((i) -> {System.out.print(i + " "); });
