import java.util.*;

public class PuzzleJava {
    
    public static ArrayList<Integer> imprimoSumaYArreglo()
    {
        int[] arreglo = {3,5,1,2,7,9,8,13,25,32};
        ArrayList<Integer> retorno = new ArrayList<Integer>();
        int suma = 0;
        for(int i = 0 ; i < arreglo.length; i++ )
        {
            suma += arreglo[i];

            if(arreglo[i] > 10)
            {
                retorno.add(arreglo[i]);
            }
        }
        System.out.println("La suma de todos los numeros en el arreglo es: "+ suma);

        return retorno;

    }

    public static ArrayList<String> mezcloImprimoDevuelvo()
    {
        ArrayList<String> arreglo = new ArrayList<String>();
        ArrayList<String> retorno = new ArrayList<String>();

        arreglo.add( "Nancy"); 
        arreglo.add( "Jinichi");
        arreglo.add("Fujibayashi");
        arreglo.add( "Momochi");
        arreglo.add("Ishikawa");

        Collections.shuffle(arreglo);

        for (String i : arreglo) {
            if (i.length() > 5)
            {
                retorno.add(i);
            }
        }

        return retorno;

    }

    public static void abecedario()
    {
        ArrayList<Character> abecedario  = new ArrayList<Character>();
        
        for(int i = 97; i <= 122; i++)
        {
            abecedario.add(((char) i));
        }

        //System.out.println(abecedario.get(25));

        Collections.shuffle(abecedario);
         
        
        System.out.println("Ultima letra:  " + abecedario.get(abecedario.size()-1));

        if(abecedario.get(0) == 'a' || abecedario.get(0) == 'e' || abecedario.get(0) == 'i' || abecedario.get(0) == 'o' || abecedario.get(0) == 'u')
        {
            System.out.println("La primera letra es la vocal: " + abecedario.get(0));
        }
        else
        {
            System.out.println("Primera letra: "+ abecedario.get(0));
        }
    }

    public static ArrayList<Integer> numerosRamdom()
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        Random rm = new Random();

        for(int i = 0;  i < 10; i++ )
        {
            numeros.add( 55 + (int) rm.nextInt((100+1)-55) );
        }

        return numeros;
    }

    public static void numerosRamdomDos()
    {
        ArrayList<Integer> numeros = new ArrayList<Integer>(numerosRamdom());
        
        Collections.sort(numeros);

        System.out.println(numeros);
        System.out.println("Numero mayor: "+ numeros.get(numeros.size()-1));
        System.out.println("Numero menor: "+ numeros.get(0));
        
    }

    public static String cadenaRandom()
    {
        String cadena = "";
        Random rm = new Random();
        int caster ;

        for(int i = 0 ; i < 5; i++)
        {
            caster = 97+ (int) rm.nextInt((122+1)-97);
            cadena +=  ((char) caster);
        }

        return cadena;
    }

    public static void arrayRandoms()
    {
        ArrayList<String> arreglo = new ArrayList<String>();

        for(int i = 0; i < 10; i++)
        {
            arreglo.add(cadenaRandom());
        }

        System.out.println(arreglo);
    }

    public static void main(String[] args) {
        
        System.out.println(imprimoSumaYArreglo());
        System.out.println(mezcloImprimoDevuelvo());
        abecedario();
        System.out.println(numerosRamdom());
        numerosRamdomDos();
        System.out.println(cadenaRandom());
        arrayRandoms();
    }
}
