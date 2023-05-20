public class Calculadora {
    
    public void soma(int numero1, int numero2){
        int resultado = numero1 + numero2;

        System.out.println(numero1+" + "+numero2+ " = "+resultado);
    }
    
    public void subtracao(int numero1, int numero2){
        int resultado = numero1 - numero2;

        System.out.println(numero1+" - "+numero2+ " = "+resultado);
    }

    public void multiplicacao(int numero1, int numero2){
        int resultado = numero1 * numero2;

        System.out.println(numero1+" x "+numero2+ " = "+resultado);
    }

    public void divisao(float numero1, float numero2){
        float resultado = numero1/numero2;

        System.out.println(numero1+" / "+numero2+ " = "+resultado);
    }
}
