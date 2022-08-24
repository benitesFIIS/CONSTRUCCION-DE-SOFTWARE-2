import java.util.Scanner;
public class conversion {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
float a;
int b;


System.out.println("Seleccione opcion: \n 1. M a KM \n 2. KM a M \n 3. Salir");
b=teclado.nextInt();

switch(b){
    case 1:
    System.out.print("Introduzca los metros: ");
    a=teclado.nextFloat();
    convertirM(a);       
    break;
    case 2:
    System.out.print("Introduzca los kilometros: ");
    a=teclado.nextFloat(); 
    convertirKM(a);
    break;
    case 3:
    break;
}

}
 
//FUNCION M - KM
static void convertirM(float a) {
float resultado;
resultado=a/1000;
System.out.println(a + " Metros son " + resultado + " Kilometros");
}

// KM - M
static void convertirKM(float a) {
float resultado;
resultado=a*1000;
System.out.println(a + " Kilometros son " + resultado + " Metros");
}

}
