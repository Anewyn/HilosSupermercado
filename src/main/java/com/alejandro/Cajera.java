package com.alejandro;

import java.util.concurrent.TimeUnit;

/**
 * @author Alejandro
 */
public class Cajera extends Thread {

    private Cliente cliente;

    public Cajera(Cliente cliente) {

        this.cliente = cliente;
    }

    @Override
    public void run() {
        try {
            cobrar();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void cobrar() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " ha empezado a cobrar al cliente "
                + cliente.getId());

        int productNumber = 1;

        for (Integer producto : cliente.getCarroCompra()) {
            System.out.println(Thread.currentThread().getName() + " pasa por caja el producto " + productNumber + " del cliente " + cliente.getId());
            Thread.sleep(TimeUnit.SECONDS.toMillis(producto));
            productNumber++;
        }

        System.out.println(Thread.currentThread().getName() + " ha terminado de cobrar al cliente "
                + cliente.getId());
    }

}
