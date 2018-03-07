/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.unal.poo.conjuntoLibros.modelo;
import java.util.ArrayList;
/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
        //Asociacion
    private ArrayList<Libro> libros;

    public ConjuntoLibro() {
      this.libros = new ArrayList<>();
    }
    
    public void anadirLibro(Libro libro){
       this.libros.add(libro);
    }
    
    public boolean eliminarxAutor(String nombre){
        for ( int i = 0; i < this.libros.size(); i++){
            Libro libro = this.libros.get(i);
            if ( libro.getAutor().getNombre().equals(nombre)){
                Libro eliminado = this.libros.remove(i);
                if ( eliminado != null)
                    return true;
            }
        }
        return false;
    }
    public boolean eliminarxTitulo (String nombre){
        for ( int i = 0; i < this.libros.size(); i++){
            Libro libro = this.libros.get(i);
            if ( libro.getTitulo().equals(nombre)){
                Libro eliminado = this.libros.remove(i);
                if ( eliminado != null){
                    return true;
                }
            }
        }
        return false;
    }
    /*public Libro buscarMejorcalificacion(){
        Libro mayorCalificacion = null;
        for ( int i = 0; i < this.libros.length; i++){
            if(this.libros[i] != null && mayorCalificacion == null){
            mayorCalificacion = this.libros[i];
            }else{
                if(this.libros[i] == null && this.libros[i].getCalificacion() > mayorCalificacion.getCalificacion()){
                 
                    mayorCalificacion = this.libros[i];
                }
            }
        }
        return mayorCalifiacion.getCalificacion();
    }*/
    public ArrayList<Libro> mostrarLibros(){
        return this.libros;
    }
}
