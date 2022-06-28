package imprimeDocumentos;

public interface Imprime {
    public static void imprimir(Documento doc) {
        System.out.println(doc.print());
    }
}
