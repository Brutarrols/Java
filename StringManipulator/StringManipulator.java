public class StringManipulator 
{
    public String trimAndConcat(String a, String b)
    {
        return  a.concat(b);
    }
    public Integer getIndexOrNull(String cadena, char caracter)
    {
        int valido = cadena.indexOf(caracter);
        int invalido = cadena.indexOf(caracter, valido+1);

        if(valido != -1)
        {
            return valido;
        }
        else
        {
            return -1;
        }
    }

    public Integer getIndexOrNull(String cadena, String cadena2)
    {
        int valido = cadena.indexOf(cadena2);
        int invalido = cadena.indexOf(cadena, valido+1);

        if(valido != -1)
        {
            return valido;
        }
        else
        {
            return -1;
        }
    }

    public String concatSubstring(String cadena1, int inicio, int termino, String cadena2)
    {
        String resto = cadena1.substring(inicio, termino);

        return resto.concat(cadena2);
    }
}
