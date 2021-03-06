package animais.model;

import animais.model.Animal;
import animais.util.Carnivoro;

public class Cachorro extends Animal implements Carnivoro {
    public Cachorro(String nome, String som) {
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
