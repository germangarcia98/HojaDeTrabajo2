/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hojadetrabajo2;

import java.util.Vector;

/**
 *
 * @author Jose
 */
public class Pila implements iPila{
    private Vector vector;
    private String dataText;

    public Pila(){
        this.vector = new Vector(0,1);
        this.dataText = "";
    }
    
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
    
    public void suma(){
        
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int suma = numeroUno + numeroDos;
        
        vector.addElement(suma);
        
    }
    
    public void resta(){
        
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int resta = numeroUno + numeroDos;
        
        vector.addElement(resta);
        
    }
    
    public void multiplicacion(){
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int mul = numeroUno * numeroDos;
        
        vector.addElement(mul);
    }
    
    public void division(){
        int numeroUno = pop();
        int numeroDos = pop();
        
        vector.removeAllElements();
        
        int div = numeroUno / numeroDos;
        
        vector.addElement(div);
    }
    
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
    
    @Override
    public String toString(){
        
        return "a";
    }

    @Override
    public void push(int numero) {
        vector.addElement(numero);
    }

    @Override
    public int pop() {
        
        int tamanoVector = vector.size();
        
        int numeroPop = (int) vector.get(tamanoVector - 1);
        
        vector.removeElementAt(tamanoVector- 1);
        return numeroPop;
    }
    

    
    
}
