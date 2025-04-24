package animais;
import comportamentos.Amamentar;

public class Cachorro extends Mamifero implements Amamentar{
    public Cachorro(String nome) {
        super(nome);
    }
    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au au!");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando seus filhotes.");
    }
    
}
