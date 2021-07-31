package pc2.teorica.aula05;

public class ContaTesteEstruturada {

    public static int sacar(int saldo, int qtd){
        if(saldo - qtd < 0){
            return 0;
        }else {
            saldo -= qtd; // saldo = saldo - qtd;
            return saldo;
        }
    }

    public static void main(String[] args) {
        int minhaContaSaldo = 0;
        int meuSonhoSaldo = 0;

        String minhaContaTitular = "Alessio";
        String meuSonhoTitular = "Alessio2";

        minhaContaSaldo = 1000000;

        minhaContaSaldo = sacar(minhaContaSaldo, 500);

        System.out.println(minhaContaSaldo);


        meuSonhoSaldo = 0;
        meuSonhoTitular = "Alessio123";

        meuSonhoSaldo = 1000000000;
        meuSonhoSaldo = sacar(meuSonhoSaldo, 500);
        System.out.println(meuSonhoSaldo);

        System.out.println("--------------");
        System.out.println("Transferencia");
        //meuSonho.transferencia(minhaConta, 1000);
    }
}
