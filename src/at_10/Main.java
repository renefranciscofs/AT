package at_10;
import java.io.*;
import java.util.*;

class Compra {
    private String produto;
    private int quantidade;
    private double precoUnitario;

    public Compra(String produto, int quantidade, double precoUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return produto + ", " + quantidade + ", " + precoUnitario;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Compra> compras = new ArrayList<>();
        String arquivo = "compras.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (int i = 0; i < 3; i++) {
                System.out.print("Produto: ");
                String produto = scanner.nextLine();
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();
                System.out.print("Preço unitário: ");
                double precoUnitario = scanner.nextDouble();
                scanner.nextLine(); // Limpar buffer

                Compra compra = new Compra(produto, quantidade, precoUnitario);
                compras.add(compra);
                writer.write(compra.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }

        System.out.println("\nCompras registradas:");
        try (BufferedReader reader = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}
