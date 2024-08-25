import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o número de sua agência:");
        scanner.nextLine(); 
        String agency = scanner.nextLine();
       

        System.out.println("Por favor digite o número de sua conta:");
        int number = scanner.nextInt();

        
        System.out.println("Por favor digite o seu nome:");
        String clientName = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo:");
        double balance = scanner.nextDouble();

        String msg = "Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + agency + 
                          ", conta " + number + " e seu saldo " + balance + " já está disponível para saque.";
        
        System.out.println(msg);
        scanner.close();
    }
}
