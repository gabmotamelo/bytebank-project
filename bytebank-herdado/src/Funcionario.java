//não pode instanciar objetos dessa classe porque ela é abstrata
//Porém polimorfismo ainda continua exisitindo
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    //metodo não há corpo, não há implementação
    public abstract double getBonificacao();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
