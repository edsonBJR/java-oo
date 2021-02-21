// Essa linha abaixo pode ser lida como Gerente é um Funcionário ou Gerente herda da classe Funcionário
//Gerente eh um FuncionarioAutenticavel, Gerente herda da classe FuncionarioAutenticavel

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public double getBonificacao() {
            System.out.println("Chamando o método de bonificacao do GERENTE");
            return super.getSalario();
    }

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
