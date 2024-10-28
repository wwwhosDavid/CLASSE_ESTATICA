public class ConversorUnidades {

    // Método para converter celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Método para converter km em Milhas
    public static double quilometrosParaMilhas(double quilometros) {
        return quilometros * 0.621371;
    }

    // Método para converter gramas para Libras
    public static double gramasParaLibras(double gramas) {
        return gramas * 0.00220462;
    }

    public static void main(String[] args) {
        // Teste do método de conversão de celsius para farenheit
        double celsius = 25.0;
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C em Fahrenheit é: " + fahrenheit + "°F");

        // Teste do método de conversão de km para milhas
        double quilometros = 10.0;
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        System.out.println(quilometros + " km em Milhas é: " + milhas + " milhas");

        // Teste do método de conversão de gramas para libras
        double gramas = 500.0;
        double libras = ConversorUnidades.gramasParaLibras(gramas);
        System.out.println(gramas + " g em Libras é: " + libras + " lbs");
    }
}
