package singleton.design.pattern;

public class Main {

	public static void main(String[] args) {
		Aritmetikİslemler t = Aritmetikİslemler.getInstance();

		System.out.println(t.topla(5, 5));
		System.out.println(t.cıkart(7, 9));
		System.out.println(t.bol(15, 5));
		System.out.println(t.carp(-3, 5));

	}

}
