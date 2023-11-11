package Sensores;

import java.util.concurrent.*;

class Controlador {
    public static void main(String[] args) {
        
        ExecutorService executor = Executor.newFixedThreadPool(2);
        Sensor sHumidade = 
        Sensor sTemperatura =

        executor.execute(sHumidade);
        executor.execute(sTemperatura);

        executor.shutdown();
    }
}
