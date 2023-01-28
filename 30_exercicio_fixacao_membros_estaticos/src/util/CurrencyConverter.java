package util;

public class CurrencyConverter {

	public static double converter(double price, double dollars) {
		double converter = price * dollars;
		return converter += converter * 6 /100;
	}
}
