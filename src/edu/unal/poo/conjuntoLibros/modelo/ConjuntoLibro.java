/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.modelo;

/**
 *
 * @author Estudiante
 */
public class ConjuntoLibro {
        //Asociacion
    private Libro[] libros;

    public ConjuntoLibro(int n) {
      this.libros = new Libro[n];
    }
    
    public boolean anadirLibro(Libro libro){
       int posVacio = -1;
       for (int i = 0; i < this.libros.length; i++) {
          if(this.libros[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.libros[posVacio] = libro;
         return true;
       }
       else return false;
       
    }
    public boolean eliminarxAutor(String nombre){
        boolean resultado = false;
        for ( int i = 0; i < this.libros.length; i++){
            if(this.libros[i] != null){
                Autor autor = this.libros[i].getAutor();
                if(autor.getNombre().equals(nombre)){
                    this.libros[i] = null;
                    resultado = true;
                }
            }
        }
        return resultado;
    }
    public boolean eliminarxTitulo (String nombre){
        boolean resultado = false;
        for ( int i = 0; i < this.libros.length; i++){
            if ( this.libros[i] != null){
                String titulo = this.libros[i].getTitulo();
                if(titulo.equals(nombre)){
                    this.libros[i] = null;
                            resultado = true;
                }
            }
        }
        return resultado;
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
    public Libro[] mostrarLibros(){
      return this.libros;
    }   
}
