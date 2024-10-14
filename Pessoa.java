public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 25);
        pessoa.exibirInformacoes();

        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        System.out.println("\nApós atualização:");
        pessoa.exibirInformacoes();
    }
}
