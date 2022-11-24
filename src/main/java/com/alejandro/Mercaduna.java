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
    boolean cerrado = false;

    public void abrirCajas(List<Cliente> clientes, int cajeras) {
        try {
            executorService = Executors.newFixedThreadPool(cajeras, factory);
            System.out.println("Abre el Mercaduna");
            for (Cliente cliente : clientes) {
                executorService.execute(new Cajera(cliente));
            }
            executorService.shutdown();
            cerrado = true;
            try {
                executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
                cerrarCajas();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public void cerrarCajas() {
        System.out.println("Mercaduna cerrado");
    }


}
