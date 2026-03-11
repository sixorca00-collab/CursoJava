// En este solo aprenderemos como funcionan, se crean y se adaptan const y vars
public class VarAndConst {
    public static void main(String[] args) {
        //Variables.
        String MeName = "Juancho";
        System.out.println(MeName); // Se pone el tipo de dato, nombre de variable y contenido.

        // puedes renombrar las variables solo si estan dentro del mismo contexto.
        MeName = "Six"; //Si el tipado(tipo de dato que se pidio) cambiara tirara fallo.
        System.out.println(MeName);
        int MeAge = 19; // La misma estructura tipado, nombre y contenido.
        System.out.println(MeAge);
        //Constantes 
        final String GENDER = "Male"; // una buena practica seria poner todas las const en mayusculas para diferenciar mas facil
        System.out.println(GENDER); // Optimiza tiempo la const en mayus.
        var test = ""; // Var se adapta a el tipo de caracter que haya en el contenido.
        System.out.println(test);
    }
}
