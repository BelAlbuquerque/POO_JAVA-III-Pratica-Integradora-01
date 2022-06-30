package animais.model;

import animais.model.Animal;
import animais.util.Herbivoro;

public class Vaca extends Animal implements Herbivoro {
    public Vaca(String nome, String som) {
        super(nome, som);
    }

    @Override
    public void comer() {
    this.comerPasto(this);
    }
}
