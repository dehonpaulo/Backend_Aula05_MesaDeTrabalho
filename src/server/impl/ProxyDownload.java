package server.impl;

import model.Musica;
import model.Usuario;
import model.Tipo;
import server.IDownload;

public class ProxyDownload implements IDownload {
    ServicoDownload servicoDownload;

    public ProxyDownload(ServicoDownload servicoDownload) {
        this.servicoDownload = servicoDownload;
    }

    @Override
    public void baixar(Usuario usuario, Musica musica) {
        if(usuario.getTipo() == Tipo.PREMIUM) {
            servicoDownload.baixar(usuario, musica);
        } else {
            System.out.println(
                    "Não foi possível baixa a música '"
                            +musica.getNome()
                            + "' de "
                            + musica.getArtista()
                            + " pois "
                            + usuario.getId()
                            + " é um usuário Free"
            );
        }
    }
}
