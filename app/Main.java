package app;
import animais.Cachorro;
import animais.Sardinha;
import animais.Baleia;

public class Main {
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex");
        Sardinha peixe = new Sardinha("Douradinha");
        Baleia whale = new Baleia("Willy");

        dog.emitirSom();
        dog.amamentar();
        dog.possuiPelos();

        System.out.println();

        peixe.emitirSom();
        peixe.nadar();
        peixe.possuiGuelras();

        System.out.println();

        whale.emitirSom();
        whale.amamentar();
        whale.nadar();
        //whale.possuiPelos();  opcional, didático
    }
}

