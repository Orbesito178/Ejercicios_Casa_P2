package modelo;

import java.util.ArrayList;

public class Repositorio {
    //Atributos
    private ArrayList<Commit> commits;

    public Repositorio() {
        commits = new ArrayList<>();
    }

    //Metodos
    public boolean registrarCommit(String codigo, String autor, String descripcion) {
        if (buscarPorCodigo(codigo) != null) {
            return false;
        }
        Commit commit = new Commit(codigo, autor, descripcion);
        commits.add(commit);
        return true;
    }

    public boolean eliminarUltimoCommit() {
        if (commits.size() > 0) {
            commits.remove(commits.size() - 1);
            return true;
        }
        return false;
    }

    public Commit buscarPorCodigo(String codigo) {
        for (Commit c : commits) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public int contarPorAutor(String autor) {
        int contador = 0;
        for (Commit c : commits) {
            if (c.getAutor().equals(autor)) {
                contador++;
            }
        }
        return contador;
    }

    public int obtenerCantidadCommits() {
        return commits.size();
    }

    public String mostrarHistorial() {
        String historial = "";
        for (Commit c : commits) {
            historial = historial + c.mostrarInformacion() + "\n";
        }
        return historial;
    }
}
