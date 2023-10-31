package org.alexaib.springlearn.springbootdi.app.services;

public class ComplexSampleService implements IServiceProvider {

    @Override
    public String operation() {
        return "complex operation succeeded";
    }

}
