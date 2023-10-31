package org.alexaib.springlearn.springbootdi.app;

import org.alexaib.springlearn.springbootdi.app.services.ComplexFailService;
import org.alexaib.springlearn.springbootdi.app.services.IServiceProvider;
import org.alexaib.springlearn.springbootdi.app.services.ComplexSampleService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {

    @Primary
    @Bean("complexSampleService")
    public IServiceProvider registerService() {
        return new ComplexSampleService();
    }

    @Bean("complexFailService")
    public IServiceProvider registerFailService() {
        return new ComplexFailService();
    }

}
