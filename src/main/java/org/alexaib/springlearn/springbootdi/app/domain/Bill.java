package org.alexaib.springlearn.springbootdi.app.domain;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record Bill(
        @Value("bill.description")
        String description,
        @Autowired
        Customer customer,
        @Autowired
        @Qualifier("itemOfficeBill")
        List<ItemBill> items
) {

        @PostConstruct
        public void init() {
                System.out.printf("Customer: %s", customer.name());
        }

        @PreDestroy
        public void destroy() {
                System.err.printf("Destroying %s", this);
        }

}
