package org.alexaib.springlearn.springbootdi.app.domain;

public record ItemBill(
        Product product,
        int quantity
) {

    public ItemBill(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }
}
