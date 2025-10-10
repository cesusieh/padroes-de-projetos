package Factorys;
import Transportes.ITransporte;

// Cria a classe abstrata base para as outras fábricas.
public abstract class IFactoryTransporte {
    public abstract ITransporte criarTransporte();
}