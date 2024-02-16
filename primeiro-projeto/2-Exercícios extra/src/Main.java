public class Main {
    public static void main(String[] args) {
        double temperaturaCelsius = 27;
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32;

        String resultado = """
                A temperatura de %.2fºC em Fahrenheit é %.2fºF
                """.formatted(temperaturaCelsius, temperaturaFahrenheit);
        System.out.println(resultado);

        int temperaturaFahrenheitInt = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit arredondada é %dºF".formatted(temperaturaFahrenheitInt));
    }
}