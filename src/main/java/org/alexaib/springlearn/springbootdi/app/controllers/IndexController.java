package org.alexaib.springlearn.springbootdi.app.controllers;

import org.alexaib.springlearn.springbootdi.app.services.IServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private IServiceProvider service;

    // Searches an object of the same type inside the Spring container
    @Autowired
    @Qualifier("failService")
    public void setService(IServiceProvider service) {
        this.service = service;
    }

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("result", service.operation());
        return "index";
    }

}
