package java09;

interface Programable<T>{
	abstract T add(T t1, T t2);
}

public class EmptyDiamondOperator { 
	public static void main(String[] args){
		Programable<Integer> p = new Programable<>() {
			public Integer add(Integer a, Integer b) {
				return a+b;
			}
		};
		Integer sum = p.add(10, 20);
		System.out.println(sum);
	}
}
