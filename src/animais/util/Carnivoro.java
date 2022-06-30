package animais.util;

import animais.model.Animal;

public interface Carnivoro {

    public default void comerCarne(Animal animal) {
        if (animal.isFome()) {
            animal.setFome(false);
            System.out.println(animal.getSom() + "!");
            System.out.println(animal.getNome() + ", achou a carne muito boa!");
        } else {
            System.out.println(animal.getSom() + "!");
            System.out.println(animal.getNome() + ", não está com fome!");
        }
    }

    public default void comerAnimal(Animal animalCarnivoro, Animal animalVitima) {
        if (animalVitima.isVida() && animalCarnivoro.isFome()) {
            System.out.println(animalCarnivoro.getSom() + "!");
            System.out.println(animalCarnivoro.getNome() + " devorou " + animalVitima.getNome());
            animalVitima.setVida();

        } else {
            System.out.println(animalCarnivoro.getSom() + "!");
            System.out.println(animalCarnivoro.getNome() + ", não está com fome!");
            System.out.println(animalVitima.getNome() + " disse: Ufa!!!");
        }

    }
}
