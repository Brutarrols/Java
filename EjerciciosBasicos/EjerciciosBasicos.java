import java.util.ArrayList;

public class EjerciciosBasicos {
    public static void imprimirNumeros()
    {
        int numeros = 0;
        while(numeros <= 255)
        {
            System.out.println(numeros);
            numeros++;
        }
    }

    public static void imprimirNumerosImpares()
    {
        int numeros = 0;
        while(numeros <= 255)
        {
            if(numeros % 2 != 0)
            {
                System.out.println(numeros);
            }
            numeros++;
        }
    }

    public static void imprimirSuma()
    {
        int numero1 = 0;
        int numero2 = 1;
        int resultado = 0;

        while(numero1 <= 255)
        {
            resultado = numero1 + numero2;
            System.out.println(numero1+ " + "+ numero2+ " = "+ resultado);
            numero1 = numero2;
            numero2 = resultado;
        } 
    }

    public static void recorrerArreglo(int array[])
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }
    }

    public static void maximoArreglo(int array[])
    {
        int maximo = array[0];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > maximo)
            {
                maximo = array[i];
            }
        }

        System.out.println(maximo);
    }

    public static void promedio(int array[])
    {
        int suma = 0;

        for(int i = 0; i < array.length; i++)
        {
            suma += array[i];
        }
        System.out.println("Promedio de: "+ suma / (array.length+1));
    }

    public static void arrayImpares()
    {
        ArrayList<Integer> y = new ArrayList<Integer>();

        for(int i = 0; i <= 255; i ++)
        {
            if(i % 2 != 0)
            {
                y.add(i);
            }
        }

        System.out.println(y);
    }

    public static void contarMayores(int array[], int numero)
    {
        int contador = 0;

        for(int i = 0; i < array.length;i++)
        {
            if(array[i] > numero)
            {
                contador++;
            }
        }

        System.out.println("hay "+contador +" numeros mayores que "+numero);
    }

    public static void valoresCuadrado(int array[])
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] *= array[i];
            System.out.println(array[i]);
        }
    }

    public static void reemplazoNegativos(int array[])
    {
        for(int i = 0; i< array.length; i++)
        {
            if(array[i] < 0)
            {
                array[i] = 0;
            } 
            System.out.println(array[i]);
        }
        
    }

    public static ArrayList<Integer> mayorMenorProm(int array[])
    {
        int suma = 0, mayor = 0, menor = array[0];
        ArrayList<Integer> newarreglo = new ArrayList<Integer>();

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < menor)
            {
                menor = array[i];
            }
            if(array[i] > mayor)
            {
                mayor = array[i];
            }
            suma += array[i];
        }

        newarreglo.add(mayor);
        newarreglo.add(menor);
        newarreglo.add(suma / (array.length +1));

        return newarreglo;
    }

    public static void cambioArreglo(int[] x)
    {
        for(int i = 0; i < x.length; i++)
        {
            if(i+1 < x.length)
            {
                x[i] = x[i+1];
            }
            else 
            {
                x[i] = 0;
            }
            System.out.println(x[i]);
        }
        
    }
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,4,5,6,7,8,9,0};
        int[] arreglo2 = {1,2,3,4,-5,-6,7,8,9,0};
        ArrayList<Integer> nuevoarreglo = new ArrayList<Integer>();
        
        imprimirNumeros();
        imprimirNumerosImpares();
        imprimirSuma();
        recorrerArreglo(arreglo);
        promedio(arreglo);
        arrayImpares();
        contarMayores(arreglo, 7);
        valoresCuadrado(arreglo);
        reemplazoNegativos(arreglo2);

        nuevoarreglo = mayorMenorProm(arreglo);

        System.out.println(nuevoarreglo);
        //Arrays.toString(arreglo)

        cambioArreglo(arreglo2);
    }
}
