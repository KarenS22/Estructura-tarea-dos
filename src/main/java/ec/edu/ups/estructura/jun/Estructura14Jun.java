/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.estructura.jun;

import java.util.Arrays;

/**
 *
 * @author ACER
 */
public class Estructura14Jun {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementacion generica ");

        //Instancias de las clases
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>();
        ColaTareas<int[]> colaTareasArreglosEnteros = new ColaTareas<>();
        ColaTareas<String[]> colaTareasArreglosString = new ColaTareas<>();

        //pilas
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();

        //Insercion de tareas a la cola
        colaTareas.agregarTareas(new Tarea(1, "Tarea 1"));
        colaTareas.agregarTareas(new Tarea(2, "Tarea 2"));
        colaTareas.agregarTareas(new Tarea(3, "Tarea 3"));

        colaTareasInt.agregarTareas(new Tarea(4, 4));
        colaTareasInt.agregarTareas(new Tarea(5, 5));
        colaTareasInt.agregarTareas(new Tarea(6, 6));

        int a[] = {100, 101, 102};
        colaTareasArreglosEnteros.agregarTareas(new Tarea(7, a));
        int b[] = {200, 201, 202};
        colaTareasArreglosEnteros.agregarTareas(new Tarea(8, b));
        int c[] = {300, 301, 303};
        colaTareasArreglosEnteros.agregarTareas(new Tarea(9, c));

        String[] d = {"a", "b", "c"};
        colaTareasArreglosString.agregarTareas(new Tarea(10, d));
        String[] e = {"d", "e", "f"};
        colaTareasArreglosString.agregarTareas(new Tarea(11, e));
        String[] f = {"g", "h", "i"};
        colaTareasArreglosString.agregarTareas(new Tarea(12, f));

        pilaTareas.agregarTarea(new Tarea(13, 13));
        pilaTareas.agregarTarea(new Tarea(14, 14));
        pilaTareas.agregarTarea(new Tarea(15, 15));
        
        ColaTareas<String> cT = colaTareas;
        pilaTareasDeColas.agregarTarea(new Tarea(16, cT));
        

        //Procesar las tareas de la Cola<String>
        while (!colaTareas.estaVacia()) {
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();

            //Es lo mismo que el toString
            System.out.println("Procesando tarea de la cola: \n\t Sale-->" + tareaProcesada.getId() + "-" + tareaProcesada.getAtributo());
        }
        System.out.println("-------------------------------------------------");

        while (!colaTareasInt.estaVacia()) {
            Tarea<Integer> tareaProcesadaInt = colaTareasInt.procesarTarea();
            System.out.println("Procesando tarea cola: \n\t Sale-->" + tareaProcesadaInt.getId() + "-" + tareaProcesadaInt.getAtributo());
        }
        System.out.println("-------------------------------------------------");
        while (!colaTareasArreglosEnteros.estaVacia()) {
            Tarea<int[]> tProceAE = colaTareasArreglosEnteros.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProceAE.getId() + "-" + Arrays.toString(tProceAE.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------------");
        while(!colaTareasArreglosString.estaVacia()){
            Tarea<String[]> tProAS = colaTareasArreglosString.procesarTarea();
            System.out.println("Procesando \n\t Sale-->" + tProAS.getId() + "-" + Arrays.toString(tProAS.getAtributo()));
        }
        
        System.out.println("---------------------------------------------------");
        while (!pilaTareas.estaVacia()) {
            Tarea<Integer> tareaProcesadaP = pilaTareas.procesarTarea();
            System.out.println("Procesando tarea de pila: \n\t Sale-->" + tareaProcesadaP.getId() + "-" + tareaProcesadaP.getAtributo());
        }
        
        System.out.println("------------------------------------------");
    }
    
}
