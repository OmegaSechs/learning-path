public class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * 0.2;
    }

    @Override
    public void exibirIdentificacao() {
        System.out.println("Dev: " + getNome());
    }
}