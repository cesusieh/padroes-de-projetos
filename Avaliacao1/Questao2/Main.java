import Factory.*;

// Para a implementação dessa questão foi usado Factry Method, ele permite gerar um processador que aceite um tipo generico de pagamento.  Ainda garante que a aplicação não precise conhecer detalhes da criação dos objetos de pagamento, simplesmente solicitando novos para os factorys.
public class Main {
    public static void main(String[] args) {
        Plataforma plataforma = new Plataforma();
        
        // Teste usando diferentes métodos de pagamentos na mesma plataforma.
        plataforma.processarPagamento(new FactoryPix(), 150);
        plataforma.processarPagamento(new FactoryCartao(), 150);
        plataforma.processarPagamento(new FactoryBoleto(), 150);
    }
}
