import Factory.IFactory;

// Consumor com o método processarPagamento(), espera receber uma Factory de Pagamento generica.
public class Plataforma {
    public Plataforma(){};

    public void processarPagamento(IFactory f, double valor){
        System.out.println("Compra de R$" + valor + " aprovada no " + f.gerarProcessador().processarPagamento());
    }
}
