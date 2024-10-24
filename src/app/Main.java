package app; //pacote app

import model.ConversorUnidades; //import model 

public class Main { //classe main 

	public static void main(String[] args) {
		
		
		//exibindo as informações para cada unidade e atribuindo valor

		System.out.println("Celsius para Fahrenheit: "+ ConversorUnidades.celsiusParaFahrenheit(30.0));
		System.out.println("Quilometros para Milhas "+ConversorUnidades.quilometrosParaMilhas(45.0));
		System.out.println("Gramas para Libras "+ConversorUnidades.gramasParaLibras(10.0));
		
	}

}
