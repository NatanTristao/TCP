package animais;

public abstract class Animal {
    private String nome;

    public abstract void emitirSom();

    public Animal(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
}