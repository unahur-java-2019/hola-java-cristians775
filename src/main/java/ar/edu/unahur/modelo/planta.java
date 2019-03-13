package ar.edu.unahur.modelo;

public class Planta {

     int id;
     String observaciones;

     boolean toleraSombra;

    Semilla( int _id,String _observaciones,int semilla_id){

        id=_id;
        observaciones=_observaciones;

    }

    int getId(){

        return id;
    }
    String getObservaciones(){

        return observaciones;



    
}
