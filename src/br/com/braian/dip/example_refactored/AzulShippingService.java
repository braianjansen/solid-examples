package br.com.braian.dip.example_refactored;

import br.com.braian.dip.ShippingProduct;

public class AzulShippingService implements ShippingService {

    @Override
    public void send(final ShippingProduct shippingProduct) {
        // Método com regras de negócio referente ao envio do produto a partir do serviço de envio da Azul Express
        System.out.println("Enviado por Azul Express!");
    }

}
