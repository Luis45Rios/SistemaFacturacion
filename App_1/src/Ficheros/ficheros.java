/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ficheros;

import java.io.*;
 
/**
 *
 * @author luisr
 */
public class ficheros {
    public static void crearArchivo(String nombreArchivo) {
        File nuevoArchivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(nuevoArchivo);
            salida.close();
            System.out.println("Se creo el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File nuevoArchivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nuevoArchivo, true));
            salida.println(contenido);
            salida.close();
            System.out.println("Se escribió en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerArchivo(String nombreArchivo) {
        File nuevoArchivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nuevoArchivo));
            String lectura = entrada.readLine();
            while(lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
