package IvaMargenBeneficios;

import java.util.Scanner;

public class ProgramIvaMargen {

	public static  float cantidadIva4=1.045f;
	public static float cantidadIva10=1.114f;
	public static float cantidadIva21=1.262f;

	public static float calcularIva4(float precioProveedor) {


		float precioFinal4= precioProveedor*cantidadIva4;
		precioProveedor=precioFinal4;

		/*try {
			precioFinal =precioProveedor* cantidadIva4;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		return precioProveedor;
	}
	public static float calcularIva10(float precioProveedor) {


		float precioFinal10 = precioProveedor*cantidadIva10;
		precioProveedor= precioFinal10;

		/*try {
			precioFinal =precioProveedor* cantidadIva4;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		return precioProveedor;
	}

	public static float calcularIva21(float precioProveedor) {


		float precioFinal21 = precioProveedor* cantidadIva21;
		precioProveedor= precioFinal21;

		/*try {
			precioFinal21 =precioProveedor* cantidadIva21;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


		return precioProveedor;
	}
	public static float porcentajeBeneficios(float precioProveedor,float dimePorcentaje ,float precioFinal) {
		 float precioFinalBen=0;
		  //dimePorcentaje=0;
		 // precioProveedor=0;
		//float dimePorcentaje30= dimePorcentaje *precioProveedor;
		//dimePorcentaje30 = precioFinalBen;
		precioFinal =  (precioProveedor *   dimePorcentaje)/100;
		precioFinalBen = precioProveedor + precioFinal;

		return precioFinalBen;

	}
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce el precio inicial:");
		float precioProveedor= teclado.nextFloat();
		System.out.println("El precio inicial es de: " + precioProveedor);

		calcularIva4(precioProveedor);
		System.out.println("Aplicandole el 4% de IVA reducido, es igual a: " + calcularIva4(precioProveedor));

		calcularIva10(precioProveedor);

		System.out.println("Aplicandole el 10% de IVA reducido, es igual a : " + calcularIva10( precioProveedor));
		calcularIva21(precioProveedor);


		System.out.println("Aplicandole el 21% de IVA , es igual a : " + calcularIva21(precioProveedor));


		float dimePorcentaje=0;
		float precioFinalBen;
		float precioFinal=0;
		System.out.println("Dime el el precio del proveedor, más iva");
		precioProveedor=teclado.nextFloat();
		System.out.println("Dime el porcentaje de beneficios para aplicar");
		dimePorcentaje=teclado.nextFloat();
		
		
		
		porcentajeBeneficios( precioProveedor, dimePorcentaje , precioFinal);
		System.out.println(" Aplicando el  " +dimePorcentaje+ " % al precio del proveedor  "+ precioProveedor+
				" ,el precio final de venta es: "+  porcentajeBeneficios (precioProveedor, dimePorcentaje , precioFinal));
		
		//System.out.println(porcentajeBeneficios (precioProveedor, dimePorcentaje , precioFinal));
	

	}





}
