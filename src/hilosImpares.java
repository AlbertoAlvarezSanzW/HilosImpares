

/*  Instrucciones para generar hilos
    1º hacer en el extends      -> linea 9
    2º poner run y luego BORRAR el super, se generara un override 11 - 17

 */

public class hilosImpares extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            if (i % 2 != 0)
            System.out.println("Los hilos impares del 1 al 10 son: "+i);
        }
    }
}
