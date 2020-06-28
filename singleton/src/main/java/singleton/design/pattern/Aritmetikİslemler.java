package singleton.design.pattern;

public class Aritmetikİslemler {

	private static Aritmetikİslemler instance;

	private Aritmetikİslemler() {

	}

	public static Aritmetikİslemler getInstance() {

		if (instance == null) {

			synchronized (Aritmetikİslemler.class) {
				if (instance == null) {
					instance = new Aritmetikİslemler();
				}
			}
		}

		return instance;
	}

	int topla(int a, int b) {
		System.out.println(a + " ile " + b + " arasında Toplama işlemi yapılıyor...");
		return a + b;

	}

	int cıkart(int a, int b) {
		System.out.println(a + " ile " + b + " arasında Çıkartma işlemi yapılıyor...");
		return a - b;

	}

	int bol(int a, int b) {
		System.out.println(a + " ile " + b + " arasında Bölme işlemi yapılıyor...");
		return a / b;

	}

	int carp(int a, int b) {
		System.out.println(a + " ile " + b + " arasında Çarpma işlemi yapılıyor...");
		return a * b;

	}

}
