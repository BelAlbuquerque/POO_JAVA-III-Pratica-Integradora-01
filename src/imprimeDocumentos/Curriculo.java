package imprimeDocumentos;

import java.util.Arrays;

public class Curriculo extends Documento {
    private String name;
    private String[] habilidades;

    public Curriculo(String name, String[] habilidades) {
        this.name = name;
        this.habilidades = habilidades;
    }

    @Override
    public String toString() {
        return "Curriculo{" +
                "name='" + name + '\'' +
                ", habilidades=" + Arrays.toString(habilidades) +
                '}';
    }
}
