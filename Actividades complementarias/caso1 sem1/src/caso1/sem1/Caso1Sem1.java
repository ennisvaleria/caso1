/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1.sem1;

import java.util.Scanner;

/**
 *
 * @author valer
 */
public class Caso1Sem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in); //permite leer todo lo que ingresamos
        Producto[] productos= new Producto[3]; //Arrelgo que guarda 3 objetos  de tipo Producto
        //producto[0], producto[1], producto[2]
        for(int i=0; i<productos.length;i++) //bucle
        {
            System.out.println("Ingrese el codigo del producto: ");
            int codigo=Integer.parseInt(sc.nextLine());
            
            System.out.println("----------------------");
            
            System.out.println("Ingrese el nombre del producto: ");
            String nombre = sc.nextLine();
            
            System.out.println("----------------------");
            
            System.out.println("Ingrese el precio del producto: ");
            double precio = Double.parseDouble(sc.nextLine());
            
            System.out.println("----------------------");
            
            System.out.println("Ingrese el stock del producto: ");
            int stock= Integer.parseInt(sc.nextLine());
            
            System.out.println(".............................");
            
            productos[i] = new Producto(codigo, nombre, precio, stock); //se crea un objeto Producto y se guarda en la posición i del arreglo
            //Así en cada vuelta del bucle se llena una cajita
        }
        
        //for(int i=0; i<productos.length; i++) //permite imprimir todos los productos también (for clásico)
        //{   System.out.println(productos[i]);
        //}
        
        double acumulador_Precio=0;
        
        Producto mayor_Precio= productos[0];
        //Producto ---> Tipo de dato
        //mayorPrecio ---> Variable Temporal, se guarda el objeto que tenga
        //mayor precio temporalmente
        //productos[0] ---> se asigna el primer producto del arreglo como punto de partida
        System.out.println("Lista de productos registrados: ");
        
        for (Producto p: productos) //for each "Para cada Producto p que hay en productos"
            //Producto ---> Tipo de dato de cada elemento del arreglo
            //p ---> variable temporal que representa el producto actual en cada vuelta (producto[0], producto[1], producto[2])
            //: significa "qué está en" o "de"
            //productos ---> arreglo que voy a recorrer 
        {
            System.out.println("___________________________");
            System.out.println(p); //imprime cada producto
            
            acumulador_Precio+=p.getPrecio(); //suma al total
            
            if(p.getPrecio() > mayor_Precio.getPrecio()) //p.getPrecio--->obtiene el precio actual del producto en el bucle.
                                                        //p ---> es el producto del q estamos obteniendo el precio.
                mayor_Precio = p; //actualiza el mayor precio
        }
        
       System.out.println("-----------------------------");
       System.out.println("La sumatotal de precios es: " + acumulador_Precio);
       System.out.println("El producto con mayor precio es: " + mayor_Precio);
       
       sc.close();
       System.out.println("Cambiasoooo");
       System.out.println("Viva la grasas:v")
    }
    
}
