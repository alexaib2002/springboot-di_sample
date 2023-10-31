package org.alexaib.springlearn.springbootdi.app.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public record Customer(
        @Value("${client.name}")
        String name,
        @Value("${client.surname}")
        String surname
) {
}
