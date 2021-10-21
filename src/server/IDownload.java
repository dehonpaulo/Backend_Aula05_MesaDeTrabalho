package server;

import model.Usuario;
import model.Musica;

public interface IDownload {
    public void baixar(Usuario usuario, Musica musica);
}
