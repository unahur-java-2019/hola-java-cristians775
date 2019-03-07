package ar.edu.unahur.modelo;

public class Origen {

    int id;
    String nombre;
    String pais;
    double latitud;
    double longitud;

    Origen(int _id, String _nombre, String _pais, double _latitud, double _longitud) {

        id = _id;
        nombre = _nombre;
        pais = _pais;
        latitud = _latitud;
        longitud = _longitud;
    }

    int getId() {

        return id;
    }


    String getNombre() {

        return nombre;

    }

    String getPais() {

        return pais;
    }

    double latitud() {

        return latitud;

    }

    double getLongitud() {

        return longitud;
    }

}
