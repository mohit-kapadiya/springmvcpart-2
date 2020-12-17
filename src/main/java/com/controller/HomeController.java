package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    //Redirect url using 'redirect prefix'
    @RequestMapping("/home")
    public String home(){
        return "Home";
    }

    @RequestMapping("/about")
    public String about(){
        return "redirect:/home";
    }

    //Redirect url using 'RedirectView'
    @RequestMapping("/redirect1")
    public RedirectView redirect1(){
        RedirectView redirectView=new RedirectView();
        redirectView.setUrl("redirect2");
        return redirectView;
    }
    @RequestMapping("/redirect2")
    public String redirect2(){
        return "Home";
    }

}
