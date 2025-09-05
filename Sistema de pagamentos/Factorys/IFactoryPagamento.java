package Factorys;
import Pagamentos.IPagamento;

public abstract class IFactoryPagamento {
    public abstract IPagamento criarPagamento();
}
