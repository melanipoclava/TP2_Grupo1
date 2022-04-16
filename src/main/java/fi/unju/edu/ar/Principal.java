package fi.unju.edu.ar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import punto13.Empleado;

public class Principal {
	public static void main(String[]args) {	

		//punto 13 op1
		LocalDate fech = LocalDate.of(2021,10,11);	
		Empleado unempleado = new Empleado("fer", fech, 323, "fer@gmail", 123);
		System.out.println(unempleado.getNombre()+" "+unempleado.getEmail()+" "+unempleado.getFechaIngreso()+" "+unempleado.getLegajo()+" "+unempleado.getHorasTrabajadas()+" "+unempleado.getSueldo());
		// punto 13 op2
		Scanner scanner = new Scanner(System.in);
		Empleado otroEmpleado = new Empleado();
		//tomo nombre por teclado
		System.out.println("Ingrese el Nombre del Empleado: ");
		String cad=scanner.next();
		otroEmpleado.setNombre(cad);
		//ingreso gmail x teclado
		System.out.println("Ingrese su Gmail: ");
		cad=scanner.next();
		otroEmpleado.setEmail(cad);
		//legajo
		System.out.println("Ingrese su Legajo: ");
		int val=scanner.nextInt();
		otroEmpleado.setLegajo(val);
		//ingreso
		System.out.println("ingresar una fecha en este formato yyyy/mm/dd: ");
		String fecha = scanner.next();
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate fechaIng = LocalDate.parse(fecha, formateador);
		otroEmpleado.setFechaIngreso(fechaIng);
		//horas de trabajo
		System.out.println("Ingrese las hs Trabajadas: ");
		int hs=scanner.nextInt();
		otroEmpleado.setHorasTrabajadas(hs);
		scanner.close();
		System.out.println(otroEmpleado.getNombre()+" "+otroEmpleado.getEmail()+" "+otroEmpleado.getLegajo()+" "+otroEmpleado.getSueldo()+" "+otroEmpleado.getHorasTrabajadas()+" "+otroEmpleado.getFechaIngreso()+" "); 
		//punto 14
		//constructor por defecto;
		Empleado primEmpleado = new Empleado();
		
		//  constructor parametrizado con solo nombre legajo y horas trabajadas
		Empleado terEmpleado = new Empleado("jorge",123, 154);
		//constructor parametrizado con solo nombre fecha ingreso y horas trabajadas
		LocalDate fechemp = LocalDate.of(2021,10,11);
		Empleado segEmpleado = new Empleado("ricardo",fechemp,176);
		//nombre y horas trabajadas
		Empleado cuarEmpleado = new Empleado("joaquin", 192);
		//muestro los objetos creados
		//preguntar si ay que formuar mas el mje de salida
		System.out.println(primEmpleado.getNombre()+" "+primEmpleado.getLegajo()+" "+primEmpleado.getEmail()+" "+primEmpleado.getFechaIngreso()+" "+primEmpleado.getHorasTrabajadas()+" $"+primEmpleado.getSueldo()+" ");
		System.out.println(terEmpleado.getNombre()+" "+terEmpleado.getLegajo()+" "+terEmpleado.getEmail()+" "+terEmpleado.getFechaIngreso()+" "+terEmpleado.getHorasTrabajadas()+" $"+terEmpleado.getSueldo()+" ");
		System.out.println(segEmpleado.getNombre()+" "+segEmpleado.getLegajo()+" "+segEmpleado.getEmail()+" "+segEmpleado.getFechaIngreso()+" "+segEmpleado.getHorasTrabajadas()+" $"+segEmpleado.getSueldo()+" ");
		System.out.println(cuarEmpleado.getNombre()+" "+cuarEmpleado.getLegajo()+" "+cuarEmpleado.getEmail()+" "+cuarEmpleado.getFechaIngreso()+" "+cuarEmpleado.getHorasTrabajadas()+" $"+cuarEmpleado.getSueldo()+" ");
		

	}
	
	
}