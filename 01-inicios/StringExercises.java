public class StringExercises {
    public static void main(String[] args) {
        //Vamos a poner todos los ejercicios.
        // 1. Concatena dos cadenas de texto.

        // 2. Muestra la longitud de una cadena de texto.

        // 3. Muestra el primer y último carácter de un string.

        // 4. Convierte a mayúsculas y minúsculas un string.

        // 5. Comprueba si una cadena de texto contiene una palabra concreta.

        // 6. Formatea un string con un entero. Formatear un string es darle variables de varios tipos en un solo txt

        // 7. Elimina los espacios en blanco al principio y final de un string.

        // 8. Sustituye todos los espacios en blanco de un string por un guión (-).
       // eigth();
        // 9. Comprueba si dos strings son iguales.
        nine();
        // 10. Comprueba si dos strings tienen la misma longitud.
    }
    static void first(){
        var txt1 = "Lana sube";
        var txt2 = "lanavaja";
        System.out.println(txt1 + " " +  txt2);
    }
    static void second(){
        var nam = "Sixorca";
        var tamañoNam = nam.length();
        System.out.println(tamañoNam);
    }
    static void third(){
        var Nam = "Sixorca";
        System.out.println("Primer caracter: " + Nam.charAt(0));
        System.out.println("Ultimo caracter: " + Nam.charAt(Nam.length()-1));
    }
    static void four(){
        var Orca = "Orca";
        System.out.println("Min: " +Orca.toLowerCase());
        System.out.println("Mayus: " +Orca.toUpperCase());
    }

    static void five(){
        var texto = "Hola, soy Six";
        System.out.println(texto.contains("Hola")); 
    }
    static void six(){
        String name = "SixOrca";
        int age = 19;
        System.out.printf("Hola!Soy %s, tengo %b años; y este ejercicio me parece aburrido", name, age); 
    }
    static void seven(){
        String Saludo = " Hola ";
        System.out.println(Saludo.trim());
    }
    static void eigth(){
        var txt =  "Hola no se que poner para este ejercicio";
        System.out.println(txt.replace(" ", "-"));
    }
    static void nine(){
        var txt1 = "Una bola negra";
        var txt2 = "Una negra en bola";
        System.out.println(txt1.equals(txt2));
        //10 comprobar si tienen la misma longitud
        System.out.println("Longitud texto 1: "+txt1.length());
        System.out.println("Longitud texto 2: "+txt2.length());
        System.out.println("Por ende no, se ve que claramente no tienen la misma cantidad de caracteres.");
        System.out.println(txt1.length() == txt2.length()); //devolvera false porque no tienen la misma cantidad y se uso el operador de comparacion.(Manera mas corta).
        

    }

}
