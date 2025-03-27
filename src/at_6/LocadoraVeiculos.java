package at_6;

class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + quilometragem + " km");
        System.out.println();
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Viagem registrada! Quilometragem atualizada para: " + quilometragem + " km");
        } else {
            System.out.println("A quilometragem da viagem deve ser positiva.");
        }
    }
}

public class LocadoraVeiculos {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC-1234", "Sedan X", 2020, 50000);
        Veiculo veiculo2 = new Veiculo("XYZ-5678", "SUV Y", 2018, 80000);

        System.out.println("Detalhes dos Veículos:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        System.out.println("Registrando viagens...");
        veiculo1.registrarViagem(250);
        veiculo2.registrarViagem(120);

        System.out.println("\nDetalhes atualizados dos Veículos:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}
