/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 * Clase con diferentes estructuras de control, utilerías y clases de uso general
 * @author Sara Alejandra Cardenas
 */

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("####### arreglos ######");
        int[]nums;
        int[] nums1;
        int [] nums2;
        int nums3[];
        int[] nums4 = {1, 2, 3, 4};
       
        System.out.println("####### for ######");
        for (int i = 0; i < nums4.length; i++) {
            int j = nums4[i];
            System.out.println(j);
        }
       
        System.out.println("####### for-each ######");
            for (int i : nums4) {
                System.out.println(i);
            }
           
        System.out.println("####### concatenar ######");
        String s =new String("Hola Mundo");
        String s1 ="Hola Mundo";
        System.out.println(s);
        System.out.println(s1);
        String nombre ="Sara";
        String apellido ="Cardenas";
        String nombreCompleto = nombre+" "+ apellido;
        System.out.println(nombreCompleto);
       
       /**
        * 
        */
        System.out.println("####### ordenar punto ######");
        System.out.println("nume elementos del arreglo: " +nums4.length);
        System.out.println("num elementos de nombre: "+nombre.length());
        System.out.println(nombreCompleto.toUpperCase());
        System.out.println(nombreCompleto);
       
        System.out.println("####### Wrappers y Autoboxing ######");
        int a=3;
        Integer k = new Integer(50);
        Integer l = 22;
        int r =l;
        int b=7;
        float c=b; //->casteo
        int d= (int) c;
        Integer rr=r;
        String s3 =rr.toString();
        System.out.println(s3);
        String s4 =r + ""; //Comillas es un conjunto vacio
        System.out.println(s4);
        System.out.println(s4.length());
        //Parseo: To parceo
        //Casteo: To cast
       
        System.out.println("####### Colecciones ######");
       
        System.out.println("####### arrayList ######");
        ArrayList<Integer>miArrayList = new ArrayList<Integer>();
        miArrayList.add(d);
        miArrayList.add(9);
        System.out.println(miArrayList.size());
        System.out.println(miArrayList.get(0));
        miArrayList.add(0,20);
        System.out.println("***");
        for (Integer integer : miArrayList) {
            System.out.println(integer);
        }
       
        System.out.println("####### HashTable ######");
        Hashtable<Integer,String> agenda=new Hashtable<Integer,String>();
        agenda.put(k, "Fernando");
        agenda.put(12347, "Araceli");
        agenda.put(9812, "Xuri");
        agenda.put(8463, "Uriel");
        System.out.println(agenda.size());
        System.out.println("***");
        for (String valor: agenda.values()) {
            System.out.println(valor);
        }
        for(Integer clave : agenda.keySet()){
            System.out.println(clave);
        }
        System.out.println("####### Enumeracion ######");
        Integer clave;
        String valor;
        Enumeration <Integer> llaves =agenda.keys();
        while (llaves.hasMoreElements()) {
            clave=llaves.nextElement();
            valor=agenda.get(clave);
            System.out.println("Clave: "+clave+" "+ "Valor: "+valor);
        }
       
        System.out.println("####### MATH ######");
        System.out.println(Math.PI);
        System.out.println(Math.abs(-5));
        System.out.println(Math.pow(3,2));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.max(80,7));
       
        System.out.println("####### DATE ######");
        Date hoy=new Date();
        System.out.println(hoy);
        
   
    }
}
    
