package org.alexaib.springlearn.springbootdi.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("successService")
public class SampleService implements IServiceProvider {

    @Override
    public String operation() {
        return "operation succeeded";
    }

}
