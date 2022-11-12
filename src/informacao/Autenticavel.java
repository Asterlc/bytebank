package informacao;



public abstract interface Autenticavel {

    public abstract void setSenha(int senha);

    public boolean autentica(int senha);
}
