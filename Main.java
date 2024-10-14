public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Carlos", 28);
        Aluno aluno = new Aluno("Lucas", 20, "12345", "Engenharia");
        Funcionario funcionario = new Funcionario("Ana", 30, 3500.50, "Desenvolvedora");

        System.out.println("Informações da Pessoa:");
        pessoa.exibirInformacoes();
        
        System.out.println("\nInformações do Aluno:");
        aluno.exibirInformacoes();
        
        System.out.println("\nInformações do Funcionário:");
        funcionario.exibirInformacoes();
    }
}
