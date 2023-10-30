package org.alexaib.springlearn.springbootdi.app.services;

import org.springframework.stereotype.Component;

@Component("failOperation")
public class FailService implements IServiceProvider {

    @Override
    public String operation() {
        return "operation failed";
    }

}
