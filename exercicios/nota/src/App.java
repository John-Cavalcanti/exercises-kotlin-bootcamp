import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int nota = -1;
        boolean firstIteration = true;
        Scanner sn = new Scanner(System.in);
        System.out.println("insira um nota : ");

        while(nota < 0 || nota > 10){
            if(!firstIteration){
                System.out.println("Insira um valor entre 0 e 10 : ");
            }

            nota = sn.nextInt();
            sn.nextLine();

            firstIteration = false;
        }

        System.out.println("nota escolhida : " + nota);
        sn.close();
        return;
    }
}
