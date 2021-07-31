package pc2.teorica.aula05;

public class Conta {
    int saldo;
    String titular;

    boolean sacar(int qtd){
        if(this.saldo - qtd < 0){
            return false;
        }else {
            this.saldo -= qtd; // saldo = saldo - qtd;
            return true;
        }
    }

    void depositar(int qtd){
        if(qtd < 0 ) return;

        this.saldo += qtd; // saldo = saldo + qtd;
    }

    void transferencia(Conta destino, int quantidade){
        System.out.println("Meu saldo: " + this.saldo);
        System.out.println("Saldo Destino: " + destino.saldo);
        this.sacar(quantidade);
        destino.depositar(quantidade);
        System.out.println("Meu saldo Novo: " + this.saldo);
        System.out.println("Saldo Destino Novo: " + destino.saldo);
    }
}
