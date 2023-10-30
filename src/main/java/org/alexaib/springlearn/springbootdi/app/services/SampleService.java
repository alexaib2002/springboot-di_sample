package org.alexaib.springlearn.springbootdi.app.services;

import org.springframework.stereotype.Component;

@Component("successOperation")
public class SampleService implements IServiceProvider {

    @Override
    public String operation() {
        return "operation succeeded";
    }

}
