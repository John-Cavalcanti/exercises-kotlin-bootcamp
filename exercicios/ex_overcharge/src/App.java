public class App {
    public static void main(String[] args) throws Exception {
        int base1 = 5, base2 = 10, altura = 4;
        calculaArea(base1);
        calculaArea(base2, altura);
        calculaArea(base1, base2, altura);
    }

    private static void calculaArea(int lado) {
        int area = lado * lado;

        System.out.println("A area do quadrado de lado "+ lado +" eh = "+ area);
    }

    private static void calculaArea(int base, int altura) {
        int area = base * altura;

        System.out.println("A area do retangulo com base "+base+" e altura "+ altura +" eh = "+ area);
    }

    private static void calculaArea(int base1,int base2, int altura) {
        float area = (((base1 + base2)*altura)/2);

        System.out.println("A area do trapezio eh : "+ area);
    }
}
