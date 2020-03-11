// Collections.sort(List<T>,Comparator<?,super T>)
// ソートの方法はオブジェクトの種類や状況によって異なる
// あらゆるソートを実現するために数値の比較処理を動的に切り替える必要あり

int[] numbers = {-1,2,0,-3,8};

List<Integer> numberList = new ArrayList<>();

for (int n: numbers) {
    numbersList.add(n);
}

Collections.sort(numbersList,[ソート方法]);

//　ここで[ソート方法]にはComparatorインターフェースのcompare(s1,s2)メソッドを
//  実装したインスタンスを指定する

// compareメソッドはint型を返し、大小を以下のように判断します。
// 戻り値	    大小
// 0より大きい  s1 > s2
// 0           s1 = s2
// 0より小さい  s1 < s2

// 昇順にソート
Collections.sort(numberList, (a,b) -> {return a - b;});

for (Integer n : numbersList) {
    System.out.print(n+" ");

}
