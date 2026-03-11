//Aqui dejaremos los 10 primeros ejercicios puestos en el video :p

// 1. Imprimir un mensaje que diga mi nombre completo.
public class HelloWorldExercises {
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Ejercicio 1:\nJuan Pablo Olarte Alvarez");// imprime mi nombre
        //Ejercicio 2.
        System.out.println("Ejercicio 2:\n Six \n Orca");// \n es para un salto de linea
        
        // El ejercicio 3 es ir comentando que hace cada linea del programa.
        
        /*El Ejercicio 4:
         es poner un comentario
        en varias lineas de codigo */
        /*Ejercicio 5: imprimir nombre, color fav y ciudad */
        System.out.println("Ejercicio 5:\nSix\nAzul\nMedellín");
        //Explorar los diferentes system_XXX_Print:
        System.err.println("Ejercicio 6:\n Era explorar los tipos de system.");//Este es para errores por ejemplo podria ir algo salio mal o error en servidor
        //System.in.print(); //In es para entrada de datos
        //System.exit(0);// Este cierra el programa si inmediatamente
        //Hay de todo tipo desde tiempo actual, medir tiempo en nanosegundos, System es un metodo muy amplio.

        //Ejercicio 7: Hacer un mensaje con varios println
        System.out.print("Yo no vine ");
        System.out.print("a codearme con leyendas ");
        System.out.println("vine a ser el guerrero. ");
        System.out.println("Que las venza.");
        //Ejercicio 8: usando sistema ASCII imprimir algo(un emote algo).
        System.out.println("Ejercicio 8:\n ^-^ ");
         //No sabia que eso era diseño ASCII
        /*Ejercicio 9: Al ejecutar Java sin metodo Main, JVM no sabra por donde empezar y no va a ejeutar nada 
         tirando el error Main method not found in class HelloWorldExercises.
         Adicionalmente existen todo tipo de metodos, incluso se pueden crear son como las
         funciones de JS, pero deben ir dentro de una clase
                public class App {

                static void saludar(){
                    System.out.println("Hola");
                }
                        public static void main(String[] args) {
                            saludar();
                        }

                }*/

}}
