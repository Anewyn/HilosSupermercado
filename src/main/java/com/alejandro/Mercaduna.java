package com.alejandro;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/**
 * @author Alejandro
 */
public class Mercaduna {
    ExecutorService executorService;
    ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("Cajera %d").build();

    public void abrirCajas(List<Cliente> clientes, int cajeras) {
        try {
            executorService = Executors.newFixedThreadPool(cajeras, factory);
            System.out.println("Abre el supermercado");
            for (Cliente cliente : clientes) {
                Runnable cajera = new Cajera(cliente);
                executorService.execute(cajera);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (executorService.isTerminated()){
            executorService.shutdown();
            cerrarCajas();
        }
    }

    public void cerrarCajas() {
        try {

            if (!executorService.awaitTermination(100, TimeUnit.MICROSECONDS)) {
                System.out.println("Cerrando el mercaduna...");
                System.exit(0);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mercaduna cerrado");
    }


}
