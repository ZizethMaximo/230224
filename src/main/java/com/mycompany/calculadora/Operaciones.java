package com.mycompany.calculadora;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL 7490
 */
import javax.swing.JOptionPane;

public class Operaciones {
 
    int suma;
    int resta;
    int multiplicacion;
    int division;
    int modulo;
    
  
  //Metodo de suma
  public void sumar(int numero1, int numero2){
      suma=numero1=numero2;
  }
  
  public void restar(int numero1, int numero2){
    resta=numero1-numero2;
  }
  
  public void multiplicacion(int numero1, int numero2){
      multiplicacion=numero1*numero2;
  }
  
  public void division(int numero1, int numero2){
      division=numero1/numero2;
  }
  public void modulo(int numero1, int numero2){
      modulo=numero1%numero2;
  }
  
  public void mostrarResultados(){
      System.out.println("La suma es "+suma);
      System.out.println("La resta es "+resta);
      System.out.println("La multiplicacion es "+multiplicacion);
      System.out.println("La division es "+division);
      System.out.println("El modulo es "+modulo);
  }
  
}
