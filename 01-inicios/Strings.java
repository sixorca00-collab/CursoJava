public class Strings {
    public static void main(String[] args) {
        //Strings.
    var name = new String("SixOrca");
    String Frase = "testeo de subString";
        //Concatenación: Ya la habia visto en ejercicios previos.
        //Length
        System.out.println(name.length());// debe dar 7. DA SIETEEEE
        //Obtener un caracter
        System.out.println(name.charAt(name.length()-1)); // Asi se obtiene una "S" y con -1 es el ultimo caracter.
        //SubString
        System.out.println(Frase.substring(0, 6));
        //The CASES toUperCase-toLowerCase.- Transform a mayus y minus
        String mayusName = name.toUpperCase();
        String minName = name.toLowerCase();
        System.out.println(mayusName);
        System.out.println(minName);
        // Comprobar si contiene
        System.out.println(mayusName.contains("ix")); //Dara false pq todo esta en mayus
        //Comparacion de Strings
       System.out.println(name.equals("Sixorca")); // equals es mejor que == con cadenas de texto pq == compara hasta el tipo de objeto y equals contenido del texto.
       //Trim y replace
       //Trim elimina espacios al inicio y al final de el texto.
       //Replace se le pasan 2 parametros el caracter antiguo y el moderno(" ", "").
       // format Es el printf(%s strings, %d numeros enteros, %f decimales)



    }
}
