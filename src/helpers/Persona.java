/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author Angie Rivera 201910010322
 */
public class Persona {
    
    
    //Metodos
    public String Nombre;
   
    private int Edad;
    
    private String Correo;
    
    private String  Recidencia;
    
    
//Constructor
    public Persona() {
}
    
     public void Setnombre (String _nombre) {
        this.Nombre= _nombre;
        }
    
      //codificando metodo para imprimir el nombre 
        public String getnombre(){
           return Nombre ; 
     }
     
    
   public void Setedad(int _edad){
       this.Edad = _edad;
   }
      public int getEdad (){
        return Edad;
   }
   
   public void Setcorreo(String _correo){
       this.Correo = _correo;  
   }
   public String getcorreo(){
    return Correo;
   }
   
   public void Setrecidencia(String _recidencia){
       this.Recidencia= _recidencia;
   }
   
   public String getrecidencia(){
       return Recidencia;
   }
   
   //Imprimir la informacion
   public void ImprimirInformacionPersona(){
       System.out.println("NOMBRE COMPLETO: "+ Nombre);
       System.out.println("EDAD: "+ Edad);
       System.out.println("CORREO: "+ Correo);
       System.out.println("RECIDENCIA: "+ Recidencia);
   }
   
    public void ImprimirInformacionDoctor(){
       System.out.println("NOMBRE COMPLETO: "+ Nombre);
       System.out.println("EDAD: "+ Edad);
       System.out.println("CORREO: "+ Correo);
       System.out.println("RECIDENCIA: "+ Recidencia);
   }
    
     public void ImprimirInformacionDeportista(){
       System.out.println("NOMBRE COMPLETO: "+ Nombre);
       System.out.println("EDAD: "+ Edad);
       System.out.println("CORREO: "+ Correo);
       System.out.println("RECIDENCIA: "+ Recidencia);
   }
    
}
