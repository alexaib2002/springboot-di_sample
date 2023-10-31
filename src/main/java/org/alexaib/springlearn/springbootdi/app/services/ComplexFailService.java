package org.alexaib.springlearn.springbootdi.app.services;

public class ComplexFailService implements IServiceProvider {

    @Override
    public String operation() {
        return "complex operation failed";
    }

}
