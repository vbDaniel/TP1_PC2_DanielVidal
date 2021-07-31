package pc2.lab.aula08;

public class Banco {

    public static int qtdBancos = 0;
    private static Banco instancia = null;

    private Banco(){
        qtdBancos++;
    }

    public static Banco getInstance(){
        if(instancia == null) {
            instancia = new Banco();
        }
        return instancia;
    }

}
