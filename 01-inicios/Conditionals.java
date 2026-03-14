public class Conditionals {
    public static void main(String[] args) {
        //Condicionales
        //IF
        var age = 19;
        if(age >= 18){
            System.out.println("Es mayor de edad.");
        } else if(age <= 0){
            System.out.println("Ingrese una edad valida");
        }
        else{ System.out.println("Es menor de edad.");}
        //Switch
        int day = 1;
        switch (day) {
            case 1:
                System.out.println("El dia es lunes.");
                break;
            case 2:
                System.out.println("El dia es Martes.");
                break;
            case 3:
                System.out.println("El dia es Miercoles.");
                break;
            case 4: 
                System.out.println("El dia es Jueves.");
                break;
            case 5:
                System.out.println("El dia es viernes");
                break;
            case 6:
                System.out.println("El dia es sabado");
                break;
            case 7:
                System.out.println("El dia es domingo");    
            break;
        
            default:
                System.out.println("Por favor ingrese un dia valido "); 
                break;
        }
    }
}
