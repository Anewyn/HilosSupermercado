package com.alejandro;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alejandro
 */
public class Main {
    public static void main(String[] args) {

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
