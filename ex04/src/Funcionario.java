public class Funcionario {
    private String nome;
    private Double salario;

    public Funcionario() {};

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println("Estou realizando meu glorioso trabalho.");
    }

}
