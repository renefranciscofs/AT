package at_3;
import java.util.Scanner;

public class Imposto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite seu salário mensal: ");
        double salarioMensal = sc.nextDouble();
        double salarioAnual = salarioMensal * 12;

        double imposto = calcularImposto(salarioAnual);
        double salarioLiquido = salarioAnual - imposto;

        System.out.println("\nNome: " + nome);
        System.out.printf("Salário Anual: R$ %.2f\n", salarioAnual);
        System.out.printf("Imposto: R$ %.2f\n", imposto);
        System.out.printf("Salário líquido: R$ %.2f\n", salarioLiquido);

        sc.close();
    }

    public static double calcularImposto(double salarioAnual) {
        if (salarioAnual <= 22847.76){
            return 0;
        } else if (salarioAnual <= 33919.8) {
            return (salarioAnual - 22847.76) * 0.075;
        } else if (salarioAnual <= 45012.60) {
            return (salarioAnual - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        } else {
            return (salarioAnual - 45012.60) * 0.275 + (45012.60 - 33919.80) * 0.15 + (33919.80 - 22847.76) * 0.075;
        }
    }
}
