package model; //pacote model

public class ConversorUnidades { //classe 
//atributos 
	public double celsius;
	public double quilometros;
	public double gramas;
//construtores e os parametros
	public ConversorUnidades(double celsius, double quilometros, double gramas) {
		this.celsius = celsius;
		this.quilometros = quilometros;
		this.gramas = gramas;
	}
//método para calcular de celsius para fahrenheit 
public static double celsiusParaFahrenheit(double celsius) {
	return celsius * 1.8 + 32;
}
//método para calcular de quilometros para milhas
public static double quilometrosParaMilhas(double quilometros) {
	return quilometros * 1.609; 
}
//métodos para calcular de gramas para libras
public static double gramasParaLibras(double gramas) {
	return gramas / 453.592;
}
}
