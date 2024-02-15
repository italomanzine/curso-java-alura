public class CastingDoubleToInt {
    // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e
    // imprima o resultado.
    public static void main(String[] args) {
        double temperaturaFahrenheit = 82.4;
        int temperaturaFahrenheitInt = (int) temperaturaFahrenheit;
        System.out.println("A temperatura em Fahrenheit arredondada é %dºF".formatted(temperaturaFahrenheitInt));
    }
}
