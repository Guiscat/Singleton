package org.example;

import java.util.List;

public class Fila {
    private static Fila instancia;

    private List<Documento> documentos;
    private Fila() {}

    public static Fila getInstance()
    {
        if (instancia == null) instancia = new Fila();
        return instancia;
    }

    public void ImprimeDocumento() {
        System.out.print(documentos);
    }

    public void RemoveTodosDocumentos() {
        documentos = null;
    }

    public void RemoveDocumento()
    {
        documentos.remove(0);
    }
}

