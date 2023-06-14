/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.estructura.jun;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ACER
 */
public class ColaTareas<T> {
    
    private Queue<Tarea<T>> colaTareas;

    public ColaTareas() {
        colaTareas = new LinkedList<>();
    }
    
    public void agregarTareas(Tarea<T> tarea){
        
        colaTareas.offer(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        //manera larga y corta
        //Tarea<T> tareaProcesada = colaTareas.poll();
        //return tareaProcesada;
        return colaTareas.poll();
    }
    
    public boolean estaVacia(){
        return colaTareas.isEmpty();
    }
}

