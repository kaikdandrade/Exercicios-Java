package temperature.convert;

public class ConversorTemperatura {
    
    public static double converteCelsiusParaFahrenheit(double celsius) {
        double fahrenheit = 1.8 * celsius + 32;              // f = 1,8 * c + 32
        return fahrenheit;
    }
    
    public static double converteFahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;          // c = (f - 32) * 5 / 9
        return celsius;
    }
    
    
    public static void main(String[] args) {
        System.out.println(converteCelsiusParaFahrenheit(32));       // 89.6
        System.out.println(converteFahrenheitParaCelsius(89.6));   // 32
    }
}