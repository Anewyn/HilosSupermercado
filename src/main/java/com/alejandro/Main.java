package com.alejandro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {

        /*
        *
        *  En esta actividad vamos a hacer un programa que simule el trabajo de una cajera
        *  en un supermercado simulando el cobro a los clientes. Tendremos tres clientes y
        *  tres cajeras, la cajera debe cobrar la compra cliente a cliente, es decir que primero
        *  le cobra al cliente1, después al cliente2 y finalmente al cliente3. Para esto
        *  necesitaremos una clase “Cajera” y otra clase “Cliente” el cual va a tener un array
        *  de enteros que representarán los productos que va a comprar y el tiempo que la
        *  cajera tarda en pasar esos productos por la caja. Por lo tanto, si tenemos un array
        *  con [1,5,2] significa que el cliente va a comprar 3 productos y que la cajera tarda en
        *  procesar el producto “1” un segundo, el producto “2” cinco segundos y el producto
        *  “3” dos segundos, con lo cual, tardará en cobrar todos los productos 8 segundos.
        *
        * */


        Mercaduna mercaduna = new Mercaduna();
        int numeroCajeras = 3;

        List<Cliente> clientes = new ArrayList<>() {{
            add(new Cliente(1, new int[]{20, 3, 4, 5}));
            add(new Cliente(2, new int[]{1, 7, 6, 5}));
            add(new Cliente(3, new int[]{2, 3, 3, 7}));
            add(new Cliente(4, new int[]{2, 3, 6, 1}));
            add(new Cliente(5, new int[]{1, 3, 1, 5}));
            add(new Cliente(6, new int[]{2, 10, 4, 8}));
        }};

        mercaduna.abrirCajas(clientes, numeroCajeras);
    }
}
