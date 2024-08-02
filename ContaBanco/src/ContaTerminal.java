import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        try{
            
        double saldoInicial = 50.00;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Informe o seu nome");
        String nome = scanner.next();
        System.out.println("Informe a sua agência");
        int agencia = scanner.nextInt();
        System.out.println("Informe o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " com a conta " + conta + ". Seu saldo é R$ " + saldoInicial + " está disponível para saque");
        } catch (InputMismatchException e) {
System.out.println("Informe apenas o primeiro nome");
        }
    }
}
