package br.com.braian.dip.example_refactored;

import br.com.braian.dip.ShippingProduct;

public class GoodShippingService {

    private final ShippingService shippingService;

    public GoodShippingService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public void send(final ShippingProduct shippingProduct) {
        shippingService.send(shippingProduct);
    }

}
