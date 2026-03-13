public class Operators {
    public static void main(String[] args) {
        /*numericos: Suma: +
        Resta: - 
        Multiplicacion: *
        Division: /
        */

        /*Asignacion: 
        Es para darle valor a las var-const o agregarle algo despues de un resultado.
        Ejemplo +=,-=, *= /=
        */
       
        /*Comparacion(Relacionales)
       ==,  !=,<=, >=, <, >; comparan y dicen true o false dependiendo.
        */

       /*Operadores logicos.
       and(&&), cuando con todo lo que trabajemos es verdadero si no es false 
       or(||), cuando solo una opcion sea true, es verdadero, si ambas son falsas es false.
       negacion(!), invierte todo a nivel global y siempre va antes !True == false.  
        */
       
       //Operadores unarios.
       /*Usados para dar respuestas matematicas */
       var numEj = 3;
       System.out.println(numEj);
       var numNeg = -numEj; // aplica lo mismo con positivo.
       System.out.println(numNeg); // == -3
        var AutoIncrement = ++numEj;
        System.out.println(AutoIncrement); //4 
    }
}
