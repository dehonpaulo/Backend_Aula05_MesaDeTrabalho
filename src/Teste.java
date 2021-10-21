import model.Musica;
import model.Tipo;
import model.Usuario;
import server.impl.ProxyDownload;
import server.impl.ServicoDownload;

public class Teste {
    public static void main(String[] args) {

        Usuario usuarioFree = new Usuario(Tipo.FREE, "joaosilva");
        Usuario usuarioPremium1 = new Usuario(Tipo.PREMIUM, "mariabarbosa");
        Usuario usuarioPremium2 = new Usuario(Tipo.PREMIUM, "marcosaraujo");

        Musica musicaForro = new Musica("Eu tenho a senha", "Tarcísio do Acordeon");
        Musica musicaRock = new Musica("D'yer Mak'er", "Led Zeppelin");

        ProxyDownload proxydownload = new ProxyDownload(new ServicoDownload());

        proxydownload.baixar(usuarioPremium1, musicaForro);
        proxydownload.baixar(usuarioPremium2, musicaRock);
        proxydownload.baixar(usuarioFree, musicaForro);

    }
}
