package animais;

public class Gato extends Animal implements Carnivoro{
    public Gato(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void comer() {
        this.comerCarne(this);
    }

    public void comerAnimal(Animal vitima) {
        this.comerAnimal(this, vitima);
    }
}
