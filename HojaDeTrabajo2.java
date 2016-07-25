/**
*@author German Garcia 15008, Jose Martinez 15163
*@version 24.07.16
*/
/**
* Universidad del Valle de Guatemala, Estructura de Datos, Seccion 20
*/


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Programa Principal */


public class HojaDeTrabajo2 {


    public static void main(String[] args)  {
        
       // Para realizar el codigo de lectura de archivos de texto se consulto
       // la pagina: http://jarroba.com/lectura-escritura-ficheros-java-ejemplos/
       // lo cual fue necesario para poder aprender a implementar dichos comandos


        // se carga el archivo datos.txt
        File archivo = new File("datos.txt");
        Scanner scan = null;
        Pila pila = new Pila(); // se crea un objeto de la clase Pila
        
        System.out.println("Bienvenido al programa de operaciones!");
        

        // Codigo para realizar la lectura de texto en el archivo datos.txt
        // con lo cual verifica si hay lines posteriores para seguir leyendo
        // al final muestra el resultado obtenido de la linea en formato postfix
        try {
            scan = new Scanner(archivo);
            
            int numeroDeOperacion = 1;
            
            while(scan.hasNextLine()){
                String operacion = scan.nextLine();
                System.out.println("Operacion #" + numeroDeOperacion + ": " + operacion);
                
                int resultado = pila.leerTexto(operacion);
                
                System.out.println("Resultado de operacion #" + numeroDeOperacion + ": " + resultado);
                numeroDeOperacion++;
            }
            
        } catch (Exception ex) {
            System.out.println("error");
        }
    }
    
}
