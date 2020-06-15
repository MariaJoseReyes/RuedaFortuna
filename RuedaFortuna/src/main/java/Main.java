import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RuedaFortuna Rueda = new RuedaFortuna();
        int largo = 0;
        try {
            System.out.println("Ingresa cantidad de casillas a jugar");
            largo = leer.nextInt();
        } catch (Exception e){
            System.out.println("Error al ingresar el dato, solo debes ingresar los numeros de casilla");
        }

        Rueda.inicializarRueda(largo);

        int valor = Rueda.lanzarRueda();
        System.out.println("Cayó en la casilla n°" + valor);
    }
}
