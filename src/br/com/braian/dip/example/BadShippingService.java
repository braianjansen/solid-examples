package br.com.braian.dip.example;

import br.com.braian.dip.ShippingProduct;

public class BadShippingService {

    public final String SEDEX = "SEDEX";
    public final String AZUL_EXPRESS = "Azul Express";
    private final AzulShippingService azulService;
    private final SedexShippingService sedexService;

    public BadShippingService(AzulShippingService azulService, SedexShippingService sedexService) {
        this.azulService = azulService;
        this.sedexService = sedexService;
    }

    public void send(ShippingProduct shippingProduct, String selectedShippingService) throws IllegalAccessException {
        if (SEDEX.equals(selectedShippingService)) {
            sedexService.send(shippingProduct);
        } else if (AZUL_EXPRESS.equals(selectedShippingService)) {
            azulService.send(shippingProduct);
        } else {
            throw new IllegalAccessException("O método de envio selecionado é inválido.");
        }
    }

}
