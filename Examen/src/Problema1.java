

import java.util.Scanner;

public class Problema1 {
	private String nombre;
	private int edad;
	private Scanner teclado;
	
	public Problema1()
	{	
		teclado = new Scanner(System.in);
		System.out.println("Introduce el nombre del alumno: ");
		nombre = teclado.next();
		System.out.println("Introduce la Edad: ");
		edad = teclado.nextInt();
		
	}
	
	public void Imprimir ()
	{
		System.out.println("El alumno: " + nombre);
		System.out.println("Su edad es: " + edad);
	}
	
	public void mayorEdad()
	{
		if(edad>=18)
		{
			System.out.println("Es mayor de Edad");
		}
		else
		{
			System.out.println("Es menor de Edad");
		}		
	}
	public static void main (String[] args) {
		
		Problema1 alumno1=new Problema1();
		alumno1.Imprimir();
		alumno1.mayorEdad();
		 
	}
	}

