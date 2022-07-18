import java.util.Scanner;

public class MesEnNumero {
    public static void main(String[] args){

        int mesEnNumero = 0;

        String mesIngresado = "";

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un mes, si es posible con la primer letra en mayus");

        String mes = leer.nextLine();

        if (!mes.equals("")){
            mesIngresado = mes.substring(0,1).toUpperCase() + mes.substring(1).toLowerCase();
        }

        switch (mesIngresado) {
            case "Enero" -> mesEnNumero = 1;
            case "Febrero" -> mesEnNumero = 2;
            case "Marzo" -> mesEnNumero = 3;
            case "Abril" -> mesEnNumero = 4;
            case "Mayo" -> mesEnNumero = 5;
            case "Junio" -> mesEnNumero = 6;
            case "Julio" -> mesEnNumero = 7;
            case "Agosto" -> mesEnNumero = 8;
            case "Septiembre" -> mesEnNumero = 9;
            case "Octubre" -> mesEnNumero = 10;
            case "Noviembre" -> mesEnNumero = 11;
            case "Diciembre" -> mesEnNumero = 12;
            default -> System.out.println("Ingrese un mes valido, tambien tenga en cuenta que este bien escrito.");
        }

        if (mesEnNumero != 0) {
            System.out.println("El mes que ingreso fue: " + mesIngresado + ", que corresponde al numero: " + mesEnNumero);
        }


    }
}
