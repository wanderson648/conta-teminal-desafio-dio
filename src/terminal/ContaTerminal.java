package terminal;

import model.ContaBanco;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);


        System.out.print("Por favor digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.print("Por favor informe a agência: ");
        String agencia = sc.nextLine();

        System.out.print("Por favor informe o nome do cliente : ");
        String nomeCliente = sc.nextLine();

        System.out.print("Por favor informe o saldo: ");
        double saldo = sc.nextDouble();


        ContaBanco contaBanco = new ContaBanco(numero, agencia, nomeCliente, BigDecimal.valueOf(saldo));
        System.out.println();
        System.out.println(contaBanco);

        sc.close();
    }
}
