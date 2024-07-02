import java.util.Scanner;
import Modelos.ConsultaApi;
import Modelos.Moneda;
public class Principal {
    public static void main(String[] args) {
        ConsultaApi consultaApi = new ConsultaApi();
        int opcion = 1;
        String menu= """ 
                *****************************************
                Bienvenido al conversor de monedas Alura
                Ingrese el tipo de cambio, si desea salir
                presione cero
                *****************************************
                1- ARS a USD
                2- ARS a EUR
                3- ARS a MXN
                4- USD a ARS
                5- EUR a ARS
                6- MXN a ARS
                """;

        System.out.println(menu);
        while (opcion!=0){
            Scanner scanner= new Scanner(System.in);
            System.out.println("Ingrese la opcion de moneda a convertir,si desea salir presione cero: ");
            opcion= scanner.nextInt();
            //String opcionMoneda= new String();
            double montoDinero;
            switch (opcion){
                case 1:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda1 = consultaApi.cambioMoneda("ARS/USD/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Pesos Argentinos equivalen a "  +moneda1.conversion_result()+ " Dolares");
                    //System.out.println(moneda1.base_code());
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda2 = consultaApi.cambioMoneda("ARS/eur/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Pesos Argentinos equivalen a "  +moneda2.conversion_result() +" Euros");
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda3 = consultaApi.cambioMoneda("ars/mxn/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Pesos Argentinos equivalen a "  +moneda3.conversion_result()+ " Pesos Mexicanos");
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda4 = consultaApi.cambioMoneda("usd/ars/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Dolares equivalen a "+moneda4.conversion_result() +"Pesos Argentinos");
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda5 = consultaApi.cambioMoneda("eur/ars/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Euro equivalen a "+moneda5.conversion_result()+ "Pesos Argentinos");
                    break;
                case 6:
                    scanner.nextLine();
                    System.out.println("Ingrese la cantidad de dinero a convertir:");
                    montoDinero= Double.parseDouble(scanner.nextLine());
                    Moneda moneda6 = consultaApi.cambioMoneda("mxn/ars/",montoDinero);
                    System.out.println("Sus "+ montoDinero +" Pesos Mexicanos equivalen a "+moneda6.conversion_result()+ " Pesos Argentinos");
                    break;
            }
        }
        System.out.println("¡Muchas Gracias por utilizar nuestra aplicacion, espero que haya sido de utilidad!");
    }
}
