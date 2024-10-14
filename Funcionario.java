public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade, double salario, String cargo) {
        super(nome, idade);
        this.salario = salario;
        this.cargo = cargo;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Salário: R$ " + salario);
        System.out.println("Cargo: " + cargo);
    }

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana", 30, 3500.50, "Desenvolvedora");
        funcionario.exibirInformacoes();
    }
}
