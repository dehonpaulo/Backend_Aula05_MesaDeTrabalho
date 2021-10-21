package model;

public class Usuario {
    Tipo tipo;
    String id;

    public Usuario(Tipo tipo, String id){
        this.tipo = tipo;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}