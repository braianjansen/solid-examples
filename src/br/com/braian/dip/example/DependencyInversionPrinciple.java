package br.com.braian.dip.example;

import br.com.braian.dip.ShippingProduct;

public class DependencyInversionPrinciple {

    public static void main(String[] args) throws IllegalAccessException {
        var azulService = new AzulShippingService();
        var sedexService = new SedexShippingService();
        var shippingProduct = new ShippingProduct("PS5", 1, "João Victor", "Rua Teodoro de Castro");

        // Bad Code
        var badShippingService = new BadShippingService(azulService, sedexService);
        badShippingService.send(shippingProduct, "Azul Express");
        badShippingService.send(shippingProduct, "SEDEX");

        // Exception
        // badShippingService.send(shippingProduct, "TNT Express");
    }

}
