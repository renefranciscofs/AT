package at_8;

class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println(nome + " - Salário final: R$ " + calcularSalario());
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.2;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.9;
    }
}

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Carlos", 5000);
        Estagiario estagiario = new Estagiario("Ana", 2000);

        gerente.exibirSalario();
        estagiario.exibirSalario();
    }
}
