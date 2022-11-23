package com.alejandro;

/**
 * @author Alejandro
 */
public class Cliente{
    private final int clientId;
    private final int[] carroCompra;

    public Cliente(int clientId, int[] carroCompra) {
        this.clientId = clientId;
        this.carroCompra = carroCompra;
    }

    public int getClientId() {
        return clientId;
    }

    public int[] getCarroCompra() {
        return carroCompra;
    }

}
