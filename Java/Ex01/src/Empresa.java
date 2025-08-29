import java.util.ArrayList;

public class Empresa {

    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void mostrarFuncionario() {
        /*
         * for (int i; i < funcionarios.size(); i++) {
         * Funcionario f = funcionarios.get(i);
         * f.exibirIdentificacao();
         * System.out.println("Salário: " + f.getSalario());
         * System.out.println("Bônus: R$" + f.calcularBonus());
         * System.out.println("----------------------------");
         * }
         */
        for (Funcionario f : funcionarios) {
            f.exibirIdentificacao();
            System.out.println("Salário: " + f.getSalario());
            System.out.println("Bônus: R$" + f.calcularBonus());
            System.out.println("----------------------------");
        }
    }

}
