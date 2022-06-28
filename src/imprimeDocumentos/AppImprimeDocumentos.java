package imprimeDocumentos;

public class AppImprimeDocumentos {
    public static void main(String[] args) {
        Curriculo curriculo = new Curriculo("Bel Albuquerque", new String[]{"Desenvolvedora Backend", "python", "java", "javaScript"});
        Livro livro = new Livro(500,"Guimarães Rosa", "ficção", "Gande Sertão: Veredas");
        Relatorio relatorio = new Relatorio("sdgafakgsfdksgfsdFGfd kuGD DS  ydgaf", 1, "Bel Albuquerque", "Capim Raposo");
        Imprime.imprimir(curriculo);
        Imprime.imprimir(livro);
        Imprime.imprimir(relatorio);
    }
}
