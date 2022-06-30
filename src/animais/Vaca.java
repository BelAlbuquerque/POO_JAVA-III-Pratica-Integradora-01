package animais;

public class Vaca extends Animal implements Herbivoro{
    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void comer() {
    this.comerPasto(this);
    }
}
