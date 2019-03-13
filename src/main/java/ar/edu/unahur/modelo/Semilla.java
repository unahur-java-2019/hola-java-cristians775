package ar.edu.unahur.modelo;

public class Semilla {

     int id;
     String nombre;
     int anio;
     boolean toleraSombra;

    Semilla( int _id,String _nombre, int _anio,boolean _toleraSombra,int origen_id){

        id=_id;
        nombre=_nombre;
        anio=_anio;
        toleraSombra=_toleraSombra;


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
