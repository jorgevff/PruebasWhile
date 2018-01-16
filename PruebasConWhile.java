
/**
 * Write a description of class PruebasConWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebasConWhile
{
    // instance variables - replace the example below with your own

    public PruebasConWhile()
    {
        // initialise instance variables

    }

    public void multiplosDe5()
    {
        int indice = 10;
        while(indice < 100){
            System.out.print(indice + " ");
            indice = indice + 5;
        }

    }

    public void sumaEntre1Y10()
    {
        int indice = 1;
        int suma = 0;
        while (indice < 11){
            suma = suma + indice;
            indice++;

        }
        System.out.println(" la suma de los diez primeros numeros es: " + suma);
    }

    public void sum(int a, int b){
        int numero1 = a;
        int numero2 = b;
        int suma = 0;
        if(numero1 < numero2){
            while (numero1 <= numero2){
                suma = suma + numero1;
                numero1++;
            }
        }
        else if(numero2 < numero1){
            while (numero2 <= numero1){
                suma = suma + numero2;
                numero2++;
            }
        }
        System.out.println(" la suma es: " + suma);
    }

    public boolean numeroPrimo(int numero){
        boolean primo = true;
        int contador = 2;
        
        while (contador < numero && primo){
            if (numero % contador == 0)
                primo = false;
            contador++;
        }

        return primo;
    }

}
