//PODEMOS DIZER QUE UMA INTERFACE É UM CONTRATO QUE DEFINE OBRIGAÇÕES (NÃO PRECISA COLOCAR ABSTRACTS,
// JÁ É ABSTRACT POR PADRÃO)
// contrato TRIBUTAVEL
//quem assina esse contrato,precisa implementar
//metodo getValorImposto

public interface Tributavel {

    // Não precisa colocar public abstract, porque já é por padrão
    double getValorImposto();
}
