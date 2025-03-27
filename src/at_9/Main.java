package at_9;

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo() {
        System.out.println(titular + " - Saldo atual: R$ " + saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("João", 1000);

        conta.exibirSaldo();
        conta.depositar(500);
        conta.exibirSaldo();
        conta.sacar(300);
        conta.exibirSaldo();
        conta.sacar(1500);
    }
}

