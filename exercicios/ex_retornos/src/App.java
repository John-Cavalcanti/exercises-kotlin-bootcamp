public class App {
    public static void main(String[] args) throws Exception {
        int base1 = 10, base2 = 5, altura = 15;

        int quadrado = calculaArea(base1);
        int retangulo = calculaArea(base1, altura);
        float trapezio = calculaArea(base1, base2, altura);

        System.out.println("A area do quadrado de lados "+ base1 +" eh = "+ quadrado);
        System.out.println("A area do retangulo com base "+base1+" e altura "+ altura +" eh = "+ retangulo);
        System.out.println("A area do trapezio eh : "+ trapezio);
    }

    private static int calculaArea(int lado) {
        int area = lado * lado;
        return area;

        //
    }

    private static int calculaArea(int base, int altura) {
        int area = base * altura;
        return area;

        //
    }

    private static float calculaArea(int base1,int base2, int altura) {
        float area = (((base1 + base2)*altura)/2);
        return area;

        //
    }
}
