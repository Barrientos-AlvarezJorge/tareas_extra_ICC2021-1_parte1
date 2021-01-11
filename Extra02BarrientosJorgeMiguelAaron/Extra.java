import java.util.Scanner;

/**
 *Clase Extra de tarea de la clase de ayudantía del curso de ICC 2021-1
 *@author Jorge Miguel Aaron Barrientos Alvarez. NC:421111666
 *@since Clase de ayudantía del curso de ICC 20201-1
 *@version 1.0 noviembre 2020
 */

public class Extra{
    
    /**
     *Método que regresa el mayor de dos números
     *@param un número 'a' para comparar
     *@param un número 'b' para comparar
     *@return el número más grande entre 'a' y 'b'
     */
    public static int esMayor(int a, int b){
	if(a>b)
	    return a;

	else
	    return b;	     
    }

    /**
     *Metodo que genera los primeros 50 numeros primos
     *Exceptuando, usando un 'continue', el número 163
     */
    
    public static void numerosPrimos(){
	int numero=1;
	int i=0;

	while(i<50){
	    numero++;
	    if(numero==163)
		    continue;

	    int contador=0;
	    for(int k=2; k<=numero; k++){
		if(numero%k==0)
		    contador++;
	    }
	     
	    if(contador<2){	
		System.out.println("\nPrimo "+(i+1)+" "+numero);
		i++;
	    }
	}	
    }

    /**
     *Método que muestra los numeros impares que hay 
     *entre el 1 y el 50. Usa la función de 'continue' para
     *mostrar sólo los números impares.
     */
    public static void usoDeWhile(){
	int i=0;
	while(i<50){
	    i++;
	    if(i%2==0)
		continue;

	    System.out.println(i);
	}
    }
    
    public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	int opcion=0;

	do{
	    System.out.print("\n**Menu**\n"+
			     "[1] Metodo que muestra el mayor de dos numeros\n"+
			     "[2] Metodo que muestra los primeros 50 numeros primos\n"+
			     "[3] Metodo que muestra el uso de While\n"+
			     "[4] Salir\n"+
			     "Elige una opcion: ");
	    opcion=sc.nextInt();
	    sc.nextLine();

	    switch(opcion){
	    case 1:
		System.out.print("\nIngresa el primer numero a comparar: ");
		int a=sc.nextInt();
		System.out.print("\nIngresa el segundo numero a comparar: ");
		int b=sc.nextInt();
		System.out.print("\nEl numero mas grande entre "+a+" y "+b+
				 "es: "+esMayor(a,b)+"\n");
		break;

	    case 2:
		numerosPrimos();
		break;

	    case 3:
	        usoDeWhile();
		break;

	    case 4:
		System.out.println("Sale master te me kuidas.");
		break;

	    default:
		System.out.println("Lo siento, no cuento con esa opcion.");
		    
	   
	    }

	    
	}while(opcion!=4);
    }

	



}
