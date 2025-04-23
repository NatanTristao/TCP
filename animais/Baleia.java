package animais;
import comportamentos.Nadar;
import comportamentos.Amamentar;

public class Baleia extends Animal implements Nadar, Amamentar {
    public Baleia(String nome){
        super(nome);
    }
    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }

    @Override
    public void amamentar() {
        System.out.println(getNome() + " está amamentando seus filhotes.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " aux aux.");
    }
}
