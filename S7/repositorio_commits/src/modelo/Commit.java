package modelo;

public class Commit {
    //Atributos
    private String codigo;
    private String autor;
    private String descripcion;

    public Commit(String codigo, String autor, String descripcion) {
        this.codigo = codigo;
        this.autor = autor;
        this.descripcion = descripcion;
    }

    //Setters y getters
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    //Metodos
    public String mostrarInformacion() {
        return codigo + " - " + autor + " - " + descripcion;
    }
}
