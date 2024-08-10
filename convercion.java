import java.util.Scanner;

/**
 * Esta es la clase conversion 
 * @param metros se convierten a pulgadas 
 * @author Manuel Mansilla
 * @since 02/08/2024
 */
public class convercion
{
    /**
     * Este el el método principal que se encarga de convertir metros a pulgadas
     * @param args da un listado de valores con forme a lo solicitado 
     * @since 02/08/2024
     */
    public static void main(String[] args)
    {
        // Definimos scan para el ingreso de datos 
        Scanner entrada = new Scanner(System.in);

        // ingreso de datos 
        System.out.println("Ingrese la longitud");
        double longitud = entrada.nextDouble();

        // comprobando que los datos no sean negativos 
        if (longitud < 0)
        {
            System.out.println("Datos inválidos");
        }
        else
        {   
            // realizando la operacion que nos devuelve los metros en pulgadas 
            double pulgadas = longitud * 39.37;

            // mostrando resultados 
            System.out.println("La conversion es igual a: ");
            System.out.println(pulgadas);
        }
    }
}
