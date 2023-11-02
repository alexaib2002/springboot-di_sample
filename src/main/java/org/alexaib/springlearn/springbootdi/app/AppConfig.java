package org.alexaib.springlearn.springbootdi.app;

import org.alexaib.springlearn.springbootdi.app.domain.ItemBill;
import org.alexaib.springlearn.springbootdi.app.domain.Product;
import org.alexaib.springlearn.springbootdi.app.services.ComplexFailService;
import org.alexaib.springlearn.springbootdi.app.services.ComplexSampleService;
import org.alexaib.springlearn.springbootdi.app.services.IServiceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

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

    @Bean("itemBill")
    public List<ItemBill> registerItems() {
        return new ArrayList<>(List.of(
                new ItemBill(new Product("Camera", 100), 2),
                new ItemBill(new Product("Laptop", 450), 1)
        ));
    }

    @Bean("itemOfficeBill")
    public List<ItemBill> registerOfficeItems() {
        return new ArrayList<>(List.of(
                new ItemBill(new Product("Monitor", 200), 2),
                new ItemBill(new Product("Laptop", 500), 1),
                new ItemBill(new Product("Printer", 120), 1),
                new ItemBill(new Product("Office desk", 90), 1)
        ));
    }

}
