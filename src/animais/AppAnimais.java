package animais;

public class AppAnimais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Odara", "Auf, auf");
        Gato gato = new Gato("Punkpunk", "Miau, miau");
        Vaca vaca = new Vaca("Mimosa", "Muuu, muuuuu");

        cachorro.comer();
        cachorro.setFome(true);
        cachorro.comer();

        System.out.println("----------------------");

        gato.comer();
        gato.setFome(true);
        gato.comer();

        System.out.println("----------------------");

        vaca.comer();
        vaca.setFome(true);
        vaca.comer();

        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");

        gato.comerAnimal(vaca);

        System.out.println("----------------------");

        gato.setFome(true);
        gato.comerAnimal(vaca);
    }

}
