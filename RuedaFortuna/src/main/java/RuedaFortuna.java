import java.util.Random;
public class RuedaFortuna {

    private int[] casillas;

    public void inicializarRueda(int numeroCasillas){
        Random azar = new Random();
        casillas = new int [numeroCasillas];

        for (int i=0; i<numeroCasillas; i++){
            casillas[i]= azar.nextInt(100)+1;
            System.out.println(casillas[i]);
        }
    }

    public int lanzarRueda(){
        Random azar1 = new Random(casillas.length);
        int a = casillas[azar1.nextInt()];
        return a;
    }

}