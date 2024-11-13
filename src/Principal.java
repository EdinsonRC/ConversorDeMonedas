import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ConsultarMonedas consultar = new ConsultarMonedas();

        int opcion = 0;
        while (opcion != 8){
            System.out.println("****************************************\n" +
                    "       CONVERSOR DE MONEDAS ALURA \n" +
                    "****************************************\n" +
                    "¿Qué moneda deseas cambiar hoy?\n" +
                    "--------------------------------------\n" +
                    "1. Dolar a Sol Peruano\n" +
                    "2. Sol Peruano a Dolar\n" +
                    "3. Dolar a Peso Argentino\n" +
                    "4. Peso Argentino a DOlar\n" +
                    "5. Dolar a Real Brasilero\n" +
                    "6. Rel Brasilero a Dolar\n" +
                    "7. Otra moneda\n" +
                    "8. Salir\n" +
                    "****************************************\n");
            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion){
                case 1:
                    ConvertirMoneda.convertir("USD","PEN", consultar, lectura);
                    break;
                case 2:
                    ConvertirMoneda.convertir("PEN","USD", consultar, lectura);
                    break;
                case 3:
                    ConvertirMoneda.convertir("USD","ARS", consultar, lectura);
                    break;
                case 4:
                    ConvertirMoneda.convertir("ARS","USD", consultar, lectura);
                    break;
                case 5:
                    ConvertirMoneda.convertir("USD","BRL", consultar, lectura);
                    break;
                case 6:
                    ConvertirMoneda.convertir("BRL","USD", consultar, lectura);
                    break;
                case 7:
                    ConvertirMoneda.convertirOtraMoneda(consultar, lectura);
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
}
