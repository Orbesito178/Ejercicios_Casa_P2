package interfaz;

import modelo.*;

public class Main {
    public static void main(String[] args) {
        Archivo a1 = new ArchivoTexto("informe.txt", 2.0, 5000);
        Archivo a2 = new ArchivoTexto("manual.txt", 4.0, 12000);
        Archivo a3 = new ArchivoImagen("logo.png", 3.0, "1920x1080");
        Archivo a4 = new ArchivoImagen("foto.jpg", 6.0, "4000x3000");
        Archivo a5 = new ArchivoVideo("demo.mp4", 120.0, 10);
        Archivo a6 = new ArchivoVideo("tutorial.mp4", 250.0, 25);
        Archivo a7 = new ArchivoAudio("podcast.mp3", 40.0, 30);
        Archivo a8 = new ArchivoAudio("musica.wav", 50.0, 4);
        RepositorioArchivos repositorio = new RepositorioArchivos();
        repositorio.agregarArchivo(a1);
        repositorio.agregarArchivo(a2);
        repositorio.agregarArchivo(a3);
        repositorio.agregarArchivo(a4);
        repositorio.agregarArchivo(a5);
        repositorio.agregarArchivo(a6);
        repositorio.agregarArchivo(a7);
        repositorio.agregarArchivo(a8);
        System.out.println("Archivos: " + repositorio.obtenerCantidadArchivos());
        System.out.println(repositorio.mostrarArchivos());
        System.out.println("Texto procesado: " + a1.calcularEspacioProcesado());
        System.out.println("Imagen procesada: " + a3.calcularEspacioProcesado());
        System.out.println("Video procesado: " + a5.calcularEspacioProcesado());
        System.out.println("Audio procesado: " + a7.calcularEspacioProcesado());
        System.out.println("Espacio total procesado: " + repositorio.calcularEspacioTotalProcesado());
        Archivo existente = repositorio.buscarArchivo("demo.mp4");
        if (existente != null) {
            System.out.println("Encontrado: " + existente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + existente);
        }
        Archivo inexistente = repositorio.buscarArchivo("nada.txt");
        if (inexistente != null) {
            System.out.println("Encontrado: " + inexistente.mostrarInformacion());
        } else {
            System.out.println("No encontrado: " + inexistente);
        }
    }
}
