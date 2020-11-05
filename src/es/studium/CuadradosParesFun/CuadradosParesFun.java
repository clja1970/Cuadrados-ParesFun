package es.studium.CuadradosParesFun;

public class CuadradosParesFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("La suma de los cuadrados de los primeros 100 números es: " + cuadrados());

	}

	public static int cuadrados() {
		int b, i;
		b = 0;
		for (i = 2; i <= 100; i = i + 2) {
			b = (i * i) + b;
		}
		return b;

	}
}
