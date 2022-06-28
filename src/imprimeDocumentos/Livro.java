package imprimeDocumentos;

public class Livro extends Documento {
    private int numeroDePaginas;
    private String nomeDoAutor;
    private String genero;
    private String tituloDoLivro;

    public Livro(int numeroDePaginas, String nomeDoAutor, String genero, String tituloDoLivro) {
        this.numeroDePaginas = numeroDePaginas;
        this.nomeDoAutor = nomeDoAutor;
        this.genero = genero;
        this.tituloDoLivro = tituloDoLivro;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroDePaginas=" + numeroDePaginas +
                ", nomeDoAutor='" + nomeDoAutor + '\'' +
                ", genero='" + genero + '\'' +
                ", tituloDoLivro='" + tituloDoLivro + '\'' +
                '}';
    }
}
