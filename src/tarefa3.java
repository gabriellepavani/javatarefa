abstract class Bichinho {
    protected String nome;

    public Bichinho(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }
}

class Cachorro extends Bichinho {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " esta latindo!!!!");
    }
}

public class tarefa3 {
    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Ramelo");

        System.out.println("Nome do cachorro: " + meuCachorro.getNome());
        meuCachorro.emitirSom();
    }
}