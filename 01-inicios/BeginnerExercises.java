//Aqui seguiremos con la segunda tanda de ejercicios
public class BeginnerExercises {
    public static void main(String[] args){
        first();
        second();
        third();
        four();
        five();
        six();
        seven();
        nine();
        ten();
        eleven();
    }
    static void first(){
        System.out.println("Ejercicio 1: Declarar una variable y asignarle mi nombre");
        String nam = "SixOrca\nJuan Olarte";
        System.out.println(nam);
    }
    static void second(){
        System.out.println("Ejercicio 2: Crear una variable y le asignamos edad");
        int age = 19;
        System.out.println(age);
    }
    static void third(){
        System.err.println("Ejercicio 3: Variable con altura en metros");
        var heigth = 1.88;//decidi usar var para aplicarla
        System.err.println(heigth);
    }
    static void four(){
        System.out.println("Ejercicio 4: usar boolean con una variable que diga si me gusta programar");
        Boolean GUSTO = true;
        System.out.print("A Six le gusta programar?" + GUSTO ); // el + es por el cambio de String a Var.
    }
    static void five(){
        System.out.println("Ejercicio 5: constante con email");
        final String EMAIL = "sixorca00@gmail.com";
        System.out.println("Mi Email es: " + EMAIL);
    }
    static void six(){
    System.out.println("Ejercicio 6: Guardar una variable con su inicial");
    char Initial = 'S'; //Recordar que cuando es Char se usan ''.
    System.out.println("Inicial:" + Initial);    
    }
    static void seven(){
        System.out.println("Ejercicio 7: Guardar una variable con tu localidad");
        String locality = "Calle70";
        System.out.println("Mi localidad actual es: " + locality);
        locality = "Carrera 49";
        System.out.println("Mentira es: " + locality);
    }
    static void eigth(){
        var name = "Six";
        var age = 19;
        System.out.println("Ejercicio 8: Traer 2 variables y decir que tipo son");
        System.out.println(name.getClass().getTypeName());
        System.out.println(age); //no se le puede hacer typeof a un dato primitivo.
    }
    static void nine(){
        System.out.println("Ejercicio 9: Traer 2 variables hechas anteriormente en simultaneo");
        //Testeare el Scope - prueba fallida, al parecer no se puede porque hay varios metodos o aun no le se :(
        String myName = "SixOrca";
        String myEmail = "sixorca00@gmail.com";
        int myAge = 19;
        
        //Vamos a fusionarlo todo.
        System.out.println("Hola!!, Mi nombre es: " + myName + "Y mi Email es:" + myEmail + "y tengo actualmente " + myAge + " años.");
        // hay que concatenar siempre sin olvidar: contenido  + var-const + contenido.
        //Tambien esta la opcion de printf
        System.err.printf("My name is %s and my email is %s and have %d years old \n",
            myName, myEmail, myAge //Luego se le da mayor contexto.
        );
    }
    static void ten(){
        System.out.println("Ejercicio 10: hacer una suma con 2 int");
        String num1 = System.console().readLine("Inserte un numero:");
        String num2 = System.console().readLine("Inserte un numero:"); //Inputs?

        int numb1 = Integer.parseInt(num1); //Asi se pasa de String a Int.
        int numb2 = Integer.parseInt(num2); 

        int total = numb1 + numb2; 
        System.out.println("La suma de los numeros es: " + total);
    }
    static void eleven(){
        System.out.println("Ejercicio 11: intenta declarar una variable sin inicializarla y luego asignarle un valor.");
        String msj;
        System.out.println("Aun no se ha inicializado la variable");
        msj = "YA SE CARGOOO!!";
        System.out.println(msj);

    }
}
