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
    
    public static void escribirArchivo(String nombreArchivo, String codigo, String nombreProducto, int cantidad, float precio) {
        File nuevoArchivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(nuevoArchivo, true));
            salida.println(codigo + "," + nombreProducto + "," + cantidad + "," + precio);
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
    
    public static void eliminarArchivo(String nombreArchivo) {
        File nuevoArchivo = new File(nombreArchivo);
        nuevoArchivo.delete();
        System.out.println("Se eliminó el archivo");
    }
    
    public static String buscarProducto(String nombreArchivo, String codigoBuscado) {
        File nuevoArchivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nuevoArchivo));
            String linea = entrada.readLine();
            while(linea != null) {
                String[] datos = linea.split(",");
                
                if (datos[0].equals(codigoBuscado)) {
                    entrada.close();
                    return "Producto encontrado: " + datos[1] + "| Cantidad: " + datos[2] + "| Precio: " + datos[3];
                }
                
                linea = entrada.readLine();
                
            }
            
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
