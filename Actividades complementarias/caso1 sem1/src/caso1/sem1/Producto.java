/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1.sem1;

/**
 *
 * @author valer
 */
class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;
    
    
    public Producto(int codigo, String nombre, double precio, int stock)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }
    
    public String toString()
    {
        return "Codigo: " + this.codigo +
                 ", Nombre: " + this.nombre +
                ", Precio: " + this.precio +
                ", Stock: " + this.stock;
    }
    
    public double getPrecio()
    {
        return precio;
    }
}
