public class Inicio {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        Funcionario gerente = new Gerente("Evandro", 400000);
        empresa.adicionarFuncionario(gerente);
        Funcionario desenvolvedor_junior = new Desenvolvedor("Erick", 8000);
        empresa.adicionarFuncionario(desenvolvedor_junior);
        Funcionario desenvolvedor_senior = new Desenvolvedor("Ryan", 12000);
        empresa.adicionarFuncionario(desenvolvedor_senior);

        empresa.mostrarFuncionario();
    }

}
