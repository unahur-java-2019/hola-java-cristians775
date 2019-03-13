package ar.edu.unahur.modelo;

public class Semilla {

     int id;
     String nombre;
     int edad;


    Semilla( int _id,String _nombre, int _edad){

        id=_id;
        nombre=_nombre;
        edad=_edad;


    }

    int getId(){

        return id;
    }
    String getNombre(){

        return nombre;

    }
    int getAnio(){

        return anio;

    }
    boolean getToleraSombra(){

        return toleraSombra;
    }

    
}
