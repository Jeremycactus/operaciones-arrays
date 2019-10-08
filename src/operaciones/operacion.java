
package operaciones;

import java.util.Scanner;

/**
 *
 * @author estudiante
 */
public class operacion {
    public int [] arreglo = new int[10];
    public int opcion;
    //constructor
    public operacion (){
        this.mostrarMenu();
    }
    //muestra el menu en pantalla
    public void mostrarMenu(){
        System.out.println("1.Llenar Array\n"
                + "2.Escribir arrays\n"
                + "3.Sumatoria\n"
                + "4.Productoria\n"
                + "5.Tamaño del array\n"
                + "6.Salir");
        Scanner lectura = new Scanner ( System.in );
        opcion = lectura.nextInt();
        this.cargarOpcion(opcion);
    }
    //lee arreglo
    public void leerArreglo(){
        System.out.println("has escojido leer arreglo");
    }
    //escribir arreglo
    public void ecribirArreglo(){
        System.out.println("has escojido ascribir arreglo");
    }
    //genera sumatoria
    public void sumatoria(){
        System.out.println("has escojido sumatoria");
    }
    //genera productoria 
    public void productoria (){
        System.out.println("has ecogido productoria");
    }
    public void cargarOpcion (int op){
        switch(op){
            case 1:
                this.leerArreglo();
                break;
            case 2:
                this.ecribirArreglo();
                break;
            case 3:
                this.sumatoria();
                break;
            case 4:
                this.productoria();
                break;
            case 5: 
                System.out.println(this.arreglo.length);
                break;
                
            default:
                System.out.println("opcion no valida");
                
        }
        //System.out.println("La opcion escojida es: "+ op);
    }
}

