/**
*@author German Garcia 15008, Jose Martinez 15163
*@version 24.07.16
*/
/**
* Universidad del Valle de Guatemala, Estructura de Datos, Seccion 20
*/

package hojadetrabajo2;

import java.util.Vector;

public class Pila implements iPila{
    
    // Se crean los atributos 
    private Vector vector;
    private String dataText;

    // Se crea el constructor
    public Pila(){
        this.vector = new Vector(0,1);
        this.dataText = "";
    }
    
    // Se crean los setters y getters de los atributos

    public void setVector(Vector vector){
        this.vector = vector;
    }
    
    public Vector getVector(){
        return vector;
    }
    
    public void setDataText(String dataText){
        this.dataText = dataText;
    }
    
    public String getDataText(){
        return dataText;
    }
    

    // Metodo para realizar la operacion suma entre dos numeros 

    public void suma(){
        
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int suma = numeroUno + numeroDos;
        
        vector.addElement(suma);
        
    }

    // Metodo para realizar la operacion resta entre dos numeros
    
    public void resta(){
        
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int resta = numeroUno - numeroDos;
        
        vector.addElement(resta);
        
    }
    
    // Metodo para realizar la operacion multiplicacion de dos numeros

    public void multiplicacion(){
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int mul = numeroUno * numeroDos;
        
        vector.addElement(mul);
    }
    
    // Metodo para realizar la division entre dos numeros
    public void division(){
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int div = numeroUno / numeroDos;
        
        vector.addElement(div);
    }


    
    // Metodo para verificacion de contenido, verifica los signos de las operaciones
    // con lo cual al encontrar el signo indicado realiza los metodos asignados para
    // cada operacion, como tambien verifica si hay numeros. Con lo cual se realiza en
    // total la operacion asignada por el .text en formato postfix
    public int leerTexto(String operacion){
        
        String dataText = operacion;
        
        int tamanoTexto = dataText.length();
        
        int cicloText = 0;
        
        while (cicloText < tamanoTexto){
            
            char caracter = dataText.charAt(cicloText);
            
            if (caracter == '+'){
                suma();
            } else if (caracter == '-'){
                resta();
            } else if (caracter == '*'){
                multiplicacion();
            } else if (caracter == '/'){
                division();
            } else if (caracter == ' '){
                
            } else {
                int numeroMeter = Character.getNumericValue(caracter);
                push(numeroMeter);
            }
            
            cicloText++;
        }
        
        int resultado = pop();
                
        return resultado;
    }
    
    // toString
    @Override
    public String toString(){
        
        return "a";
    }


    // Metodo encargado de realizar el push de la linea en formato postfix leida, lo cual es cuando se
    // encuentra un operando
    @Override
    public void push(int numero) {
        vector.addElement(numero);
    }

    
    // Metodo encargado de realizar el pop de la linea en formato postfix leida
    // se realiza cuando hay dos operandos
    @Override
    public int pop() {
        
        int tamanoVector = vector.size();
        
        int numeroPop = (int) vector.get(tamanoVector - 1);
        
        vector.removeElementAt(tamanoVector- 1);
        return numeroPop;
    }
    

    
    
}
