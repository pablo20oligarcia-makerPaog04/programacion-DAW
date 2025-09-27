import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args){
        // //Instrucciones de salida por pantalla
        // int valor=7;
        // System.out.println(valor);
        // //Usar printlf
        // double precio=130.354789;
        // System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d \n", "Tablet", precio,valor);
        
        // //Incluir icono
        // System.out.println("Que ganas tengo de una vacaciones \u26F1");

        // //Formato reciente de System
        // System.out.println( "El precio del producto"+"tabloet"+"tiene un valor de "+precio+" y se han comprado "+valor);

        // //Formato salida texto
        // System.out.printf("%15s, %-15s","Pablo", "Informatico" );

        // System.out.println();
        // //Formato tabla
        // System.out.println("|----------|----------|------------|");
        // System.out.printf("|%-10s|%s  |%s       | \n","Producto", "Cantidad","Valor");
        // System.out.println("|----------|----------|------------|");
        // System.out.printf("|%-10s|%d         |%f  | \n","Producto",valor,precio);
        // System.out.println("|----------|----------|------------|");

        // System.out.println();
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto"+"  |"+"Cantidad"+"  |    "+"Precio"+"|");
        // System.out.println("|----------|----------|----------|");
        // System.out.println("|"+"Producto  |       "+valor+"  |"+precio+"|");
        // System.out.println("|----------|----------|----------|");

        //Operaciones de entrada por teclado
        
        Scanner teclado=new Scanner(System.in);
        /*
        System.out.println("Introduce la cadena de texto deseada");
        String cadena=teclado.nextLine();
        System.out.println("La cadena introducida es: "+cadena);
        
        System.out.println("Introduce:Nombre Apellido Edad Profesión");
        //Lee Nombre
        String nombre = teclado.next();
        //Leer apellido
        String apellido = teclado.next(); //Si se pidiera de uno en uno hay que poner nextLine()
        //Leer edad
        int edad = teclado.nextInt();
        //Leer profesión
        String profesion =teclado.next(); 

        System.out.println("El usuario se llama "+nombre+" "+apellido+".Tiene "+edad+" años y trabaja de "+profesion); //Cierras el flujo de teclado
*/
        
        //Lee Nombre
        System.out.println("Introduce Nombre:");
        String nombre = teclado.nextLine();
        //Leer apellido
        System.out.println("Introduce Apellido:");
        String apellido = teclado.nextLine();
        //Leer edad
        System.out.println("Introduce Edad:"); //Si se pidiera de uno en uno hay que poner nextLine()
        //Opción 1 de limpiar buffer
        //int edad = teclado.nextInt();
        //teclado.nextLine();//Limpiar bufer para salto de linea
        //Opción 2 de limpiar buffer
        int edad=Integer.parseInt(teclado.nextLine());
        //Leer profesión
        System.out.println("Introduce Profesión:");
        String profesion =teclado.nextLine(); 

        System.out.println("El usuario se llama "+nombre+" "+apellido+".Tiene "+edad+" años y trabaja de "+profesion+"."); //Cierras el flujo de teclado


        teclado.close();




    }
}
