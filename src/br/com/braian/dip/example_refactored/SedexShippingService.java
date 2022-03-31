package br.com.braian.dip.example_refactored;

import br.com.braian.dip.ShippingProduct;

public class SedexShippingService implements ShippingService {

    @Override
    public void send(final ShippingProduct shippingProduct) {
        System.out.println("Enviado por Sedex!");
    }

}
