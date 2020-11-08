


public class hilosPares extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++)
            if(i % 2 == 0){
                System.out.println("Los hilos pares que corresponden del 1 al 10 son:"+i);
            }

    }
}
