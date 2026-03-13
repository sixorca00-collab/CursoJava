public class OperatorsExercises {
    public static void main(String[] args) {
        //Ejercicios
    //    firts();
    //    second();
    //    third();
    //    four();
    //    five();
    //    six();
    //    seven();
    //    eigth();
    //    nine();
        teen();

    }
    static void firts(){
        //Ejercicio 1: Crear una variable con el resultado de cada op aritmetica.
        var num1 = 5;
        var num2 = 2;
        int suma = num1 + num2;
        int resta= num1 - num2;
        int por = num1 * num2;
        int div = num1 / num2;
        System.out.println(" Suma: " + suma + " Resta:" + resta + " Multiplicacion: " + por + " Division: " + div);
        //Manera pro 
        System.out.printf("Suma %d Resta %d, Multiplicacion %d, Diviion: %d", suma, resta, por, div);
    }

    static void second(){
        //Operadores de asignacion cambian el valor de una variable.
        var Number = 30;

        Number += 12;
        System.out.println(Number);
        Number -= 15;
        System.out.println(Number);
        Number *= 2;
        System.out.println(Number);
        Number /= 2;
        System.out.println(Number);
    }
    static void third(){
         //  Imprime 3 comparaciones verdaderas con diferentes operadores de comparación
        //True
         boolean Ment = 3 < 2;
        System.out.println(!Ment);

        boolean ver1 = 5 > 2;
        System.out.println(ver1);
        boolean ver2 = !Ment;
        System.out.println(ver2);

    }
    static void four(){
        // Imprime 3 comparaciones falsas con diferentes operadores de comparación.
        boolean verdad = 5 < 6;
        System.out.println(!verdad);

        boolean ment1 = 4>7;
        System.out.println(ment1);

        boolean ment2 = 0 <= -2;
        System.out.println(ment2);
    }
    static void five(){
        boolean tru = 3 > 2;
        boolean vdd = 4 < 5;
        boolean fols = 5 < 4;
        // AND
        System.out.println(tru && vdd); //deberia dar true
        System.out.println(tru && fols); //deberia dar false
    }
    static void six(){
        // OR
        boolean tru = 8 == 8;
        boolean fol = 7 != 7;
        System.out.println(tru || fol);
        System.err.println(!tru|| fol);

    }
    static void seven(){
        // Usar ambos operadores logicos. Plantear problema En un bootcamp de programación, un coder puede participar en un hackathon interno si cumple las siguientes condiciones:
/* 
        Debe tener más de 75 puntos en el examen de programación y más de 70 puntos en el examen de inglés.

        También puede participar si cumple al menos una de las siguientes condiciones:

        Tiene más de 90 puntos en el examen de programación o

        Tiene más de 90 puntos en el examen de inglés.
*/      int eProgra = 68;
        int eIngles = 68;

        boolean pasa = eProgra >= 75 && eIngles >= 70; 
        boolean sobrao = eProgra  >= 90 || eIngles >= 90;  

        System.out.println(pasa);
        System.out.println(sobrao);
    }
    static void eigth(){
        boolean negar = 8 != 8; 
        System.out.println(!negar);
    }
    static void nine(){
        //operadores unarios
        int Number = 6;
        int NegNumber = -6;
        int Auto = ++Number; //Autoincremento
        System.out.println(Auto);
        int neg = -Number; //Negativo
        System.out.println(neg);
        int pos = -NegNumber; // n*n = positivo
        System.out.println(pos);


    }
    static void teen(){
        System.out.println("Ejercicio 10:");
        /*Un coder en un bootcamp tiene estas calificaciones:

Examen de programación: 78

Examen de inglés: 82

Examen de matemáticas: 65

Se quiere determinar:

Si el promedio de los tres exámenes es mayor o igual a 70.

Si el examen de programación es mayor que el de matemáticas.

Si el examen de inglés es mayor que 80 o el de matemáticas es mayor que 70. */

        //Tomamos los datos.
        int ePro = 78;
        int eIngles = 82;
        int eMat = 65;
        //Seguimos con lo que piden.
        //1 promedio mayor a 70?
        //promediamos todo
        int suma = ePro + eIngles + eMat;
        int promedio = suma/3;
        System.out.println("Promedio de las 3 areas es: " + promedio);
        // Validamos con un boolean si es mayor que 70.
        boolean Mayor70 = promedio >= 70;
        System.out.println("Es mayor que 70? " + Mayor70); 
        //2. Examen programacion mayor que mat?
        boolean comp = ePro > eMat;
        System.out.println("El examen de ptogramacion tiene mayor nota que matematicas? " + comp);
        //Cumple con que uno de los 2 examenes sea mayor a tal nota.
        boolean doble = eIngles > 80 || eMat > 70;
        System.out.println("El examen de ingles es mayor a 80 o el de matematicas mayor a 70? En uno de los 2 cumple: " + doble); 
    }

    
}
