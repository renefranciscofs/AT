package at_11;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer> numerosSorteados = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        Set<Integer> numerosUsuario = new HashSet<>();

        while (numerosSorteados.size() < 6) {
            numerosSorteados.add(random.nextInt(60) + 1);
        }

        System.out.println("Digite 6 números entre 1 e 60:");
        while (numerosUsuario.size() < 6) {
            int num = scanner.nextInt();
            if (num >= 1 && num <= 60) {
                numerosUsuario.add(num);
            } else {
                System.out.println("Número inválido, tente novamente.");
            }
        }

        scanner.close();

        Set<Integer> acertos = new HashSet<>(numerosUsuario);
        acertos.retainAll(numerosSorteados);

        System.out.println("Números sorteados: " + numerosSorteados);
        System.out.println("Seus números: " + numerosUsuario);
        System.out.println("Você acertou " + acertos.size() + " número(s): " + acertos);
    }
}

