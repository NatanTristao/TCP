package animais;
import comportamentos.Nadar;

public class Sardinha extends Peixe implements Nadar{
    public Sardinha(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + "Glub glub");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando.");
    }
}
