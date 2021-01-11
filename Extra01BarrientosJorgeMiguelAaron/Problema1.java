/**
 *Clase que, teniendo una cantidad de horas, devuelve la cantidad
 *de semanas, dias y horas equivalentes
 *@author Jorge Miguel Aaron Barrientos Alvarea. NC:421111666
 *@version 1.0 noviembre 2020
 *@since ICC 20201-1
 */
public class Problema1{

    public static void Cantidades(int cantidadHoras){
	int semanas, dias, horas;

	semanas=cantidadHoras/168;
	dias=(cantidadHoras-(semanas*168))/24;
	horas=(cantidadHoras-(semanas*168)-(dias*24));
	System.out.println(semanas+" semanas"+" "+dias+" dias"+" "+horas+" horas");
	
    }
           
    public static void main(String[] args){
        Cantidades(1000);
	Cantidades(2540);
	Cantidades(2626);
	Cantidades(3650);
	   
    }
}
