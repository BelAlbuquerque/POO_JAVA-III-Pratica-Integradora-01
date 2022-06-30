package animais.util;

import animais.model.Animal;

public interface Herbivoro {
    public default void comerPasto(Animal animal) {
        if (animal.isFome()) {
            animal.setFome(false);
            System.out.println(animal.getSom() + "!");
            System.out.println(animal.getNome() + ", achou o pasto muito gostoso!");
        } else {
            System.out.println(animal.getSom() + "!");
            System.out.println(animal.getNome() + ", não está com fome!");
        }
    };
}
