package imprimeDocumentos;

public class Relatorio extends Documento{
    //Incluem um texto de comprimento n, número de páginas, autor e
    //revisor.
    private String textoDoRelatorio;
    private int numeroDePaginas;
    private String autor;
    private String relator;

    public Relatorio(String textoDoRelatorio, int numeroDePaginas, String autor, String relator) {
        this.textoDoRelatorio = textoDoRelatorio;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
        this.relator = relator;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "textoDoRelatorio='" + textoDoRelatorio + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", autor='" + autor + '\'' +
                ", relator='" + relator + '\'' +
                '}';
    }
}
