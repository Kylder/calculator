package calculadora;

import javax.swing.JOptionPane;
import java.util.*;

public class Operacion 
{ //atributos 
  int numero1;
  int numero2;
  int suma;
  int resta;
  int multiplicacion;
  int division;

  //metodos

  //ingresar numero
  public void leerNumeros()
  {
      //Scanner n1=new Scanner(System.in);
      //n1=numero1.nextInt();
      //Scanner n2=new Scanner(System.in);
      //n2=numero2.nextInt();
      numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero1: "));
      numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingresar numero2: "));
  }
  public void sumar()
  {
      suma = numero1+numero2; 
  }
  public void restar()
  {
      resta=numero1-numero2;
  }
  public void multiplicar()
  {
      multiplicacion=numero1*numero2;
  }
  public void dividir()
  {
      division = numero1/numero2;
  }
  public void resultados()
  {
      System.out.println("La suma es: "+suma);
      System.out.println("La Resta es: "+resta);
      System.out.println("La multiplicacion es: "+multiplicacion);
      System.out.println("La division es: "+division);
  }
}
