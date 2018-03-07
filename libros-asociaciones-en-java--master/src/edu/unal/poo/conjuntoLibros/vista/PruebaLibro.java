/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.conjuntoLibros.vista;

import edu.unal.poo.conjuntoLibros.modelo.ConjuntoLibro;
import edu.unal.poo.conjuntoLibros.modelo.Autor;
import edu.unal.poo.conjuntoLibros.modelo.Libro;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class PruebaLibro {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*System.out.println("Nombre Autor");
        String nombre = teclado.next();*/
        
        //Dependencia 
        Autor autor1 = new Autor("gabriel", "Marquez", "245712");
        Libro libro1 = new Libro("Cien annios soledad", 300);
        Autor autor2 = new Autor("Haruki", "Murakami", "123456");
        Libro libro2 = new Libro("Tokyo Blues", 250);
        System.out.println ("ingrese titulo del libro");
        String titulo = teclado.next();
        Autor autor3 = new Autor("G", "Tolkien", "654321");
        Libro libro3 = new Libro(titulo, 450);
        Autor autor4 = new Autor("george", "orwel", "098765");
        Libro libro4 = new Libro("1984", 175);
        //asociando el libro con el autor
        libro1.setAutor(autor1);
        String autorLibro=libro1.getAutor().getNombre();
        libro2.setAutor(autor2);
        String autorLibro2=libro2.getAutor().getNombre();
        libro3.setAutor(autor3);
        String autorLibro3=libro3.getAutor().getNombre();
        libro4.setAutor(autor4);
        String autorLibro4=libro4.getAutor().getNombre();
        ConjuntoLibro biblio = new ConjuntoLibro();
        biblio.anadirLibro(libro1);
        biblio.anadirLibro(libro2);
        biblio.anadirLibro(libro3);
        System.out.println(biblio.mostrarLibros());
    }
}
