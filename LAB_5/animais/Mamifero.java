package animais;
public abstract class Mamifero extends Animal {
    
    public Mamifero (String nome) {
        super(nome);
    }

    public void possuiPelos(){
        System.out.println(getNome() + "possui pelos");
    }
}
