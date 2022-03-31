package br.com.braian.dip.example_refactored;

import br.com.braian.dip.ShippingProduct;

public class DependencyInversionPrinciple {

    public static void main(String[] args) throws IllegalAccessException {
        var shippingProduct = new ShippingProduct("PS5", 1, "João Victor", "Rua Teodoro de Castro");

        var goodShippingService = new GoodShippingService(new SedexShippingService());
        goodShippingService.send(shippingProduct);
    }

}
