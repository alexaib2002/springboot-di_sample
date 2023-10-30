package org.alexaib.springlearn.springbootdi.app.controllers;

import org.alexaib.springlearn.springbootdi.app.services.SampleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // Coupled attribute
    private SampleService service = new SampleService();

    @GetMapping({"/", "", "/index"})
    public String index(Model model) {
        model.addAttribute("result", service.operation());
        return "index";
    }

}
