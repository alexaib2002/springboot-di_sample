package org.alexaib.springlearn.springbootdi.app.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Component
@RequestScope
public class Bill implements Serializable {
    @Serial
    private static final long serialVersionUID = 0L;
    @Value("${bill.description}")
    private final String description;
    @Autowired
    private final Customer customer;
    @Autowired
    @Qualifier("itemOfficeBill")
    private final List<ItemBill> items;

    public Bill(
            @Value("${bill.description}")
            String description,
            @Autowired
            Customer customer,
            @Autowired
            @Qualifier("itemOfficeBill")
            List<ItemBill> items
    ) {
        this.description = description;
        this.customer = customer;
        this.items = items;
    }

    @PostConstruct
    public void init() {
        System.out.printf("Customer: %s", customer.name());
    }

    @PreDestroy
    public void destroy() {
        System.err.printf("Destroying %s", this);
    }

    @Value("${bill.description}")
    public String description() {
        return description;
    }

    public Customer customer() {
        return customer;
    }

    @Qualifier("itemOfficeBill")
    public List<ItemBill> items() {
        return items;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Bill) obj;
        return Objects.equals(this.description, that.description) &&
                Objects.equals(this.customer, that.customer) &&
                Objects.equals(this.items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, customer, items);
    }

    @Override
    public String toString() {
        return "Bill[" +
                "description=" + description + ", " +
                "customer=" + customer + ", " +
                "items=" + items + ']';
    }


}
