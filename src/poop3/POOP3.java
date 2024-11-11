/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author estudiante
 */
public class POOP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nums[]; // forma 1
        int[] nums2 = {1, 2, 3, 4, 5}; // forma 2
        int[] nums3 = new int[5]; // forma 3
        int[] nums4; // forma 4
        nums4 = new int[5]; // forma 5

        System.out.println("########## for each ##########");
        for (int temp : nums2) {
            System.out.println("Cuenta " + temp);
        }

        System.out.println("########## for ##########");
        for (int i = 0; i < nums4.length; i++) {
            nums4[i] = i * 10;
        }

        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }

        System.out.println("########## String ##########");
        String cadena = new String("Hola mundo"); // forma 1
        System.out.println(cadena);
        String cadena1 = "Hola mundo de forma recomendada"; // forma 2
        System.out.println(cadena1);

        String nombre = "Derek";
        String apellido = "Chavez";
        System.out.println(nombre); // forma 1
        System.out.println(apellido);
        System.out.println(nombre + " " + apellido); // forma 2
        String nombreCompleto = nombre + " " + apellido; // forma 3
        System.out.println(nombreCompleto);

        System.out.println("########## Wrapper ##########");
        int a = 4;
        Integer b = new Integer(4); // forma 1 no recomendada
        System.out.println(b);
        Integer c = 4; // forma 2
        System.out.println(c);
        Integer d = a;
        String cadena3 = d.toString(); // forma 1
        System.out.println(cadena3);
        String cadena4 = 4 + ""; // forma 2
        System.out.println(cadena4);

        System.out.println("########## Colecciones ##########");
        System.out.println("########## ArrayList ##########");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(33);
        miArrayList.add(77);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(1, 10);
        System.out.println(miArrayList.size());

        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }

        miArrayList.add(77);
        System.out.println("***");
        for (Integer temp : miArrayList) {
            System.out.println(temp);
        }
        System.out.println("Nuevo tamaño: " + miArrayList.size());

        System.out.println("########## Hashtable ##########");
        Hashtable<Integer, String> miTabla = new Hashtable<Integer, String>();
        miTabla.put(1, "uno");
        miTabla.put(434343323, "Derek");
        miTabla.put(5125152, "Lili");
        System.out.println("Elementos en tabla: " + miTabla.size());

        System.out.println("########## Enumerador ##########");
        Integer llave;
        String valor;

        Enumeration<Integer> enumeradorLlaves = miTabla.keys();
        while (enumeradorLlaves.hasMoreElements()) {
            llave = enumeradorLlaves.nextElement();
            valor = miTabla.get(llave);
            System.out.println(llave + " " + valor);
        }

        System.out.println("########## Diccionario ##########");
        Hashtable<String, String> diccionario = new Hashtable<>();

        diccionario.put("Perro", "Animal doméstico de cuatro patas, considerado el mejor amigo del hombre");
        diccionario.put("Casa", "Edificio para habitar, hogar donde vive una persona o familia");
        diccionario.put("Libro", "Conjunto de hojas escritas que forman una obra literaria o educativa");
        diccionario.put("Computadora", "Máquina electrónica capaz de procesar información y realizar cálculos");
        diccionario.put("Teléfono", "Dispositivo de comunicación para hablar a distancia");
        Enumeration<String> palabras = diccionario.keys();
        while (palabras.hasMoreElements()) {
            String palabra = palabras.nextElement();
            String definicion = diccionario.get(palabra);
            System.out.println(palabra + ": " + definicion);
        }

        System.out.println("\n########## Agenda ##########");
        Hashtable<String, Calendar> agenda = new Hashtable<>();

        Calendar cal1 = Calendar.getInstance();
        cal1.set(1995, Calendar.JANUARY, 15);

        Calendar cal2 = Calendar.getInstance();
        cal2.set(1998, Calendar.MARCH, 22);

        Calendar cal3 = Calendar.getInstance();
        cal3.set(1990, Calendar.JULY, 5);

        Calendar cal4 = Calendar.getInstance();
        cal4.set(1993, Calendar.OCTOBER, 30);

        Calendar cal5 = Calendar.getInstance();
        cal5.set(1997, Calendar.DECEMBER, 25);

        agenda.put("Miguel Ángel Pérez", cal1);
        agenda.put("Ana María González", cal2);
        agenda.put("José Luis Rodríguez", cal3);
        agenda.put("María Fernández", cal4);
        agenda.put("Roberto Sánchez", cal5);
        Enumeration<String> nombres = agenda.keys();
        while (nombres.hasMoreElements()) {
            String nombrePersona = nombres.nextElement();
            Calendar cumple = agenda.get(nombrePersona);
            System.out.printf("%s: %d/%d/%d%n", nombrePersona, cumple.get(Calendar.DATE), cumple.get(Calendar.MONTH) + 1, cumple.get(Calendar.YEAR));
        }
    }
}

