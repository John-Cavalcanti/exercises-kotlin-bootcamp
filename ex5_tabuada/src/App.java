import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero = -1;
        boolean primeiraIteracao = true;
        System.out.println("Digite um numero de 0 a 10 : ");

        while(true){
            if(!primeiraIteracao){
                System.out.println("Apenas numeros de 1 a 10 sao aceitos");
            }
            numero = scanner.nextInt();
            scanner.nextLine();

            if (numero <= 10 && numero > 0){
                printaTabuada(numero);
                scanner.close();
                return;
            }else{
                primeiraIteracao = false;
                continue;
            }
        }
    }

    private static void printaTabuada(int numero){
        System.out.println("Tabuada de "+ numero +" : ");
        for(int i = 1; i <= 10 ; i++){
            int resultado = numero*i;
            System.out.println(numero + " X "+ i + " = "+ resultado);
        }
    }
}
