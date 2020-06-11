# RuedaFortuna
tarea ayudantia programacion
La rueda está compuesta de un número determinado de casillas, siendo el usuario quien determina este número.
Una vez escogido el número de casillas, el sistema se encarga de asignar un puntaje a cada casilla de forma aleatoria.

public class RuedaFortuna{

    private int[] casillas;

    public void inicializarRueda(int numeroCasillas){
        //...
    }
    
    public int lanzarRueda(){
        //...
        return 0;
    }
}
El método inicializarRueda a partir de un número de casillas, asigna los puntajes de forma aleatoria a cada una de las casillas. El número de casillas puede ser desde un mínimo de 4 hasta un máximo de 100 casillas.

El método lanzarRueda se encarga de elegir una casilla de la rueda al azar y devuelve el puntaje obtenido.

Entrega
Me deben enviar el link de un repositorio que contenga lo siguiente:

Un proyecto maven que contenga la clase RuedaFortuna completa.
Test unitario para cada método.
Control de posibles excepciones.
La entrega será vía Slack, con plazo hasta el domingo 14 de junio hasta las 23:59.
