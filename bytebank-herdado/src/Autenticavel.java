//PODEMOS DIZER QUE UMA INTERFACE É UM CONTRATO QUE DEFINE OBRIGAÇÕES (NÃO PRECISA COLOCAR ABSTRACTS)
// contrato Autenticavel
    //quem assina esse contrato,precisa implementar
        //metodo setSenha
        //metodo autentica
public abstract interface Autenticavel{

    public abstract void setSenha(int senha);

    public abstract boolean autentica(int senha);

}
