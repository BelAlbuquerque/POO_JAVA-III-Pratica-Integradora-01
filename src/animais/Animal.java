package animais;

public abstract class Animal {
    private String nome;
    private String som;
    private boolean fome;
    private boolean vida;

    public Animal(String nome, String som) {
        this.nome = nome;
        this.som = som;
        this.fome = false;
        this.vida = true;
    }

    public boolean isVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public String getSom() {
        return som;
    }

    public boolean isFome() {
        return fome;
    }

    public void setVida() {
        if (!vida) {
            System.out.println(som);
            System.out.println(nome + ", morreu...");
        }
        this.vida = !vida;
    }

    public void setFome(boolean fome) {
        this.fome = fome;
    }

    public void emitirSom() {
        System.out.println(this.som);
    }

    abstract public void comer();

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", som='" + som + '\'' +
                ", fome=" + fome +
                ", vida=" + vida +
                '}';
    }
}
