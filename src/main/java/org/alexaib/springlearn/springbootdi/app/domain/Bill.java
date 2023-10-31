package org.alexaib.springlearn.springbootdi.app.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record Bill(
        @Value("bill.description")
        String description,
        @Autowired
        Customer customer,
        List<ItemBill> items
) {
}
