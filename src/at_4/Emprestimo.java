package at_4;
import java.util.Scanner;

public class Emprestimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do empréstimo: ");
        double valor = sc.nextDouble();

        int parcelas;
        do {
            System.out.println("Digite o número de parcelas (mínimo 6, máximo 48): ");
            parcelas = sc.nextInt();
        } while (parcelas < 6 || parcelas > 48);

        double taxaJuros = 0.03;
        double valorTotal = valor * Math.pow(1 + taxaJuros, parcelas);
        double valorParcela = valorTotal / parcelas;

        System.out.println("\nNome: " + nome);
        System.out.printf("Valor total Pago: R$%.2f\n", valorTotal);
        System.out.printf("Valor da Parcela: R$%.2f\n", valorParcela);

        sc.close();
    }
}
