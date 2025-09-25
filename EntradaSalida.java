public class EntradaSalida {
    public static void main(String[] args){
        //Instrucciones de salida por pantalla
        int valor=7;
        System.out.println(valor);
        //Usar printlf
        double precio=130.354789;
        System.out.printf("El precio del producto %s tiene un valor de %5.2f y se han comprado %d \n", "Tablet", precio,valor);
        
        //Incluir icono
        System.out.println("Que ganas tengo de una vacaciones \u26F1");

        //Formato reciente de System
        System.out.println( "El precio del producto"+"tabloet"+"tiene un valor de "+precio+" y se han comprado "+valor);

        //Formato salida texto
        System.out.printf("%15s, %-15s","Pablo", "Informatico" );

        System.out.println();
        //Formato tabla
        System.out.println("|----------|----------|------------|");
        System.out.printf("|%-10s|%s  |%s       | \n","Producto", "Cantidad","Valor");
        System.out.println("|----------|----------|------------|");
        System.out.printf("|%-10s|%d         |%f  | \n","Producto",valor,precio);
        System.out.println("|----------|----------|------------|");

        System.out.println();
        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Producto"+"  |"+"Cantidad"+"  |    "+"Precio"+"|");
        System.out.println("|----------|----------|----------|");
        System.out.println("|"+"Producto  |       "+valor+"  |"+precio+"|");
        System.out.println("|----------|----------|----------|");
    }
}
