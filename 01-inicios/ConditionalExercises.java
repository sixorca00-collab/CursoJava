public class ConditionalExercises {
    public static void main(String[] args) {
        
        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        //uno();
        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        //dos();

        // 3. Dado un número, verifica si es positivo, negativo o cero.

        // 4. Crea un programa que diga si un número es par o impar.

        // 5. Verifica si un número está en el rango de 1 a 100.

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
    }
    static void uno (){
    System.out.println("determinar si alguien puede votar.");
    int edad = 18;
        if (edad <= 0 || edad >= 70) {
            System.out.println("Ingrese una edad valida.");
        }
        else if(edad < 18){
        System.out.println("No puedes votar eres menor de edad.");
        }
        else{System.out.println("Puedes votar.");}
    } 
    static void dos(){
        var num1 = 2;
        var num2 = 2;
        if (num1 > num2) {
            System.out.println("El primer numero es mayor y ese numero es: " + num1 );
        }else if(num2 > num1){System.out.println("El segundo numero vale lo mas y ese numero es: " + num2);}
        else{System.out.println("Los numeros valen lo mismo y son: " + num1 + " " + num2);}
    }
    static void tres(){
        System.out.println("Determinar si un numero es positivo o negativo");
        int number = 10;
        if (number < 0) {
            System.out.println("El numero es negativo");
        }else if(number == 0){ System.out.println("El numero es cero.");} 
        else {
            System.out.println("El numero es positivo.");
            
        }
    }
    static void cuatro(){

    }
}
