package pc2.teorica.aula05;

public class ContaTestePrograma {

    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        Conta meuSonho = new Conta();

        minhaConta.saldo = 0;
        minhaConta.titular = "Alessio";

        minhaConta.saldo = 1000000;
        minhaConta.sacar(500);
        System.out.println(minhaConta.saldo);


        meuSonho.saldo = 0;
        meuSonho.titular = "Alessio123";

        meuSonho.saldo = 1000000000;
        meuSonho.sacar(500);
        System.out.println(meuSonho.saldo);

        System.out.println("--------------");
        System.out.println("Transferencia");
        meuSonho.transferencia(minhaConta, 1000);
    }
}
