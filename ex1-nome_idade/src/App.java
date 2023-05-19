import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String nome = "";
        int idade = 0;

        Scanner sn = new Scanner(System.in);

        while (true) {
            System.out.println("Digite nome : ");
            nome = sn.nextLine();
            if (nome.equals("0")) {
                System.out.println("programa encerrado");
                sn.close();
                return;
            }
            System.out.println("digite idade : ");
            idade = sn.nextInt();
            sn.nextLine();

            System.out.println("Seu nome : " + nome);
            System.out.println("Sua idade : " + idade);
        }
    }
}
