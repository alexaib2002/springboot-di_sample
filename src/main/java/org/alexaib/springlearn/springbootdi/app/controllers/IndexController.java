package org.alexaib.springlearn.springbootdi.app.controllers;

import org.alexaib.springlearn.springbootdi.app.services.IServiceProvider;
import org.alexaib.springlearn.springbootdi.app.services.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Searches an object of the same type inside the Spring container
    @Autowired
    private IServiceProvider service;

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("result", service.operation());
        return "index";
    }

}
