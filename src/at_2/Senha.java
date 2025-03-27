package at_2;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Senha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

        String senha;
        while(true){
            System.out.println("Digite sua senha: ");
            senha = sc.nextLine();

            String erro = validarSenha(senha);
            if(erro == null) {
                System.out.println("Senha cadastrada com sucesso!");
                break;
            } else {
                System.out.println("Erro: " + erro);
            }
        }
        sc.close();
    }
    public static String validarSenha(String senha){
        if (senha.length() < 8){
            return "A senha deve ter pelo menos 8 caracteres";
        }
        if (!Pattern.compile("[A-Z]").matcher(senha).find()){
            return "A senha deve ter pelo menos uma letra maiúscula";
        }
        if (!Pattern.compile("\\d").matcher(senha).find()){
            return "A senha deve conter pelo menos um número";
        }
        if (!Pattern.compile("[!@#$%^&*()_+\\-=[\\\\]{};':\\\",.<>/?]").matcher(senha).find()){
            return "A senha deve conter pelo menos um caractere especial";
        }
        return null;
    }
}
