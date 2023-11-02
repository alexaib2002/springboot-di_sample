package org.alexaib.springlearn.springbootdi.app.domain;

public record Product(
        String name,
        int price
) {

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
