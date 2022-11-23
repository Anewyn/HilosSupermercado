package com.alejandro;

import java.util.concurrent.TimeUnit;

/**
 * @author Alejandro
 */
public class Cajera extends Thread implements Colores {

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
        System.out.println(Colores.ANSI_GREEN + Thread.currentThread().getName() + " ha empezado a cobrar al cliente "
                + cliente.getClientId() + Colores.ANSI_RESET);

        int productNumber = 1;

        for (Integer producto : cliente.getCarroCompra()) {
            System.out.println(Colores.ANSI_CYAN + Thread.currentThread().getName() + " pasa por caja el producto " + productNumber + " del cliente " + cliente.getClientId() + Colores.ANSI_RESET);
            Thread.sleep(TimeUnit.SECONDS.toMillis(producto));
            productNumber++;
        }

        System.out.println(Colores.ANSI_RED + Thread.currentThread().getName() + " ha terminado de cobrar al cliente "
                + cliente.getClientId() + Colores.ANSI_RESET);
    }

}
