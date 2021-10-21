package server.impl;

import server.IDownload;
import model.Usuario;
import model.Musica;

public class ServicoDownload implements IDownload {
    @Override
    public void baixar(Usuario usuario, Musica musica) {
        System.out.println(
                usuario.getId()
                + " baixou a musica '"
                + musica.getNome()
                + "' de "
                + musica.getArtista()
        );
    }
}
