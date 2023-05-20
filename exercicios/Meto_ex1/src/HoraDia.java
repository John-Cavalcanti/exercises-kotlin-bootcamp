import java.util.Scanner;

public class HoraDia {
    public void mensagem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("informe a hora atual : ");
        
        int hora;
        boolean primeira = true;
        
        do{
            if(!primeira){
                System.out.println("Horas de 1 - 24 apenas : ");
            }
            hora = scanner.nextInt();
            scanner.nextLine();

            primeira = false;
        }while(hora > 24 || hora < 1);
        
        if(hora >= 18 ){
            boaNoite(hora);
        }else if( hora >= 12){
            boaTarde(hora);
        }else{
            bomDia(hora);
        }

        scanner.close();
    }

    private void bomDia(int hora){
        System.out.println("Bom dia ! \nHora atual : "+ hora + " horas");
    }
    private void boaTarde(int hora){
        System.out.println("Boa tarde ! \nHora atual : "+ hora + " horas");
    }
    private void boaNoite(int hora){
        System.out.println("Boa noite ! \nHora atual : "+ hora + " horas");
    }
}
