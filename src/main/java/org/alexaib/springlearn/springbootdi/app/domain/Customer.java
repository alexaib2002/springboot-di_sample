package org.alexaib.springlearn.springbootdi.app.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Objects;

@Component
@RequestScope
public class Customer {
    @Value("${client.name}")
    private final String name;
    @Value("${client.surname}")
    private final String surname;

    public Customer(
            @Value("${client.name}")
            String name,
            @Value("${client.surname}")
            String surname
    ) {
        this.name = name;
        this.surname = surname;
    }

    @Value("${client.name}")
    public String name() {
        return name;
    }

    @Value("${client.surname}")
    public String surname() {
        return surname;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Customer) obj;
        return Objects.equals(this.name, that.name) &&
                Objects.equals(this.surname, that.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Customer[" +
                "name=" + name + ", " +
                "surname=" + surname + ']';
    }

}
