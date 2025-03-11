public class Conta {
    public String nome;
    public String numeroDeTelefone;
    public float saldo;
    public float limiteDeCredito;
    public boolean isPoupanca;


    public void consultarSaldo(){
        System.out.println("Saldo atual: R$" + saldo);
    }

    public void sacar(float valor){
        if (valor <= saldo){
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " conluido com sucesso - Saldo atualizado: R$" + saldo);
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(float valor){
        saldo += valor;
        System.out.println("Saldo atualizado: R$" + saldo);
    }

    public void abrirPoupanca(){
        if (isPoupanca == true){
            System.out.println("Você ja possuí a conta poupança ativada");
        }
        else {
            System.out.println("A conta poupança foi aberta com sucesso!");
            isPoupanca = true;
        }
    }
}


