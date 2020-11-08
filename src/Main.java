public class Main {

    public static void main(String[] args) {


        /*
         Implementa un programa en java que use hilos independientes, en una misma clase y
          que imprima los pares y los impares del 1 al 10 inclusive.
         */

        /*
        Despues de crear la clase hilos, especificamos un objeto  -> linea 16   , linea 18
        una vez definido el objeto lo iniciamos con start()       -> linea 17   , linea 19
         */

        hilosImpares h1 = new hilosImpares();
        h1.start();
        hilosPares h2 = new hilosPares();
        h2.start();


    }

}
