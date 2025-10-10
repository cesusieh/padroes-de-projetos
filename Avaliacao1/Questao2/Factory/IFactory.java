package Factory;

import Pagamentos.IPagamento;

public interface IFactory {
    public IPagamento gerarProcessador();
}
