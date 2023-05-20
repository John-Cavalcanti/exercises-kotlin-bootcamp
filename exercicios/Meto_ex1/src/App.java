public class App {
    public static void main(String[] args) throws Exception {
        int numero1 = 16, numero2 = 4;
        System.out.println("Executando calculadora para os numeros : "+numero1+" e "+ numero2);
        Calculadora calculadora = new Calculadora();

        calculadora.soma(numero1, numero2);
        calculadora.subtracao(numero1, numero2);
        calculadora.multiplicacao(numero1, numero2);
        calculadora.divisao(numero1, numero2);

        HoraDia hora = new HoraDia();

        hora.mensagem();
    }
}
