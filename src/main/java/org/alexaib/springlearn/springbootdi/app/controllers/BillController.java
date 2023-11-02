package org.alexaib.springlearn.springbootdi.app.controllers;

import org.alexaib.springlearn.springbootdi.app.domain.Bill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bill")
public class BillController {

    @Autowired
    private Bill bill;

    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("bill", bill);
        return "bill/view";
    }

}
