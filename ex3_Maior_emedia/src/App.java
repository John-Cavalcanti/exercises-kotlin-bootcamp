import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sn = new Scanner(System.in);

        int numero,iteracao = 0;
        float media,soma = 0, maior = -1;
        do{
            System.out.println("numero "+ (iteracao + 1) + ": ");
            numero = sn.nextInt();
            sn.nextLine();
            soma += numero;
            if(numero > maior) maior = numero;
            iteracao++;
        }while(iteracao < 5);

        media = soma/5;

        System.out.println("Maior : " + maior + " | media : "+ media);

        sn.close();
    }
}
