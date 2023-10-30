package org.alexaib.springlearn.springbootdi.app.services;

import org.springframework.stereotype.Component;

@Component
public class SampleService {

    public String operation() {
        return "operation succeeded";
    }

}
