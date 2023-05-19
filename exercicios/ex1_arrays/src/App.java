import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os numeros :");
        for(int i = 0; i < 5;i++){
            System.out.println((i+1)+"o : ");
            number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        System.out.println("Array inverso : ");
        for(int i = 0; i < 5;i++){
            System.out.print(array[4-i]+", ");
        }
        scanner.close();
    }
}
