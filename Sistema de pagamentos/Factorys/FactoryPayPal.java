package Factorys;
import Pagamentos.IPagamento;
import Pagamentos.PagamentoPayPal;

public class FactoryPayPal extends IFactoryPagamento {
    private String contaUsuario;
    private String emailUsuario;

    public FactoryPayPal(String emailUsuario) {
        this.contaUsuario = emailUsuario;
        this.emailUsuario = emailUsuario;
    }

    @Override
    public IPagamento criarPagamento() {
        return new PagamentoPayPal(this.contaUsuario, this.emailUsuario);
    }
}