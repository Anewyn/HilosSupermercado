package com.alejandro;

/**
 * @author Alejandro
 */
public class Cliente {
    private final int id;
    private final int[] carroCompra;

    public Cliente(int id, int[] carroCompra) {
        this.id = id;
        this.carroCompra = carroCompra;
    }

    public int getId() {
        return id;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

}
