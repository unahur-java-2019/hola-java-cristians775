package ar.edu.unahur.modelo;

public class Presentador {
    public String saludoAlMundo() {
        return this.saludoPara("Mundo ");
    }

    public String saludoPara(String quien) {
        return "¡Hola " + quien + "!";
    }
}
