package com.controller.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptController {
    @RequestMapping("/intercept")
    public String intercept() {
        return "Validation";
    }

    @RequestMapping("/submit")
    public String success(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "SubmitName";
    }

}
